# 🎮 API de Registro de Videojuegos

## 🧾 Descripción

Este proyecto es una API REST construida con **Spring Boot** y **PostgreSQL** que permite registrar y consultar videojuegos. Está diseñado como ejercicio práctico para aprender a desarrollar APIs REST, trabajar con bases de datos relacionales, y aplicar buenas prácticas con JPA.

---

## ✅ Requisitos

- Java 17+
- Spring Boot 3+
- PostgreSQL
- Git

---

## 🛠️ Comandos y scripts necesarios

Todos los comandos, scripts o pasos necesarios para ejecutar, compilar o desplegar el proyecto deben estar claramente documentados en este repositorio.

Esto incluye, pero no se limita a:

- Comandos para crear o configurar la base de datos.
- Scripts para inicializar datos.
- Comandos para construir y ejecutar la aplicación.
- Cualquier otro paso especial necesario para que el proyecto funcione correctamente.

La falta de documentación clara puede afectar la evaluación del proyecto.

## 📌 Funcionalidades

La API debe incluir los siguientes **3 endpoints**, cada uno desarrollado por un integrante diferente del equipo:

1. `POST /api/videogames` – Registrar un nuevo videojuego  
2. `GET /api/videogames` – Obtener todos los videojuegos registrados  
3. `GET /api/videogames/{id}` – Obtener un videojuego por su ID

---

## 🔁 Endpoints

### 1️⃣ Crear un videojuego

- **Método:** `POST`  
- **Ruta:** `/api/videogames`  
- **Content-Type:** `application/json`  
- **Body de ejemplo:**

```json
{
  "name": "The Legend of Zelda: Breath of the Wild",
  "genre": "Adventure",
  "releaseYear": 2017,
  "developer": "Nintendo"
}
```

### 2️⃣ Obtener todos los videojuegos
- **Método:** `GET`  
- **Ruta:** `/api/videogames`  
- **Content-Type:** `application/json`  
- **Body de ejemplo:**

```json
[
  {
    "id": 1,
    "name": "The Legend of Zelda: Breath of the Wild",
    "genre": "Adventure",
    "releaseYear": 2017,
    "developer": "Nintendo"
  },
  {
    "id": 2,
    "name": "God of War",
    "genre": "Action",
    "releaseYear": 2018,
    "developer": "Santa Monica Studio"
  }
]
```

### 3️⃣  Obtener un videojuego por ID

- **Método:** `GET`  
- **Ruta:** `/api/videogames/{id}`  
- **Content-Type:** `application/json`  
- **Body de ejemplo:**

```json
{
  "id": 1,
  "name": "The Legend of Zelda: Breath of the Wild",
  "genre": "Adventure",
  "releaseYear": 2017,
  "developer": "Nintendo"
}
```
## 📤 Forma de entrega

### ✅ Pasos para entregar correctamente:

1. **Un solo integrante del equipo debe hacer un _fork_** de este repositorio en GitHub.
2. Luego todo el equipo debe trabajar sobre ese _fork_, haciendo `clone`, `pull` y `push` según sea necesario.
3. Todo el trabajo debe estar en el `main` o `master` branch del fork.
4. **No se aceptarán forks vacíos, sin commits, ni con evidencias de trabajo individual insuficiente.**
5. **Cada integrante debe asegurarse de aparecer en los commits** con su usuario de GitHub.
6. Es totalmente obligatorio que se apeguen al formato de respuesta solicitado en cada endpoint.
7. Al finalizar, **deben agregar un archivo `EQUIPO.md`** en la raíz del proyecto con el siguiente formato:

```markdown
# Integrantes del equipo

- **Nombre:** Andrea MAria Peña Hernandez 
  **Carnet:** 000975919  
  **Endpoint trabajado:** POST /api/videogames

- **Nombre:** Jose Alejandro Chavez  
  **Carnet:** 00149320  
  **Endpoint trabajado:** GET /api/videogames

- **Nombre:** Christian Eduardo Melgar  
  **Carnet:** 00110219  
  **Endpoint trabajado:** GET /api/videogames/{id}

## ⏰ Hora límite de entrega

La entrega se considera **cerrada a las 9:00 a.m.**.

- Solo se tomarán en cuenta los **commits que estén subidos al repositorio antes de las 9:00 a.m.**
- Commits realizados o subidos después de esa hora **no serán considerados**.
- Se recomienda comenzar a subir los cambios cuanto antes para evitar inconvenientes de último momento.
