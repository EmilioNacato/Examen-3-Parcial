# Aplicación de Lista de Tareas con Spring Boot

Esta es una aplicación de lista de tareas simple construida utilizando el framework Spring Boot. La aplicación permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en una lista de tareas.

## Configuración Inicial

1. Clona este repositorio en tu máquina local.
2. Asegúrate de tener instalado Java JDK 17 y Maven en tu sistema.
3. Abre el proyecto en tu entorno de desarrollo preferido (por ejemplo, Visual Studio Code).
4. Configura el archivo `application.properties` en `src/main/resources` con la siguiente configuración:

```properties
# Configuración de la base de datos H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true
spring.h2.console.settings.web-allow-others=true

# Configuración para permitir solicitudes desde cualquier origen (CORS)
spring.mvc.cors.allowed-origins=*
