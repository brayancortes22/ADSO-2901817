# Base de datos distribuidas

## Resumen  
Evolución de los datos y su organización:  

- **Byte → Carácter → Registro → Información → Base de Datos → Data Warehouse → Knowledge Management (ETL).**

### Tipos de Bases de Datos
```json
{
  "TiposDeBaseDeDatos": {
    "Multimodelo": [
      "ArangoDB",
      "Cosmos DB",
      "OrientDB"
    ],
    "SQL": {
      "Relacionales": [
        "PostgreSQL",
        "MySQL",
        "Oracle",
        "SQL Server"
      ],
      "OLAP": [
        "Snowflake",
        "Amazon Redshift",
        "Google BigQuery"
      ]
    },
    "NoSQL": {
      "Clave-Valor": [
        "Redis",
        "DynamoDB",
        "Memcached"
      ],
      "Documentos": [
        "MongoDB",
        "CouchDB",
        "Firestore"
      ],
      "Columnas": [
        "Cassandra",
        "HBase",
        "ScyllaDB"
      ],
      "Grafos": [
        "Neo4j",
        "JanusGraph",
        "TigerGraph"
      ]
    }
  }
}
```

## Concepto  
Una **base de datos distribuida** es una técnica que permite balancear y coordinar diferentes motores de bases de datos (SQL, NoSQL, Multimodelo).  
Su principal característica es la **delegación de funciones en distintos nodos o motores**, que en conjunto forman un **conglomerado de datos** (Data Warehouse o cubo de datos).  

Esto facilita aprovechar las fortalezas de cada motor de base de datos y lograr así un **sistema más robusto, eficiente y escalable**.

## Escalabilidad
- **Vertical:** consiste en aumentar los recursos dentro de la misma herramienta (más CPU, RAM, almacenamiento).  
- **Horizontal:** consiste en distribuir la base de datos en varios servidores o ubicaciones, lo que mejora la disponibilidad y la tolerancia a fallos.  
