# guía rápida: arquitectura simple (sin ddd)

## capas
- **controller (api)**: recibe http, valida básico y llama al servicio.
- **service (negocio)**: regla de negocio directa y orquestación simple.
- **repository (dao)**: crud contra la base de datos.
- **models/dtos**: estructuras de datos para transporte y persistencia.
- **config**: conexión a db, variables de entorno, middlewares.

## nombres por lenguaje
- **.net**: `Controllers`, `Services`, `Repositories`, `Models`, `Data` (dbcontext/migrations).
- **python**: `api/controllers`, `services`, `repositories`, `models`, `db`.
- **java**: `controller`, `service`, `repository`, `model`, `config`.
- **express**: `routes`, `controllers`, `services`, `repositories`, `models`, `db`.

## recomendaciones
- empieza con un solo proyecto/servicio. separa módulos solo si lo necesitas.
- usa migraciones desde el día uno.
- logging y manejo de errores consistentes en controller y service.
- configura pruebas unitarias mínimas para servicios y repositorios.
- agrega cache y colas solo cuando un caso real lo pida.

## diagramas
usa los `.wsd` en `diagramas/` para renderear en websequencediagrams o plantuml.
