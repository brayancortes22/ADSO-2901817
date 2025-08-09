# arquitectura robusta: microservicios ddd + hexagonal

- multilenguaje (java, .net, go, node, python) y persistencia poliglota (sql server/postgres/mongo).
- api gateway al frente; event bus para integración asíncrona.
- gitlab ci/cd construye imágenes, publica en registry y despliega a k8s (aws/azure).
- observabilidad, seguridad (oauth2/opa) y service mesh como plataforma.

ver diagramas en `diagramas/` y plantillas en `*/README.md`.
