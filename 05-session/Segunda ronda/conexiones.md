# Explicación de las relaciones entre tablas

A continuación se describen las principales relaciones entre las tablas del sistema de gestión aeroportuaria, agrupadas por módulos y explicando el propósito de cada conexión:

## 1. Geolocalización
- **continent → country → department → city → airport**: Cada aeropuerto está ubicado en una ciudad, que pertenece a un departamento, país y continente. Estas relaciones permiten ubicar geográficamente cada aeropuerto y sus operaciones.

## 2. Infraestructura
- **airport → terminal → boarding_gate**: Un aeropuerto puede tener varios terminales, y cada terminal varias puertas de embarque. Esto modela la estructura física para la gestión de vuelos y pasajeros.
- **airport → maintenance_facility → runway**: Los aeropuertos cuentan con instalaciones de mantenimiento y pistas, necesarias para la operación y el mantenimiento de aeronaves.

## 3. Gestión de vuelos
- **airline → flight → flight_schedule → flight_status**: Las aerolíneas gestionan vuelos, cada vuelo tiene una programación (horario) y un estado (programado, retrasado, etc.).
- **flight → aircraft → aircraft_type**: Cada vuelo utiliza una aeronave, que tiene un tipo/modelo definido.
- **flight → route**: Los vuelos siguen rutas específicas entre aeropuertos.
- **flight_schedule → crew_assignment → crew_member → crew_role**: La programación de vuelos incluye la asignación de tripulación, cada miembro tiene un rol (piloto, auxiliar, etc.).
- **flight_schedule → terminal/boarding_gate/runway/airport**: Cada programación de vuelo está asociada a un aeropuerto, terminal, puerta de embarque y pista específica.

## 4. Pasajeros y servicios
- **person → passenger → reservation → ticket → baggage → checkin**: Una persona puede ser pasajero, hacer reservas, obtener tiquetes, registrar equipaje y realizar el check-in. Las relaciones permiten rastrear el flujo completo del pasajero desde la reserva hasta el embarque.
- **ticket → ticket_class**: Cada tiquete tiene una clase (económica, business, etc.) que afecta servicios y políticas de equipaje.
- **baggage → ticket/passenger/airline**: El equipaje está vinculado al tiquete, pasajero y aerolínea, permitiendo aplicar políticas y límites.

## 5. Seguridad y control
- **user → person → passenger/employee**: El usuario del sistema está vinculado a una persona, que puede ser pasajero o empleado.
- **role → permission → user**: El control de acceso se gestiona por roles y permisos asignados a usuarios.

## 6. Parametrización
- **aircraft_type, flight_type, ticket_class**: Tablas de referencia que permiten parametrizar y normalizar los datos de aeronaves, tipos de vuelo y clases de tiquete.

---

Estas relaciones aseguran la integridad de los datos, permiten consultas eficientes y soportan todos los procesos operativos del sistema aeroportuario.
