# Mantenedor de Actividad de Página Web con Tiempo de Carga

Esta aplicación es una herramienta escrita en Java con Spring Boot que mantiene activa una página web mediante solicitudes GET periódicas. Esta versión incluye un tiempo de espera para que la página cargue adecuadamente y un tiempo adicional antes de la próxima solicitud.

## Dependencias

- Java 8 o superior
- Spring Boot 3.x.x
- Jsoup 1.14.3

## Configuración

1. Clona este repositorio a tu máquina local usando `git clone`.
2. Asegúrate de tener instalado Java y Maven en tu sistema.
3. Si deseas cambiar la URL a la que se hace la solicitud GET, cambia la variable `url` en `KeepWebsiteActive.java` a la URL que desees.
4. Si deseas cambiar la frecuencia con la que se hacen las solicitudes GET y los tiempos de espera, modifica los argumentos de los métodos `TimeUnit.MINUTES.sleep()` en `KeepWebsiteActive.java`.
5. Si deseas cambiar el puerto en el que se ejecuta la aplicación, añade `server.port = puerto_deseado` a `application.properties`.

## Construcción

Para construir el archivo .jar de la aplicación, navega hasta el directorio raíz del proyecto y ejecuta el comando `mvn clean package`. Esto creará un archivo .jar en el subdirectorio `target` de tu proyecto.

## Ejecución

Para ejecutar el archivo .jar, navega hasta el directorio `target` y ejecuta el comando `java -jar nombreDelArchivo.jar`.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, abre un issue o realiza un pull request si tienes algo que añadir.
