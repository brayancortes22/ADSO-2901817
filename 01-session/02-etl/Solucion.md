# ¿Qué es un proceso de ETL?

    Un proceso de ETL (Extract, Transform, Load) es una metodología utilizada en la integración de datos que implica tres etapas principales: extracción de datos de diversas fuentes, transformación de esos datos para cumplir con los requisitos del negocio y carga de los datos transformados en un sistema de almacenamiento, como un data warehouse. Este proceso es fundamental para la preparación de datos para análisis y toma de decisiones.

# Importancia de las herramientas ETL

    Las herramientas ETL son cruciales en el proceso de integración de datos, ya que permiten automatizar y optimizar las etapas de extracción, transformación y carga. Estas herramientas facilitan la conexión a diversas fuentes de datos, la limpieza y transformación de datos, y la carga eficiente en sistemas de almacenamiento. Además, las herramientas ETL pueden incluir funcionalidades de registro y gestión de errores, lo que garantiza la calidad y confiabilidad de los datos ingresados o extraídos.

# Tipos de herramientas ETL

    a) Talend Open Studio
        Ventajas: Gratuito, interfaz gráfica, soporta múltiples fuentes de datos.
        Desventajas: Requiere instalación, curva de aprendizaje moderada.
    b) Apache NiFi
        Ventajas: Open source, diseño visual de flujos, escalable.
        Desventajas: Puede ser complejo para principiantes, requiere configuración.
    c) Microsoft Power BI Dataflows
        Ventajas: Integración con Power BI, fácil de usar, visual.
        Desventajas: Limitado a ecosistema Microsoft, algunas funciones avanzadas requieren licencia.
    d) pandas
        Ventajas: Biblioteca flexible y poderosa para la manipulación de datos, fácil de integrar en flujos de trabajo de Python.
        Desventajas: Requiere conocimientos de programación en Python, no es una herramienta ETL dedicada.

# Actividad de inplementacion con pandas


    ```python

        import pandas as pd
        # se extraen o se cargan todos los datos del csv actual
        df = pd.read_csv('./airlines_flights_data.csv')
        display(df.head())

        # Realiza las transformaciones necesarias en el DataFrame
        df = df.dropna()  # Ejemplo: eliminar filas con valores nulos
        df['column_name'] = df['column_name'].str.lower()  # Ejemplo: convertir a minúsculas
        # Guarda el DataFrame transformado en un nuevo archivo CSV
        df.to_csv('./airlines_flights_data_transformed.csv', index=False)

    ```
# problemas encontrados
 encontre algunos problemas para convertir el archivo y exportarlo a limpio es decir transformado pero con ayuda del agente de ia gemini puede solucionar el error.

# herramientas utilizadas
    - pandas: biblioteca para la manipulación y análisis de datos

# Ejecución de la actividad

    - Ejecuta el código proporcionado en un entorno Python con pandas instalado.
    - Asegúrate de tener el archivo `airlines_flights_data.csv` en el mismo directorio que tu script o notebook.
    - Observa los resultados de las transformaciones aplicadas al DataFrame.
    - Puedes modificar las transformaciones según tus necesidades específicas.