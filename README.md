# Sistema de Gestión de Libros

Este proyecto implementa una aplicación de consola en Java que interactúa con la API Gutendex para buscar y gestionar libros, utilizando una base de datos PostgreSQL para almacenar la información consultada.

## Funcionalidades

El sistema proporciona las siguientes funcionalidades principales:

### 1. Buscar un libro por título

Permite buscar un libro por su título en la API Gutendex y registrar la información detallada del libro encontrado en la base de datos local.

### 2. Listar los libros registrados

Muestra todos los libros que han sido registrados previamente en la base de datos PostgreSQL, incluyendo detalles como título, autores, idioma, etc.

### 3. Listar los autores registrados

Presenta una lista de todos los autores asociados con los libros registrados en la base de datos, evitando duplicados y asegurando la integridad de los datos.

### 4. Listar los autores vivos en un año determinado

Permite consultar qué autores estaban vivos en un año específico, utilizando la información almacenada o conocida.

### 5. Listar los libros por idioma

Facilita la búsqueda y muestra todos los libros registrados en la base de datos que están disponibles en un idioma específico (ES, EN, FR o PT).

## Tecnologías Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL

## Configuración y Uso

Para ejecutar el proyecto, sigue estos pasos:

1. Clona el repositorio desde GitHub:

   ```bash
   git clone https://github.com/tu_usuario/tu-repositorio.git
2.Importa el proyecto en tu IDE favorito como un proyecto Maven.

3.Configura una base de datos PostgreSQL local y asegúrate de que esté activa.

4.Configura las credenciales de la base de datos en src/main/resources/application.properties.

5.Ejecuta la aplicación desde tu IDE o mediante Maven

## Consideraciones

El programa maneja casos de error como libros no encontrados en la API o intentos de registro de libros duplicados.
Asegúrate de tener una conexión a Internet activa para realizar consultas a la API Gutendex.
Asegúrate de tener configurada correctamente tu base de datos local para la persistencia de datos.
csharp
