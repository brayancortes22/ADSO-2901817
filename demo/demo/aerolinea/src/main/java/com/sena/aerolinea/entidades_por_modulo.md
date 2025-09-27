# Entidades por Módulo – Flight Management System

Este documento detalla las entidades principales organizadas por módulo para un sistema de gestión de vuelos. Cada módulo contiene sus respectivas entidades con sus atributos clave.

Para llevar a cabo el desarrollo de este pryecto se deben de seguir buenas practicas de arquitectura de software en este caso se usa el n capas, por lo que cada modulo debe de tener la siguiente estructura:

## Geolocation

- **continent**: id, code, name, description
- **country**: id, code, name, description, continent_id
- **state**: id, code, name, description, country_id
- **city**: id, code, name, description, state_id

## Infrastructure

- **airport**: id, code, name, address, city_id
- **terminal**: id, code, name, airport_id
- **boarding_gate**: id, code, name, terminal_id

## Parameterization

- **document_type**: id, code, name, description
- **flight_type**: id, code, name, description
- **aircraft_type**: id, code, name, description
- **crew_role**: id, code, name, description
- **ticket_class**: id, code, name, description

## Security

- **role**: id, name, description
- **module**: id, name, color, icon, path
- **form**: id, name, color, icon, path, section
- **form_module**: id, form_id, module_id
- **role_form**: id, role_id, form_id
- **person**: id, first_name, last_name, document_number, birth_date, gender, phone, email, address, attendant_name, attending_phone, document_type_id, city_id
- **user_account**: id, username, password_hash, person_id, role_id

## Human Resources

- **employee**: id, salary, hire_date, crew_role_id, person_id

## Aircraft Management

- **aircraft**: id, manufacturer, registration_code, hours_in_use, aircraft_type_id

## Flight Operations

- **flight**: id, flight_date, departure_time, arrival_time, flight_type_id, origin_boarding_gate_id, destination_boarding_gate_id, aircraft_id
- **crew_assignment**: id, flight_id, employee_id, crew_role_id
- **ticket**: id, code, flight_id, passenger_id, ticket_class_id, seat_number, price
- **baggage**: id, code, weight, ticket_id

## Passengers & Services

- **passenger**: id, frequent_flyer_number, person_id

## Notifications

- **message_template**: id, code, name, subject_template, body_template
- **notification**: id, person_id, channel, subject, message, sent_at, status

## Estructura de Módulos respecto a flujo y estructura de carpetas

estructura de cada modulo:

lo contiene en Entities --> /dto y /models , Repositories, Services, Controllers

modulos o capas:

- **Geolocation**: continent, country, state, city
- **Infrastructure**: airport, terminal, boarding_gate
- **Parameterization**: document_type, flight_type, aircraft_type, crew_role, ticket
- **Security**: role, module, form, form_module, role_form, person, user_account
- **Human Resources**: employee
- **Aircraft Management**: aircraft
- **Flight Operations**: flight, crew_assignment, ticket, baggage
- **Passengers & Services**: passenger
- **Notifications**: message_template, notification

Tipos de crud que debe de realizar cada archivo (crud basico):

- **Controllers**: CRUD completo (Create, Read, Update, Delete)
- **Services**: CRUD completo (Create, Read, Update, Delete)
- **Repositories**: Solo operaciones de lectura (Read) y creación (Create)
- **Entities (Models)**: Definición de la estructura de datos
- **Entities (DTOs)**: Definición de estructuras para transferencia de datos, generalmente para operaciones de creación y actualización (Create, Update)
- **Mappers**: Transformaciones entre Entities (Models) y DTOs

## Documentar el codigo

- Cada clase y método debe tener comentarios claros que expliquen su propósito y funcionalidad.
- Utilizar JavaDoc para generar documentación automática del código.
- Mantener un estilo de codificación consistente en todo el proyecto para mejorar la legibilidad y el mantenimiento del código.
