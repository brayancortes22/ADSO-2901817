# Priorización MoSCoW y tallaje de tareas (Aeropuerto)

| Tarea                                                                 | Prioridad | Talla | Días estimados |
|-----------------------------------------------------------------------|-----------|-------|---------------|
| Definir el modelo ER completo con todas las entidades y relaciones    | Must      | S     | 4             |
| Crear migración de base de datos para user con autenticación          | Must      | S     | 4             |
| Implementar autenticación con JWT y refresh tokens                    | Must      | S     | 4             |
| Implementar control de acceso basado en roles y permisos (RBAC)       | Must      | M     | 8             |
| Construir CRUD de person y enlace 1–1/1–N entre person y user         | Must      | S     | 4             |
| Crear CRUD de continent, country, department, city                    | Must      | S     | 4             |
| Crear CRUD de airport con validaciones de código IATA/ICAO            | Must      | S     | 4             |
| Crear CRUD de airline con validaciones de código IATA/ICAO            | Must      | S     | 4             |
| Crear CRUD de aircraft con matrícula única y aircraft_type            | Must      | S     | 4             |
| Crear CRUD de flight enlazado a airline, route, flight_type y aircraft| Must      | M     | 8             |
| Implementar flight_schedule con fechas, horas, husos horarios         | Must      | M     | 8             |
| Crear CRUD de passenger vinculado a person                            | Must      | S     | 4             |
| Crear CRUD de reservation con estado                                  | Must      | S     | 4             |
| Crear CRUD de ticket con tarifa, impuestos, ticket_class y estado     | Must      | S     | 4             |
| Implementar emisión de ticket a partir de reservation                 | Must      | S     | 4             |
| Implementar checkin online y pase de abordar                          | Must      | M     | 8             |
| Diseñar API REST v1 con OpenAPI/Swagger                               | Must      | M     | 8             |
| Construir pruebas unitarias para servicios de dominio                 | Must      | S     | 4             |
| Construir pruebas de integración para endpoints principales           | Must      | S     | 4             |
| Configurar CI con linters, pruebas y cobertura mínima                 | Must      | S     | 4             |
| Contenerizar servicios con Docker y docker-compose                    | Must      | S     | 4             |

**Total Must:** 100 días estimados (pueden ejecutarse en paralelo según equipo).

---

**Should, Could y Won't:**  
Distribuir el resto de tareas según prioridad y recursos disponibles.  
Ajusta tallas y días según el avance y la