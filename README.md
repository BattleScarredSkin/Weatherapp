# Weatherapp
Una fallida aplicación del clima con openweather API

Features(Características)
-La aplicación en sí es sencilla, basta con escoger una ciudad en concreto y luego apretar el botón de buscar. Los códigos por estados sólo son válidos para ciudades de Estados Unidos.
-Interfaz simple y fácil acceso
-Mínimo consumo de memoria y espacio de almacenamiento.


Problemas conocidos(Fallos,Bugs o Glitches)
- Api key no válida o cantidad de búsquedas llegadas al límite, generalmente al crear nuevas claves estas toman un tiempo en ser verificadas y como se trata de versiones gratis, estas toman menos prioridad en ser validadas o tienen un determinado límite de usos antes que se vuelvan obsoletas.
- El programa no compila, error Override,etc.
- Sin interfaz de configuracion para evitar la filtración de la API key, tenia pensado usar Retrofit y Kotlin ocultando la clave en gitignore.
