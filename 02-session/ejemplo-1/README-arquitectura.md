# interpretación y guía de arquitectura

## interpretación de la imagen
- se muestra un contraste entre un monolito (mvc + base de datos única) y una arquitectura distribuida donde el backend expone api y persiste en múltiples motores (sql server, mysql y nosql).
- a la derecha se lista una arquitectura por capas: entity, idto, irepository, iservice, service, controller. la api orquesta llamadas hacia servicios de aplicación, que usan entidades de dominio y repositorios para hablar con las bases. las flechas rojas simbolizan consumo vía api desde distintos clientes.
- el objetivo: separar preocupaciones, permitir escalar por componentes y admitir varios backends de datos y servicios externos.

## capas propuestas (inspiradas en ddd/clean architecture)
- **api (controller + dto)**: validación y transporte http.
- **application (service/use cases)**: orquesta reglas y coordina repositorios. contratos iservice.
- **domain (entities, value objects, events)**: reglas de negocio puras.
- **infrastructure (repositories, orm, external)**: detalles de persistencia y adaptadores a otros sistemas.
- **integrations**: conectores a pagos, erp, notificaciones, etc.
- **devops**: ci/cd, contenedores y despliegue.

## nombres de carpetas por lenguaje y recomendaciones

### c# (.net)
- api, application, domain, infrastructure, crosscutting, integrations, devops.
- usa interfaces `IRepository`, `IService` en *Application/Interfaces*. entidades en *Domain/Entities*.
- recomendación: ef core para persistencia, fluentvalidation para validaciones, mediatr si usas cqrs.

### python (fastapi)
- api (routers), services, domain, infrastructure, core.
- dtos con pydantic en `api/v1/dtos`. contratos de repos en `domain/repositories`.
- recomendación: sqlalchemy + alembic, dependency injection con fastapi `Depends`, pydantic settings para config.

### java (spring boot)
- api, application, domain, infrastructure, resources.
- interfaces de repositorio en `domain.repository` y jpa en `infrastructure.persistence.jpa`.
- recomendación: spring validation, mapstruct para dto<->entity, spring cloud si escalarás microservicios.

### express (node.js)
- api (routes/controllers), application, domain, infrastructure, shared.
- define contratos en `domain/repositories` y concretos en `infrastructure/repositories`.
- recomendación: prisma/sequelize para orm, zod o class-validator para dtos, pm2 para procesos o docker/k8s.

## cómo usar el paquete
1. elige el esqueleto de tu lenguaje y añade tus módulos de negocio dentro de **domain** y **application**.
2. crea un contrato de repositorio en *domain/repositories* y su implementación en *infrastructure/repositories*.
3. expón endpoints en *api/controllers* que consuman **services/usecases**.
4. adapta los diagramas `.wsd` según tu contexto y rinde imágenes con websequencediagrams o plantuml (modo secuencias).
