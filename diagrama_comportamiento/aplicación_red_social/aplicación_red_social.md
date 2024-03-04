# Diagrama de comportamiento

En este ejercicio procederemos a analizar el diagrama de comportamiento de la siguiente imagen: 

![image](https://github.com/liliguoz/ETS/assets/145054491/c4f40214-fb1b-4abd-a2e8-84e0497efc0e)

## Actores

#### Administrador

|  Actor | Administrador |
|---|---|
| Descripción  | Encargado de hacer todo lo posible para que la aplicación funcione  |
| Características  | Actualiza, arregla y agrega nuevos elementos a la aplicación |
| Relaciones | Eliminar publicación |
| Referencias | Gestionar aplicación |   
|  Notas |  No hay |
| Autor  | Lili Guo Zeng |
|Fecha | 29/01/2024 |

---
#### Usuario
|  Actor | Administrador |
|---|---|
| Descripción  | Usa la aplicación  |
| Características  | La da un uso a la aplicación creada |
| Relaciones |Eliminar publicación |
| Referencias | Publicar mensaje, conectar con amigos |   
|  Notas |  No hay |
| Autor  | Lili Guo Zeng |
|Fecha | 29/01/2024 |

## Casos de uso

#### Eliminar publicación

  |  Caso de Uso	CU | Eliminar publicación  |
  |---|---|
  | Fuentes  | Aplicacion de red social  |
  | Actor  |  Usuario y administrador |
  | Descripción | En este caso el usuario querrá eliminar una publicación|
  | Flujo básico | 1. El usuario se registra en la aplicación <br> 2. El administrador con los nuevos registros actualiza la aplicación <br> 3. El usuario ya dentro, publicará una publicación >br> 4. El administrador se encarga de que todas las publicaciones estén actualziadas <br> 5. El usuario posteriormente decide eliminar la publicación |
  | Pre-condiciones | Registro en la aplicación, actualización de datos de la aplicación  |  
  | Post-condiciones  | El administrador borra la publicación de la aplicación  |
  | Excepciones | 1. No se registra bien el usuario <br> 2. La aplicación no consigue actualizar los datos <br> 3. No se puede subir la publicación, ya sea por falta de internet, etc <br> 4. La publicación da error y no se puede borrar |
  |  Requerimientos | Datos de identificación, wifi, dispositivo capaz de utilizar la aplicación  |
  |  Notas |  No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 29/01/2024 |

  ---
  #### Gestionar aplicación

  |  Caso de Uso	CU | Gestionar aplicación  |
  |---|---|
  | Fuentes  | Aplicacion de red social  |
  | Actor  |  Administrador |
  | Descripción | Actualización, arreglo de fallos e implementación de nuevas herramientas en la aplicacion|
  | Flujo básico | 1. El usuario se registra en la aplicación <br> 2. El administrador con los nuevos registros actualiza la aplicación <br> 3. El usuario ya dentro, publicará una publicación <br> 4. El administrador se encarga de que todas las publicaciones estén actualizadas |
  | Pre-condiciones | Registro en la aplicación, actualización de datos de la aplicación  |  
  | Post-condiciones  | El administrador tendrá que tener la aplicación al día con todos los nuevos datos de los usuarios |
  | Excepciones | 1. No se registra bien el usuario <br> 2. La aplicación no consigue actualizar los datos <br> 3. No se puede subir la publicación, ya sea por falta de internet, etc <br> 4. La publicación da error y no se puede borrar |
  |  Requerimientos | Datos de identificación, wifi, dispositivo capaz de utilizar la aplicación  |
  |  Notas |  No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 29/01/2024 |

  ---
  #### Publicar mensaje

  |  Caso de Uso	CU | Gestionar aplicación  |
  |---|---|
  | Fuentes  | Aplicacion de red social  |
  | Actor  |  Usuario |
  | Descripción | El usuario publica mensajes que comaprtirá en sus redes|
  | Flujo básico | 1. El usuario se registra en la aplicación <br> 2. El administrador con los nuevos registros actualiza la aplicación <br> 3. El usuario ya dentro, publicará un mensaje <br> 4. El administrador se encarga de que todos los mensajes estén actualizados |
  | Pre-condiciones | Registro en la aplicación, actualización de datos de la aplicación  |  
  | Post-condiciones  | El administrador tendrá que tener la aplicación al día con todos los nuevos datos de los usuarios |
  | Excepciones | 1. No se registra bien el usuario <br> 2. La aplicación no consigue actualizar los datos <br> 3. No se puede subir la publicación, ya sea por falta de internet, etc <br> 4. La publicación da error y no se puede borrar |
  |  Requerimientos | Datos de identificación, wifi, dispositivo capaz de utilizar la aplicación  |
  |  Notas |  No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 29/01/2024 |
  
   ---
  #### Conectar con amigos

  |  Caso de Uso	CU | Conectar con amigos  |
  |---|---|
  | Fuentes  | Aplicacion de red social  |
  | Actor  |  Usuario |
  | Descripción | El usuario publica mensajes que compartirá en sus redes|
  | Flujo básico | 1. El usuario se registra en la aplicación <br> 2. El administrador con los nuevos registros actualiza la aplicación <br> 3. El usuario ya dentro, publicará un mensaje <br> 4. El administrador se encarga de que todos los mensajes estén actualizados <br>  5. El usuario podrá conectar con amigos con el uso de mensaje, videollamada o llamada | 
  | Pre-condiciones | Registro en la aplicación, actualización de datos de la aplicación  |  
  | Post-condiciones  | El administrador tendrá que tener la aplicación al día con todos los nuevos datos de los usuarios |
  | Excepciones | 1. No se registra bien el usuario <br> 2. La aplicación no consigue actualizar los datos <br> 3. No se puede subir la publicación, ya sea por falta de internet, etc <br> 4. La publicación da error y no se puede borrar |
  |  Requerimientos | Datos de identificación, wifi, dispositivo capaz de utilizar la aplicación  |
  |  Notas |  No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 29/01/2024 |

## Diagrama de secuencia

![image](https://github.com/liliguoz/ETS/assets/145054491/66a8084f-23ac-4359-ba3e-5580a6954178)

## Diagrama de actividades

![aplicación_red_social_diagr_actividades](https://github.com/liliguoz/ETS/assets/145054491/bf47a784-6c85-4b70-aa90-cba8f5ba00d0)

## Diagrama de clases

![red_social_diagr_clase](https://github.com/liliguoz/ETS/assets/145054491/b9dc625e-4450-48db-9847-14bbea4df21d)


