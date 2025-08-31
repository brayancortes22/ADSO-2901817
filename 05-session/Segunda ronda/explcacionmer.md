# Explicación del Diagrama MER

El diagrama MER (Modelo Entidad-Relación) representa la estructura lógica de la base de datos del sistema de gestión aeroportuaria. A continuación se explica la función de cada grupo de entidades y las principales relaciones:

## 1. Geolocalización
Las entidades `continent`, `country`, `department`, `city` y `airport` permiten ubicar geográficamente cada aeropuerto. La relación es jerárquica: un continente tiene varios países, cada país varios departamentos, cada departamento varias ciudades y cada ciudad puede tener uno o más aeropuertos.

## 2. Infraestructura
`airport` se relaciona con `terminal`, `boarding_gate`, `runway` y `maintenance_facility`. Esto modela la estructura física del aeropuerto, permitiendo gestionar terminales, puertas de embarque, pistas y áreas de mantenimiento.

## 3. Seguridad y usuarios
`user`, `person`, `role` y `permission` gestionan la autenticación y el control de acceso. Un usuario está vinculado a una persona, y los roles y permisos definen lo que cada usuario puede hacer en el sistema.

## 4. Gestión de vuelos
`airline`, `flight`, `flight_schedule`, `flight_status`, `aircraft`, `aircraft_type`, `route`, `crew_role`, `crew_member`, `crew_assignment` modelan la operación de vuelos. Un vuelo pertenece a una aerolínea, tiene una ruta, tipo, aeronave y programación. La tripulación se asigna a cada vuelo y cada miembro tiene un rol específico.

## 5. Pasajeros y servicios
`person` se vincula a `passenger`, que puede hacer `reservation` y obtener `ticket`. El ticket está asociado a una clase (`ticket_class`) y puede tener equipaje (`baggage`). El proceso de check-in (`checkin`) vincula al pasajero y su ticket.

## 6. Relaciones clave
- Las claves foráneas (FK) aseguran la integridad referencial entre entidades.
- Las relaciones uno a muchos (1:N) predominan, por ejemplo, un aeropuerto tiene muchas terminales, un vuelo puede tener muchos tickets.
- Las relaciones uno a uno (1:1) se usan para vincular entidades como `user` y `person`.
- Las relaciones muchos a muchos (N:M) se resuelven con tablas intermedias como `crew_assignment`.

## 7. Propósito del modelo
El MER permite organizar y consultar eficientemente la información de vuelos, pasajeros, infraestructura y operaciones, asegurando la normalización y evitando redundancia de datos. Es la base para la implementación de la base de datos y el desarrollo de la lógica de negocio del sistema aeroportuario.
