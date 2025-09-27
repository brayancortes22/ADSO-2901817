<!--
  Este archivo está redactado en español y utiliza estilos HTML para resaltar módulos, entidades y atributos.
  Sirve como guía visual para realizar el diagrama MER (rectángulos y óvalos).
-->

# <span style="color:#2c3e50;">Modelo de Datos - Sistema de Gestión de Vuelos</span>

<div style="background:#eafaf1; border-left:4px solid #16a085; padding:1em; margin-bottom:2em;">
  <strong>Convenciones:</strong><br>
  Las tablas y columnas usan <span style="color:#8e44ad; font-weight:bold;">snake_case</span> en <b>singular</b>.<br>
  Las claves primarias son <span style="color:#8e44ad; font-weight:bold;">UUID</span> generadas con <code>gen_random_uuid()</code>.<br>
  Todas las entidades incluyen los siguientes <span style="color:#e67e22; font-weight:bold;">campos de auditoría</span>: 
  <span style="color:#8e44ad; font-weight:bold;">status</span>, <span style="color:#8e44ad; font-weight:bold;">created_at</span>, <span style="color:#8e44ad; font-weight:bold;">created_by</span>, 
  <span style="color:#8e44ad; font-weight:bold;">updated_at</span>, <span style="color:#8e44ad; font-weight:bold;">updated_by</span>, 
  <span style="color:#8e44ad; font-weight:bold;">deleted_at</span>, <span style="color:#8e44ad; font-weight:bold;">deleted_by</span>.
</div>

## <span style="color:#2980b9; font-weight:bold;">Módulo: Geolocalización</span>
 - <span style="color:#16a085; font-weight:bold;">continent</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">code</span>, <span style="color:#8e44ad; font-weight:bold;">name</span>, <span style="color:#8e44ad; font-weight:bold;">description</span>
 - <span style="color:#16a085; font-weight:bold;">country</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">code</span>, <span style="color:#8e44ad; font-weight:bold;">name</span>, <span style="color:#8e44ad; font-weight:bold;">description</span>, <span style="color:#8e44ad; font-weight:bold;">continent_id</span>
 - <span style="color:#16a085; font-weight:bold;">state</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">code</span>, <span style="color:#8e44ad; font-weight:bold;">name</span>, <span style="color:#8e44ad; font-weight:bold;">description</span>, <span style="color:#8e44ad; font-weight:bold;">country_id</span>
 - <span style="color:#16a085; font-weight:bold;">city</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">code</span>, <span style="color:#8e44ad; font-weight:bold;">name</span>, <span style="color:#8e44ad; font-weight:bold;">description</span>, <span style="color:#8e44ad; font-weight:bold;">state_id</span>

## <span style="color:#2980b9; font-weight:bold;">Módulo: Infraestructura</span>
 - <span style="color:#16a085; font-weight:bold;">airport</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">code</span>, <span style="color:#8e44ad; font-weight:bold;">name</span>, <span style="color:#8e44ad; font-weight:bold;">address</span>, <span style="color:#8e44ad; font-weight:bold;">city_id</span>
 - <span style="color:#16a085; font-weight:bold;">terminal</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">code</span>, <span style="color:#8e44ad; font-weight:bold;">name</span>, <span style="color:#8e44ad; font-weight:bold;">airport_id</span>
 - <span style="color:#16a085; font-weight:bold;">boarding_gate</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">code</span>, <span style="color:#8e44ad; font-weight:bold;">name</span>, <span style="color:#8e44ad; font-weight:bold;">terminal_id</span>

## <span style="color:#2980b9; font-weight:bold;">Módulo: Parametrización</span>
 - <span style="color:#16a085; font-weight:bold;">document_type</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">code</span>, <span style="color:#8e44ad; font-weight:bold;">name</span>, <span style="color:#8e44ad; font-weight:bold;">description</span>
 - <span style="color:#16a085; font-weight:bold;">flight_type</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">code</span>, <span style="color:#8e44ad; font-weight:bold;">name</span>, <span style="color:#8e44ad; font-weight:bold;">description</span>
 - <span style="color:#16a085; font-weight:bold;">aircraft_type</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">code</span>, <span style="color:#8e44ad; font-weight:bold;">name</span>, <span style="color:#8e44ad; font-weight:bold;">description</span>
 - <span style="color:#16a085; font-weight:bold;">crew_role</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">code</span>, <span style="color:#8e44ad; font-weight:bold;">name</span>, <span style="color:#8e44ad; font-weight:bold;">description</span>
 - <span style="color:#16a085; font-weight:bold;">ticket_class</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">code</span>, <span style="color:#8e44ad; font-weight:bold;">name</span>, <span style="color:#8e44ad; font-weight:bold;">description</span>

## <span style="color:#2980b9; font-weight:bold;">Módulo: Seguridad</span>
 - <span style="color:#16a085; font-weight:bold;">role</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">name</span>, <span style="color:#8e44ad; font-weight:bold;">description</span>
 - <span style="color:#16a085; font-weight:bold;">module</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">name</span>, <span style="color:#8e44ad; font-weight:bold;">color</span>, <span style="color:#8e44ad; font-weight:bold;">icon</span>, <span style="color:#8e44ad; font-weight:bold;">path</span>
 - <span style="color:#16a085; font-weight:bold;">form</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">name</span>, <span style="color:#8e44ad; font-weight:bold;">color</span>, <span style="color:#8e44ad; font-weight:bold;">icon</span>, <span style="color:#8e44ad; font-weight:bold;">path</span>, <span style="color:#8e44ad; font-weight:bold;">section</span>
 - <span style="color:#16a085; font-weight:bold;">form_module</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">form_id</span>, <span style="color:#8e44ad; font-weight:bold;">module_id</span>
 - <span style="color:#16a085; font-weight:bold;">role_form</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">role_id</span>, <span style="color:#8e44ad; font-weight:bold;">form_id</span>
 - <span style="color:#16a085; font-weight:bold;">person</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">first_name</span>, <span style="color:#8e44ad; font-weight:bold;">last_name</span>, <span style="color:#8e44ad; font-weight:bold;">document_number</span>, <span style="color:#8e44ad; font-weight:bold;">birth_date</span>, <span style="color:#8e44ad; font-weight:bold;">gender</span>, <span style="color:#8e44ad; font-weight:bold;">phone</span>, <span style="color:#8e44ad; font-weight:bold;">email</span>, <span style="color:#8e44ad; font-weight:bold;">address</span>, <span style="color:#8e44ad; font-weight:bold;">attendant_name</span>, <span style="color:#8e44ad; font-weight:bold;">attending_phone</span>, <span style="color:#8e44ad; font-weight:bold;">document_type_id</span>, <span style="color:#8e44ad; font-weight:bold;">city_id</span>
 - <span style="color:#16a085; font-weight:bold;">user_account</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">username</span>, <span style="color:#8e44ad; font-weight:bold;">password_hash</span>, <span style="color:#8e44ad; font-weight:bold;">person_id</span>, <span style="color:#8e44ad; font-weight:bold;">role_id</span>

## <span style="color:#2980b9; font-weight:bold;">Módulo: Talento Humano</span>
 - <span style="color:#16a085; font-weight:bold;">employee</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">salary</span>, <span style="color:#8e44ad; font-weight:bold;">hire_date</span>, <span style="color:#8e44ad; font-weight:bold;">crew_role_id</span>, <span style="color:#8e44ad; font-weight:bold;">person_id</span>

## <span style="color:#2980b9; font-weight:bold;">Módulo: Gestión de Aeronaves</span>
 - <span style="color:#16a085; font-weight:bold;">aircraft</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">manufacturer</span>, <span style="color:#8e44ad; font-weight:bold;">registration_code</span>, <span style="color:#8e44ad; font-weight:bold;">hours_in_use</span>, <span style="color:#8e44ad; font-weight:bold;">aircraft_type_id</span>

## <span style="color:#2980b9; font-weight:bold;">Módulo: Operaciones de Vuelo</span>
 - <span style="color:#16a085; font-weight:bold;">flight</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">flight_date</span>, <span style="color:#8e44ad; font-weight:bold;">departure_time</span>, <span style="color:#8e44ad; font-weight:bold;">arrival_time</span>, <span style="color:#8e44ad; font-weight:bold;">flight_type_id</span>, <span style="color:#8e44ad; font-weight:bold;">origin_boarding_gate_id</span>, <span style="color:#8e44ad; font-weight:bold;">destination_boarding_gate_id</span>, <span style="color:#8e44ad; font-weight:bold;">aircraft_id</span>
 - <span style="color:#16a085; font-weight:bold;">crew_assignment</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">flight_id</span>, <span style="color:#8e44ad; font-weight:bold;">employee_id</span>, <span style="color:#8e44ad; font-weight:bold;">crew_role_id</span>
 - <span style="color:#16a085; font-weight:bold;">ticket</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">code</span>, <span style="color:#8e44ad; font-weight:bold;">flight_id</span>, <span style="color:#8e44ad; font-weight:bold;">passenger_id</span>, <span style="color:#8e44ad; font-weight:bold;">ticket_class_id</span>, <span style="color:#8e44ad; font-weight:bold;">seat_number</span>, <span style="color:#8e44ad; font-weight:bold;">price</span>
 - <span style="color:#16a085; font-weight:bold;">baggage</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">code</span>, <span style="color:#8e44ad; font-weight:bold;">weight</span>, <span style="color:#8e44ad; font-weight:bold;">ticket_id</span>

## <span style="color:#2980b9; font-weight:bold;">Módulo: Pasajeros y Servicios</span>
 - <span style="color:#16a085; font-weight:bold;">passenger</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">frequent_flyer_number</span>, <span style="color:#8e44ad; font-weight:bold;">person_id</span>

## <span style="color:#2980b9; font-weight:bold;">Módulo: Notificaciones</span>
 - <span style="color:#16a085; font-weight:bold;">message_template</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">code</span>, <span style="color:#8e44ad; font-weight:bold;">name</span>, <span style="color:#8e44ad; font-weight:bold;">subject_template</span>, <span style="color:#8e44ad; font-weight:bold;">body_template</span>
 - <span style="color:#16a085; font-weight:bold;">notification</span>: <span style="color:#8e44ad; font-weight:bold;">id</span>, <span style="color:#8e44ad; font-weight:bold;">person_id</span>, <span style="color:#8e44ad; font-weight:bold;">channel</span>, <span style="color:#8e44ad; font-weight:bold;">subject</span>, <span style="color:#8e44ad; font-weight:bold;">message</span>, <span style="color:#8e44ad; font-weight:bold;">sent_at</span>, <span style="color:#8e44ad; font-weight:bold;">status</span>
# Flight Management System – Refined Data Model (v2)

## 🧭 Conventions
- Tables and columns use **snake_case**, in **singular**.  
- Primary keys are **UUID** generated with `gen_random_uuid()` (`CREATE EXTENSION pgcrypto;`).  
- **Audit fields (7):**  
  - `status`  
  - `created_at` / `created_by`  
  - `updated_at` / `updated_by`  
  - `deleted_at` / `deleted_by`  


---

## Module: Geolocation
- **continent** {id, code, name, description}  
- **country** {id, code, name, description, continent_id}  
- **state** {id, code, name, description, country_id}  
- **city** {id, code, name, description, state_id}  

## Module: Infrastructure
- **airport** {id, code, name, address, city_id}  
- **terminal** {id, code, name, airport_id}  
- **boarding_gate** {id, code, name, terminal_id}  

## Module: Parameterization
- **document_type** {id, code, name, description}  
- **flight_type** {id, code, name, description}  
- **aircraft_type** {id, code, name, description}  
- **crew_role** {id, code, name, description}  
- **ticket_class** {id, code, name, description}  

## Module: Security
- **role** {id, name, description}  
- **module** {id, name, color, icon, path}  
- **form** {id, name, color, icon, path, section}  
- **form_module** {id, form_id, module_id}  
- **role_form** {id, role_id, form_id}  
- **person** {id, first_name, last_name, document_number, birth_date, gender, phone, email, address, attendant_name, attending_phone, document_type_id, city_id}  
- **user_account** {id, username, password_hash, person_id, role_id}  

## Module: Human Resources
- **employee** {id, salary, hire_date, crew_role_id, person_id}  

## Module: Aircraft Management
- **aircraft** {id, manufacturer, registration_code, hours_in_use, aircraft_type_id}  

## Module: Flight Operations
- **flight** {id, flight_date, departure_time, arrival_time, flight_type_id, origin_boarding_gate_id, destination_boarding_gate_id, aircraft_id}  
- **crew_assignment** {id, flight_id, employee_id, crew_role_id}  
- **ticket** {id, code, flight_id, passenger_id, ticket_class_id, seat_number, price}  
- **baggage** {id, code, weight, ticket_id}  

## Module: Passengers & Services
- **passenger** {id, frequent_flyer_number, person_id}  

## Module: Notifications
- **message_template** {id, code, name, subject_template, body_template}  
- **notification** {id, person_id, channel, subject, message, sent_at, status}  
