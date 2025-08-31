# Backlog pendiente y entregables parciales (Aeropuerto)

## Entregables parciales para 80 días

1. **Modelo ER y migraciones básicas**
   - Definir entidades principales y relaciones (S)
   - Migración de base de datos para user, person, airport, airline, aircraft, flight, passenger, reservation, ticket (S)

2. **Autenticación y control de acceso**
   - JWT, refresh tokens, RBAC con roles y permisos (M)
   - CRUD de user/person y vinculación (S)

3. **CRUDs esenciales**
   - Geolocalización: continent, country, department, city, airport (S)
   - Infraestructura: terminal, boarding_gate, runway, maintenance_facility (S)
   - Gestión de vuelos: airline, aircraft, flight, flight_schedule, passenger, reservation, ticket (S/M)

4. **Funcionalidad mínima de reservas y emisión de tickets**
   - Reserva, emisión de ticket, checkin online, pase de abordar (M)

5. **API REST y pruebas básicas**
   - Endpoints principales, OpenAPI/Swagger, pruebas unitarias e integración (S/M)
   - CI/CD básico y Docker para desarrollo (S)

6. **Documentación y seguimiento**
   - Documentar modelos, endpoints y diagramas (S)
   - Mantener backlog actualizado

---

## Backlog pendiente para siguiente ciclo

- Validaciones avanzadas (contraseña, políticas de equipaje, selección de asientos)
- CRUDs secundarios (crew, crew_assignment, flight_type, flight_status, ticket_class, baggage)
- Reportes y métricas avanzadas
- Auditoría, soft-delete, concurrencia optimista
- Notificaciones, internacionalización, backups automáticos
- Endpoints de reportes y exportaciones
- Mejoras de rendimiento y seguridad
- Pruebas end-to-end y automatización avanzada

---

**Recomendación:**
- Enfócate en los entregables parciales para tener una base funcional y presentable en 80 días.
- Todo lo que no alcances, documenta en el backlog pendiente para priorizar en el siguiente ciclo.
