# 🧠 Actividad de Aprendizaje: Análisis de Datos con Google Colab y Kaggle

## 📁 Paso 1: Crear carpeta en Google Drive

1. Abre [Google Drive](https://drive.google.com).
2. Haz clic en el botón `+ Nuevo`.
3. Selecciona `Carpeta`.
4. Escribe el nombre: `competencia-investigacion`.
5. Haz clic en `Crear`.

--- 

## 📓 Paso 2: Crear un Notebook en Google Colab

1. Abre [Google Colab](https://colab.research.google.com/).
2. Ve a la pestaña `Archivo > Nuevo cuaderno`.
3. Guarda el cuaderno en la carpeta `competencia-investigacion` de tu Google Drive.
   - Archivo → Guardar una copia en Drive
   - Mueve el archivo a la carpeta `competencia-investigacion`

---

## 📥 Paso 3: Descargar un conjunto de datos desde Kaggle

1. Ingresa a [Kaggle Datasets](https://www.kaggle.com/datasets).
2. Elige un conjunto de datos que te interese.
3. Descarga el archivo `.csv` o `.zip`.
4. Sube el archivo a la carpeta `competencia-investigacion` o directamente al entorno del notebook desde Colab (`Archivos > Subir`).

---

## 📊 Paso 4: Cargar y visualizar los datos con Pandas y Matplotlib

1. En tu notebook, importa las siguientes librerías:

```python
import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv('/ruta/a/tu/archivo.csv')  # Ajusta la ruta según el archivo subido
df.head()

# Ejemplo 1: Porcentaje de aprobados vs reprobados
aprobados = df[df['nota'] >= 3].shape[0]
reprobados = df[df['nota'] < 3].shape[0]

plt.figure(figsize=(6, 4))
plt.bar(['Aprobados', 'Reprobados'], [aprobados, reprobados], color=['green', 'red'])
plt.title('Distribución de Aprobados y Reprobados')
plt.ylabel('Cantidad de estudiantes')
plt.show()
