# Módulos y entidades

- **module_security**  
  - `user`, `role`, `permission`, `person`

- **geolocation**  
  - `continent`, `country`, `department`, `city`

- **module_infrastructure**  
  - `airport`, `terminal`, `boarding_gate`, `runway`, `maintenance_facility`

- **module_managementFlight**  
  - `airline`, `aircraft`, `route`, `flight`, `flight_schedule`, `flight_status`, `crew_role`, `crew_member`, `crew_assignment`

- **passengers_and_services**  
  - `passenger`, `reservation`, `ticket`, `baggage`, `checkin`

- **parameterization**  
  - `aircraft_type`, `flight_type`, `ticket_class`


# Backlog de tareas (lista plana)

- Definir el modelo ER completo con todas las entidades y relaciones.
- Crear migración de base de datos para `user` con autenticación y campos auditables.
- Implementar autenticación con JWT y refresh tokens.
- Implementar control de acceso basado en roles y permisos (RBAC) con `role` y `permission`.
- Construir CRUD de `person` y enlace 1–1/1–N entre `person` y `user`.
- Validar políticas de contraseña y recuperación segura de cuentas.
- Crear CRUD de `continent`, `country`, `department`, `city` con restricciones de claves foráneas.
- Cargar datos semilla para geografía (ISO) en `continent` y `country`.
- Implementar búsqueda y filtros por nombre y código en entidades de geolocalización.
- Crear CRUD de `airport` con validaciones de código IATA/ICAO.
- Crear CRUD de `terminal` vinculado a `airport`.
- Crear CRUD de `boarding_gate` vinculado a `terminal`.
- Crear CRUD de `runway` con longitudes, superficie y orientación.
- Crear CRUD de `maintenance_facility` asociado a `airport`.
- Crear CRUD de `airline` con validaciones de código IATA/ICAO.
- Crear CRUD de `aircraft` con matrícula única y referencia a `aircraft_type`.
- Crear CRUD de `aircraft_type` (modelo, fabricante, rango, capacidad).
- Crear CRUD de `route` con origen/destino (`airport`) y distancia estimada.
- Crear CRUD de `flight_type` (comercial, chárter, carga).
- Crear CRUD de `flight_status` (scheduled, delayed, departed, landed, canceled).
- Crear CRUD de `flight` enlazado a `airline`, `route`, `flight_type` y `aircraft`.
- Implementar `flight_schedule` con fechas, horas, husos horarios y periodicidad.
- Implementar validación de conflictos de `flight_schedule` por `aircraft` y `crew_member`.
- Crear CRUD de `crew_role` (captain, first_officer, attendant, engineer).
- Crear CRUD de `crew_member` vinculado a `person`.
- Implementar `crew_assignment` para asignar `crew_member` a `flight` y tramos.
- Crear CRUD de `passenger` vinculado a `person`.
- Crear CRUD de `reservation` con estado (pending, confirmed, canceled, expired).
- Implementar selección de asientos en `reservation` con control de disponibilidad por vuelo.
- Crear CRUD de `ticket` con tarifa, impuestos, `ticket_class` y estado (issued, voided, refunded).
- Crear CRUD de `ticket_class` (economy, premium, business, first) en `parameterization`.
- Implementar emisión de `ticket` a partir de `reservation`.
- Implementar política de equipaje en `baggage` según `ticket_class` y `airline`.
- Crear CRUD de `baggage` con pesos/volúmenes y validación de límites.
- Implementar `checkin` online con selección/confirmación de asiento y generación de pase de abordar.
- Generar código de barras/QR para pase de abordar y asociarlo a `ticket`.
- Implementar reglas de `flight_status` automáticas por eventos (check-in abierto, embarque, salida, llegada).
- Diseñar API REST v1 con OpenAPI/Swagger para todos los recursos.
- Añadir paginación, ordenamiento y filtros consistentes en endpoints.
- Implementar validación y sanitización de entrada a nivel de DTO/esquemas.
- Implementar auditoría (creado/actualizado/eliminado por) en todas las tablas.
- Añadir control de concurrencia optimista con `version` o `updated_at`.
- Implementar soft-delete donde aplique y endpoints para restauración.
- Añadir índices compuestos para consultas críticas (rutas, horarios, disponibilidad).
- Construir pruebas unitarias para servicios de dominio y repositorios.
- Construir pruebas de integración para endpoints principales.
- Configurar CI con ejecución de linters, pruebas y cobertura mínima.
- Contenerizar servicios con Docker y definir `docker-compose` para dev.
- Gestionar secretos y variables de entorno para entornos dev/qa/staging/prod.
- Implementar logs estructurados y trazabilidad con correlación de requests.
- Añadir métricas de salud y endpoints `/health` y `/ready`.
- Implementar rate limiting y protección básica contra abuso en la API.
- Añadir CORS configurable por entorno.
- Implementar caché para catálogos (`aircraft_type`, `ticket_class`, `flight_status`).
- Diseñar job para expiración automática de `reservation` por timeout de pago.
- Implementar proceso de reacomodación por `flight_status = canceled` (rebooking).
- Implementar cálculo de tiempos de conexión en rutas con escalas.
- Implementar verificación de conflictos de `runway` por horario y mantenimiento.
- Implementar módulo de mantenimiento preventivo de `aircraft` con bloqueo en scheduling.
- Implementar notificaciones de estado de vuelo a pasajeros (email/SMS) (infra lista, sin proveedores).
- Añadir internacionalización (i18n) de mensajes de API.
- Diseñar estrategia de versionado de API y deprecación controlada.
- Implementar backups automáticos y restauración verificada de la base de datos.
- Documentar modelos de datos y diagramas actualizados para el equipo.
- Preparar dataset semilla para ambientes de QA con casos representativos.
- Implementar servicio de cálculo de tarifa base + impuestos + tasas por aeropuerto.
- Implementar búsqueda de vuelos por fecha, origen, destino, `ticket_class` y pasajeros.
- Implementar disponibilidad de asientos por vuelo y sincronización con reservas.
- Implementar endpoint para historial de `flight_status` y eventos del vuelo.
- Implementar verificación de identidad básica para `checkin` (documento y nombre).
- Añadir monitoreo de tiempos de respuesta y alertas por umbrales.
- Implementar política de retención/anonimización de datos personales en `person` y `passenger`.
- Crear documentación de uso de la API para clientes internos/externos.
- Implementar endpoint de reporte: ocupación por vuelo y por `ticket_class`.
- Implementar endpoint de reporte: puntualidad por `airline` y ruta.
- Implementar endpoint de reporte: equipaje extra cobrado por período.
- Añadir pruebas end-to-end del flujo reserva → emisión → check-in → embarque.
- Implementar mecanismo de idempotencia para operaciones sensibles (emisión, check-in).
- Añadir validación de huso horario y horario de verano en `flight_schedule`.
- Implementar bloqueo transaccional para asignación de asientos y emisión de tickets.
- Implementar exportación CSV/JSON de reservas y tickets para conciliación.
- Crear script de migración de datos para catálogos iniciales.
- Añadir documentación de despliegue y runbook de operaciones.
