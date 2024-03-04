# Diagrama de comportamiento

En este ejercicio procederemos a analizar el diagrama de comportamiento de la siguiente imagen: 

![image](https://github.com/liliguoz/ETS/assets/145054491/92d1b2f6-df6e-42a9-a3de-0b414c591ea4)

## Actores 

#### Pasajero
|  Actor | Pasajero |
|---|---|
| Descripción  | Persona que utiliza el sistema de reserva de vuelos  |
| Características  | Comsumidor que realiza y aprovecha el sistema de reserva |
| Relaciones | Gestión de la maleta  |
| Referencias | Búsqueda de vuelo, reserva de vuelo y gestión de maletas |   
|  Notas |  No hay |
| Autor  | Lili Guo Zeng |
|Fecha | 22/01/2024 |

---

#### Agente de reservas
|  Actor | Agente de reservas |
|---|---|
| Descripción  | Persona que se encarga de la gestión de las reservas  |
| Características  | Este actos se encargará de preparar, actualizar y cancelar las reservas que no se puedan dar |
| Relaciones | Gestión de la maleta  |
| Referencias | Actualización de vuelos, cancelación de vuelos y gestión de la maleta |   
|  Notas |  No hay |
| Autor  | Lili Guo Zeng |
|Fecha | 22/01/2024 |

## Casos de uso

#### Gestión de la maleta

|  Caso de Uso	CU | Gestión de la maleta  |
|---|---|
| Fuentes  | Reserva de vuelos |
| Actor  |  Pasajero y agente de reservas |
| Descripción | Gestión de trámites por los cuales una maleta tiene que ser aceptada para entrar  |
| Flujo básico | 1. El agente dentrá que tener todos los vuelos actualizados <br> 2. El pasajero decidirá cuál es el mejor para él en lo que respecta a su situación <br> 3. Trámites corresponientes de la maleta <br> 4. El agente deberá de concretar en el billete del avión la maleta que llevará con el máximo de kilos |
| Pre-condiciones | El pasajero debe haber comprado el billete con las especificaciones de su maleta sin sobrepasar los máximos de peso, además deberá aportar la documentación correspondiente apra ser identificado  |  
| Post-condiciones  | Una vez hecho todo lo anterior de forma corresta, el pasajero lo unico que puede hacer es esperar a llegar a su destino y ahí esperar a que su maleta llegue a la cinta para poder recogerla  |  
| Excepciones | 1. No se consigue hacer la compra <br> 2. Hay errores la actualización de vuelos <br> 3. La web da fallas a nivel diseño <br> 4. No se especifica el tipo de maleta que de debe llevar |
|  Requerimientos | DNI y billete de avión  |
|  Notas |  No hay |
| Autor  | Lili Guo Zeng |
|Fecha | 22/01/2024 |

  ---

  #### Búsqueda de vuelos
  |  Caso de Uso	CU | Busqueda de vuelos  |
  |---|---|
  | Fuentes  | Reserva de vuelos |
  | Actor  |  Pasajero  |
  | Descripción | Momento inicial donde se buscan ofertas de vuelos diferentes  |
  | Flujo básico | 1. El pasajero busca un vuelo a un destino <br> 2. Buscará el vuelo por un buscador |
  | Pre-condiciones | Ganas/Deber ir de viaje  |  
  | Post-condiciones  | Una vez encontrado el vuelo deberá pagarlo y aportar la documentación necesaria  |  
  | Excepciones | 1. Hay errores la actualización de vuelos <br> 2. La web da fallas a nivel diseño |
  |  Requerimientos | DNI y dinero  |
  |  Notas |  No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 22/01/2024 |

  ---

  #### Reservar vuelos
  |  Caso de Uso	CU | Reservar vuelos  |
  |---|---|
  | Fuentes  | Reserva de vuelos |
  | Actor  |  Pasajero  |
  | Descripción | Se formaliza la reserva del vuelo  |
  | Flujo básico | 1. Los agentes de vuelos actualizan los vuelos|
  |              | 2. El pasajero decidirá cuál es la que más le gusta reservará el billete |
  | Pre-condiciones | Ganas/Deber ir de viaje  |  
  | Post-condiciones  | Una vez encontrado el vuelo deberá pagarlo y aportar la documentación necesaria  |
  | Excepciones | 1. No se consigue hacer la compra <br> 2. Hay errores la actualización de vuelos <br> 3. La web da fallas a nivel diseño <br> 4. No se especifica el tipo de maleta que de debe llevar |
  |  Requerimientos | DNI y dinero  |
  |  Notas |  No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 22/01/2024 |

  ---

  #### Actualización de vuelos
  |  Caso de Uso	CU | Actualziación de vuelos  |
  |---|---|
  | Fuentes  | Reserva de vuelos |
  | Actor  |  Agentes de reservas  |
  | Descripción | Se actualizan los precios, horarios, etc de los vuelos  |
  | Flujo básico | 1. Los agentes de vuelos tendrán que gestionar toda la información para poder ser mostrada al público |
  | Pre-condiciones | Información de los vuelos  |  
  | Post-condiciones  | Una vez actualizados los datos de los vuelos serán actualizados en la página web |  
  | Excepciones | 1. La web da fallas a nivel diseño <br> 2. Hay errores la actualización de vuelos |
  |  Requerimientos | Información  |
  |  Notas |  No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 22/01/2024 |
  
  ---

  #### Cancelación de vuelos
  |  Caso de Uso	CU | Cancelación de vuelos  |
  |---|---|
  | Fuentes  | Reserva de vuelos |
  | Actor  |  Agentes de reservas  |
  | Descripción | Momento en el cuál el vuelo por diferentes razones se tiene que cancelar  |
  | Flujo básico | 1. Los agentes de reservas tendrá todos los datos actualizados <br> 2. El pasajero buscará una oferta de vuelo que quiera <br> 3. Se reserva el vuelo con toda la gestión de la maleta <br> 4. Puede que en algún momento este vuelo se cancele por diferentes razones|  
  | Pre-condiciones | Situación adversa que impida el despegue del avión  | 
  | Post-condiciones  | Se le dará aviso a los pasajero y se procederá a ejecutar lo que la empresa tenga previsto para estos casos | 
  | Excepciones | 1. No se consigue hacer la compra <br> 2. Hay errores la actualización de vuelos <br> 3. La web da fallas a nivel diseño <br> 4. No se especifica el tipo de maleta que de debe llevar <br> 5. Errores de registro de datos |
  |  Requerimientos | Información, billete de avión, DNI, dinero  |
  |  Notas |  No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 22/01/2024 |

## Diagrama de secuencia

![image](https://github.com/liliguoz/ETS/assets/145054491/582b7296-5174-462f-9b51-818acab6ecb0)

## Diagrama de actividad

![reserva_diagr_actividad](https://github.com/liliguoz/ETS/assets/145054491/7504788e-05e9-4469-b623-a6d2bd6d4969)

## Diagrama de clases

![vuelo_diagr_clase](https://github.com/liliguoz/ETS/assets/145054491/adf76d0e-58b4-41b7-9f45-9963c4232b5c)


