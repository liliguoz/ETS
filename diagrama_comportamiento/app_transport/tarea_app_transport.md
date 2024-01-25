# Diagrama de comportamiento

En este ejercicio procederemos a analizar el diagrama de comportamiento de la siguiente imagen: 

![Diagrama de comportamiento](image.png)

## Actores

|  Actor | Usuario |
|---|---|
| Descripción  | Se encarga de utilizar la aplicación|
| Características  | Es una persona que le datrá uso a la aplicación y le dará diferentes usos |
| Relaciones | Se relaciona con el administrador al darse de baja y alta y con el  sistema externo de posicionamiento al geolocalizarse|
| Referencias | Se da de baja y alta, se hace el login, busca su destino y modifica la ruta que quiere además de el geoposicionamiento |   
| Autor  | Lili Guo Zeng |
|Fecha |16/01/2024 |


## Casos de uso

  |  Caso de Uso	CU | Definir destino |
  |---|---|
  | Fuentes  | App_transport  |
  | Actor  |  Usuario |
  | Descripción | En este caso de uso el usuario concretará el destino al cual quiere llegar el usuario en la aplicación  |
  | Flujo básico | 1. La aplicación deberá de estar previamente actualizada y bien documentada por los adminsitradores para su correcta ejecución. 
  |              | 2. El usuario deberá de darse de alta y inicar sesión en la app para poder acceder a ella con su documentación. 
  |              | 3. El usuario deberá de concretar su geolocalización y el lugar de destino.
  |              | 4. El sistema recabará toda la información que tiene para darle diferentes opciones para llegar a el destino. 
  |              | 5. El usuario será el encargado de elegir cuál es el más óptimo |
  | Pre-condiciones | Los administradores deben de haber hecho su trabajo previamente, el usuario tendrá que darse de alta, seguidamente tendrá que poner su geolocalización para finalmente poner el destino al cual quiere llegar el usuario |  
  | Post-condiciones  | Una vez propuestas las distintas rutas, el usuario deberá de elegir cuál es la que quiere |  
  |Excepción|1. Puede no actualizarse bien por parte de los administradores al no haber actualizado bien la app.|
  |         |2. Puede dar error al no haber insertado bien los datos de identificación.
  |         |3. El sistema de geolocalización puede fallar al no tener señal.
  |  Requerimientos | El usuario debe de tener una cuenta en la app, además de tener activida la geolocalizaión para que la app puede acceder a ella para generar las posibles rutas posibles |
  |  Notas |  No hay notas adicionales |
  | Autor  | Lili Guo Zeng |
  |Fecha | 16/01/2024 |



