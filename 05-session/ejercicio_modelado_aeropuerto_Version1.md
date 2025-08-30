# ✈️ Ejercicio Integral de Modelado — Aeropuerto Internacional

Este documento resume todo lo que debes resolver para el ejercicio de modelado de la base de datos del sistema de gestión de un aeropuerto internacional, incluyendo lo solicitado en la última consigna. Aquí encontrarás:  
- Entidades, atributos y relaciones (cardinalidad)  
- Gráfico de dominio  
- Casos de uso  
- Diagrama de clases  
- Diagrama de secuencia  
- Mejoras de la base de datos y normalización  
- Pautas para los diagramas y entregables

---

## 1. **Entidades y Atributos**

Agrupadas por dominio:

### 🗺️ Geolocalización
- **Continente** (id, nombre, descripcion)
- **País** (id, nombre, descripcion, continente_id)
- **Estado** (id, nombre, descripcion, pais_id)
- **Municipio** (id, nombre, descripcion, estado_id)
- **Ciudad** (id, nombre, descripcion, municipio_id)
- **Aeropuerto** (id, nombre, direccion, ciudad_id)
- **Terminal** (id, codigo, nombre, aeropuerto_id)
- **Puerta_Embarque** (id, codigo, nombre, terminal_id)

### 🛡️ Seguridad
- **Persona** (id, tipo_documento, numero_documento, nombre, apellido, fecha_nacimiento, correo, numero_celular)
- **Empleado** (id, salario, rol, persona_id)
- **Pasajero** (id, persona_id)
- **Acceso_Seguridad** (id, empleado_id, aeropuerto_id, nivel_acceso, fecha_registro)
- **Control_Equipaje** (id, equipaje_id, estado_revision, fecha_revision, empleado_id)

### 🛠️ Gestión
- **Programacion** (id, fecha_vuelo, hora_salida, hora_llegada, tipo_vuelo, origen_puerta_embarque_id, destino_puerta_embarque_id, aeronave_id)
- **Venta_Tiquetes** (id, fecha_venta, empleado_id, pasajero_id, boleto_id, medio_pago)
- **Novedad** (id, descripcion, fecha, tipo_novedad, programacion_id, empleado_id)
- **Equipaje** (id, codigo, pasajero_id, peso, dimensiones, estado)
- **Boleto** (id, codigo, programacion_id, pasajero_id, asiento, clase)
- **Tripulacion** (id, empleado_id, programacion_id, rol_tripulacion)

### ⚙️ Parametrización
- **Tipo_Aeronave** (id, codigo, nombre)
- **Aeronave** (id, fabricante, matricula, horas_uso, tipo_aeronave_id)
- **Tipo_Vuelo** (id, nombre, descripcion)
- **Medio_Pago** (id, tipo, descripcion)
- **Clase_Asiento** (id, nombre, descripcion)
- **Estado_Equipaje** (id, nombre, descripcion)

---

## 2. **Cardinalidad de las Relaciones**

- Continente 1 --- N País
- País 1 --- N Estado
- Estado 1 --- N Municipio
- Municipio 1 --- N Ciudad
- Ciudad 1 --- N Aeropuerto
- Aeropuerto 1 --- N Terminal
- Pasajero 1 --- N Boleto
- Venta_Tiquetes N --- 1 Boleto

---
- **Gestión:** Programacion, Tripulacion, Venta_Tiquetes, Novedad, Equipaje, Boleto
- **Parametrización:** Tipo_Aeronave, Aeronave, Tipo_Vuelo, Clase_Asiento, Medio_Pago, Estado_Equipaje

## 1. **Entities and Attributes**

Grouped by domain:

### 🗺️ Geolocation
- **Continent** (id, name, description)
- **Country** (id, name, description, continent_id)
- **State** (id, name, description, country_id)
- **Municipality** (id, name, description, state_id)
- **City** (id, name, description, municipality_id)
- **Airport** (id, name, address, city_id)
- **Terminal** (id, code, name, airport_id)
- **BoardingGate** (id, code, name, terminal_id)

### 🛡️ Security
- **Person** (id, document_type, document_number, first_name, last_name, birth_date, email, phone_number)
- **Employee** (id, salary, role, person_id)
- **Passenger** (id, person_id)
- **SecurityAccess** (id, employee_id, airport_id, access_level, registration_date)
- **BaggageControl** (id, baggage_id, review_status, review_date, employee_id)

### 🛠️ Management
- **FlightSchedule** (id, flight_date, departure_time, arrival_time, flight_type, origin_boarding_gate_id, destination_boarding_gate_id, aircraft_id)
- **TicketSale** (id, sale_date, employee_id, passenger_id, ticket_id, payment_method)
- **Incident** (id, description, date, incident_type, flight_schedule_id, employee_id)
- **Baggage** (id, code, passenger_id, weight, dimensions, status)
- **Ticket** (id, code, flight_schedule_id, passenger_id, seat, class)
- **Crew** (id, employee_id, flight_schedule_id, crew_role)

### ⚙️ Parameterization
- **AircraftType** (id, code, name)
- **Aircraft** (id, manufacturer, registration, usage_hours, aircraft_type_id)
- **FlightType** (id, name, description)
- **PaymentMethod** (id, type, description)
- **SeatClass** (id, name, description)
- **BaggageStatus** (id, name, description)

1. **Registrar Vuelo**

## 2. **Relationship Cardinality**

- Continent 1 --- N Country
- Country 1 --- N State
- State 1 --- N Municipality
- Municipality 1 --- N City
- City 1 --- N Airport
- Airport 1 --- N Terminal
- Terminal 1 --- N BoardingGate
- AircraftType 1 --- N Aircraft
- FlightType 1 --- N FlightSchedule
- SeatClass 1 --- N Ticket
- Aircraft 1 --- N FlightSchedule
- FlightSchedule 1 --- N Ticket
- FlightSchedule 1 --- N Crew
- Ticket 1 --- N Baggage
- Passenger 1 --- N Ticket
- TicketSale N --- 1 Ticket
- Incident N --- 1 FlightSchedule
- Person 1 --- 1 Employee
- Person 1 --- 1 Passenger
- Baggage 1 --- N BaggageControl
- Employee 1 --- N SecurityAccess
## 5. **Diagrama de Clases (Estructura básica)**

```plaintext
[Continente] 1--*[País] 1--*[Estado] 1--*[Municipio] 1--*[Ciudad] 1--*[Aeropuerto] 1--*[Terminal] 1--*[Puerta_Embarque]
[Tipo_Aeronave] 1--*[Aeronave] 1--*[Programacion] 1--*[Boleto] 1--*[Equipaje]
[Persona] 1--1 [Empleado]
[Persona] 1--1 [Pasajero]
[Empleado] 1--*[Tripulacion]
[Programacion] 1--*[Tripulacion]
[Programacion] 1--*[Novedad]
[Empleado] 1--*[Acceso_Seguridad]
[Equipaje] 1--*[Control_Equipaje]
[Venta_Tiquetes] *--1 [Boleto]

## 5. **Class Diagram (Basic Structure)**

```plaintext
[Continent] 1--*[Country] 1--*[State] 1--*[Municipality] 1--*[City] 1--*[Airport] 1--*[Terminal] 1--*[BoardingGate]
[AircraftType] 1--*[Aircraft] 1--*[FlightSchedule] 1--*[Ticket] 1--*[Baggage]
[Person] 1--1 [Employee]
[Person] 1--1 [Passenger]
[Employee] 1--*[Crew]
[FlightSchedule] 1--*[Crew]
[FlightSchedule] 1--*[Incident]
[Employee] 1--*[SecurityAccess]
[Baggage] 1--*[BaggageControl]
[TicketSale] *--1 [Ticket]
```

_Each class has its main attributes (id, name, etc.) and its relationships (associations, aggregations)._
```


## 8. **Deliverables**

- **ER Diagram**: Entities, attributes (PK, FK), relationships and cardinalities.
- **Domain Diagram**: Grouping by functional areas.
- **Use Cases**: Text and/or UML diagram.
- **Class Diagram**: In UML (Draw.io, Lucidchart, Creately, etc).
- **Sequence Diagram**: In UML (Draw.io, Lucidchart, Creately, etc).
- **Normalized Relational Model**: List of tables with keys and relationships.
- **.png/.pdf File**: Exported diagrams for delivery.

1. Pasajero solicita compra de tiquete.
2. Empleado consulta programaciones disponibles.
3. Empleado registra datos del pasajero.
4. Sistema crea boleto y asocia al pasajero y programacion.
5. Empleado confirma venta y sistema registra venta_tiquetes.

```plaintext
Pasajero -> Empleado: Solicita compra
Empleado -> Sistema: Busca programaciones
Sistema -> Empleado: Lista de vuelos
Empleado -> Sistema: Registra datos pasajero
Sistema -> Boleto: Crea boleto
Sistema -> Venta_Tiquetes: Registra venta
Empleado -> Pasajero: Entrega tiquete
```

---

## 7. **Mejoras de la Base de Datos y Normalización**

- **1ra Forma Normal (1FN):** Todos los atributos son atómicos, sin listas ni valores compuestos.
- **2da Forma Normal (2FN):** Todas las entidades dependen completamente de la PK.
- **3ra Forma Normal (3FN):** No hay dependencias transitivas.

**Mejoras propuestas:**
- Todas las claves foráneas correctamente definidas.
- Separar atributos compuestos (nombre/apellido).
- No redundar datos personales (Persona es referenciada por Empleado/Pasajero).
- Relación clara entre Boleto, Programacion, Pasajero.
- Equipaje referenciado por Pasajero y Boleto.
- Control_Equipaje vincula Equipaje y Empleado.
- Venta_Tiquetes vincula Boleto, Empleado, Pasajero y Medio_Pago.

---

## 8. **¿Qué hay que entregar?**

- **Diagrama MER**: Entidades, atributos (PK, FK), relaciones y cardinalidades.
- **Gráfico de dominio**: Agrupación por áreas funcionales.
- **Casos de uso**: Texto y/o diagrama UML.
- **Diagrama de clases**: En UML (Draw.io, Lucidchart, Creately, etc).
- **Diagrama de secuencia**: En UML (Draw.io, Lucidchart, Creately, etc).
- **Modelo relacional normalizado**: Listado de tablas con claves y relaciones.
- **Archivo .png/.pdf**: Diagramas exportados para entrega.

---

¿Listo para avanzar?  
Puedes copiar la estructura y empezar a dibujar los diagramas en la herramienta UML de tu preferencia.
Si necesitas ejemplos visuales, ¡avísame y te ayudo a generarlos!
