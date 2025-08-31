
# 🗄️ Normalized Relational Model (Tables & Attributes)

## Explicación de las tablas y conexiones

Este modelo relacional normalizado está diseñado para el sistema de gestión de un aeropuerto internacional. Cada tabla representa una entidad clave del dominio y las relaciones (conexiones) entre tablas se establecen mediante claves foráneas (FK), garantizando la integridad referencial y soportando la lógica de negocio. Resumen:

- **Tablas de geolocalización** (`Continent`, `Country`, `State`, `Municipality`, `City`, `Airport`, `Terminal`, `BoardingGate`): Modelan la estructura jerárquica de ubicaciones, permitiendo rastrear aeropuertos y sus instalaciones hasta el nivel de puerta de embarque. Cada tabla se vincula a su superior mediante una clave foránea, por ejemplo, `Country` referencia a `Continent`.

- **Tablas de seguridad** (`Person`, `Employee`, `Passenger`, `SecurityAccess`, `BaggageControl`): `Person` es la base para `Employee` y `Passenger`, evitando redundancia de datos. El acceso de seguridad y el control de equipaje se vinculan a empleados y otras entidades relevantes para rastrear operaciones de seguridad.

- **Tablas de gestión** (`FlightSchedule`, `TicketSale`, `Incident`, `Baggage`, `Ticket`, `Crew`): Gestionan la programación de vuelos, venta de tiquetes, incidentes, equipaje y asignación de tripulación. Las claves foráneas conectan tiquetes con vuelos y pasajeros, equipaje con tiquetes y pasajeros, y tripulación con empleados y vuelos.

- **Tablas de parametrización** (`AircraftType`, `Aircraft`, `FlightType`, `PaymentMethod`, `SeatClass`, `BaggageStatus`): Almacenan datos de referencia para aeronaves, tipos de vuelo, métodos de pago, clases de asiento y estado de equipaje, permitiendo configuración flexible y normalización.

**Conexiones (Relaciones):**
- La mayoría de conexiones son uno a muchos (1:N), por ejemplo, un `Country` tiene muchos `States`, un `FlightSchedule` tiene muchos `Tickets`.
- Algunas son uno a uno (1:1), por ejemplo, una `Person` es un `Employee` o un `Passenger`.
- Las relaciones muchos a uno (N:1) se representan mediante claves foráneas en las tablas hijas.
- Todas las claves foráneas están definidas explícitamente para mantener la integridad de los datos y permitir consultas entre dominios.

**Tablas creadas:**
El modelo incluye las siguientes tablas:
Continent, Country, State, Municipality, City, Airport, Terminal, BoardingGate, Person, Employee, Passenger, SecurityAccess, BaggageControl, FlightSchedule, TicketSale, Incident, Baggage, Ticket, Crew, AircraftType, Aircraft, FlightType, PaymentMethod, SeatClass, BaggageStatus.

Cada tabla está normalizada al menos a tercera forma normal (3FN), asegurando atributos atómicos, sin dependencias parciales ni transitivas.

## Explanation of Tables and Connections

This normalized relational model is designed for an international airport management system. Each table represents a key entity in the domain, and the relationships (connections) between tables are established through foreign keys (FK), ensuring referential integrity and supporting business logic. Below is a summary:

- **Geolocation tables** (`Continent`, `Country`, `State`, `Municipality`, `City`, `Airport`, `Terminal`, `BoardingGate`): These tables model the hierarchical structure of locations, allowing the system to track airports and their facilities down to the boarding gate level. Each table is linked to its parent via a foreign key, e.g., `Country` references `Continent`.

- **Security tables** (`Person`, `Employee`, `Passenger`, `SecurityAccess`, `BaggageControl`): `Person` is the base for both `Employee` and `Passenger`, avoiding data redundancy. Security access and baggage control are linked to employees and other relevant entities to track security operations.

- **Management tables** (`FlightSchedule`, `TicketSale`, `Incident`, `Baggage`, `Ticket`, `Crew`): These tables handle flight programming, ticket sales, incidents, baggage, and crew assignments. Foreign keys connect tickets to flights and passengers, baggage to tickets and passengers, and crew to employees and flights.

- **Parameterization tables** (`AircraftType`, `Aircraft`, `FlightType`, `PaymentMethod`, `SeatClass`, `BaggageStatus`): These tables store reference data for aircraft, flight types, payment methods, seat classes, and baggage status, supporting flexible configuration and normalization.

**Connections (Relationships):**
- Most connections are one-to-many (1:N), e.g., one `Country` has many `States`, one `FlightSchedule` has many `Tickets`.
- Some are one-to-one (1:1), e.g., one `Person` is one `Employee` or one `Passenger`.
- Many-to-one (N:1) relationships are represented by foreign keys in child tables.
- All foreign keys are explicitly defined to maintain data integrity and support queries across domains.

**Created Tables:**
The model includes the following tables:
Continent, Country, State, Municipality, City, Airport, Terminal, BoardingGate, Person, Employee, Passenger, SecurityAccess, BaggageControl, FlightSchedule, TicketSale, Incident, Baggage, Ticket, Crew, AircraftType, Aircraft, FlightType, PaymentMethod, SeatClass, BaggageStatus.

Each table is normalized to at least third normal form (3NF), ensuring atomic attributes, no partial dependencies, and no transitive dependencies.

| Table            | Attributes                                                                 |
|------------------|----------------------------------------------------------------------------|
| Continent        | id (PK), name, description                                                 |
| Country          | id (PK), name, description, continent_id (FK)                              |
| State            | id (PK), name, description, country_id (FK)                                |
| Municipality     | id (PK), name, description, state_id (FK)                                  |
| City             | id (PK), name, description, municipality_id (FK)                           |
| Airport          | id (PK), name, address, city_id (FK)                                       |
| Terminal         | id (PK), code, name, airport_id (FK)                                       |
| BoardingGate     | id (PK), code, name, terminal_id (FK)                                      |
| Person           | id (PK), document_type, document_number, first_name, last_name, birth_date, email, phone_number |
| Employee         | id (PK), salary, role, person_id (FK)                                      |
| Passenger        | id (PK), person_id (FK)                                                    |
| SecurityAccess   | id (PK), employee_id (FK), airport_id (FK), access_level, registration_date|
| BaggageControl   | id (PK), baggage_id (FK), review_status, review_date, employee_id (FK)     |
| FlightSchedule   | id (PK), flight_date, departure_time, arrival_time, flight_type (FK), origin_boarding_gate_id (FK), destination_boarding_gate_id (FK), aircraft_id (FK) |
| TicketSale       | id (PK), sale_date, employee_id (FK), passenger_id (FK), ticket_id (FK), payment_method |
| Incident         | id (PK), description, date, incident_type, flight_schedule_id (FK), employee_id (FK) |
| Baggage          | id (PK), code, passenger_id (FK), weight, dimensions, status               |
| Ticket           | id (PK), code, flight_schedule_id (FK), passenger_id (FK), seat, class     |
| Crew             | id (PK), employee_id (FK), flight_schedule_id (FK), crew_role              |
| AircraftType     | id (PK), code, name                                                        |
| Aircraft         | id (PK), manufacturer, registration, usage_hours, aircraft_type_id (FK)    |
| FlightType       | id (PK), name, description                                                 |
| PaymentMethod    | id (PK), type, description                                                 |
| SeatClass        | id (PK), name, description                                                 |
| BaggageStatus    | id (PK), name, description                                                 |
