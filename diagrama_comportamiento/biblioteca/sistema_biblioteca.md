# Diagrama de comportamiento

En este ejercicio procederemos a analizar el diagrama de comportamiento de la siguiente imagen: 

![biblioteca](biblioteca.drawio.png)

## Actores

#### Bibliotecario

|  Actor | Bibliotecario |
|---|---|
| Descripción  | Sujeto que trabaja como un bibliotecario  |
| Características  | Empleado de una biblibioteca que se encarga de los clientes de la biblioteca |
| Relaciones | Login, buscar libro prestar libro  |
| Referencias | Realiza la búsqueda de libro, login y prestar libro|   
|  Notas |  No hay |
| Autor  | Lili Guo Zeng |
|Fecha | 21/01/2024 |

---
#### Usuario

|  Actor | Usuario |
|---|---|
| Descripción  | Sujeto que va a la bibliotecario  |
| Características  | Persona que va a la biblioteca para usar las instalaciones y recursos que presta la biblioteca |
| Relaciones | Login, buscar libro y prestar libro |
| Referencias | Devolver libro, prestar libro y login |   
|  Notas |  No hay |
| Autor  | Lili Guo Zeng |
|Fecha | 21/01/2024 |

## Casos de uso

#### Buscar libro

  |  Caso de Uso	CU | Buscar libro |
  |---|---|
  | Fuentes  | Sistema de una biblioteca  |
  | Actor  |  Bibliotecario y usuario  |
  | Descripción | Momento en el cual el se busca un libro y tanto el usuario como el bibliotecario pueden realizar la acción  |
  | Flujo básico | 1. El usuario entra a la biblioteca para buscar un libro <br> 2. Si no encuentra el libro este pedirá ayuda al bibliotecario |
  | Pre-condiciones | Debe estar el usario registrado en la biblioteca  |  
  | Post-condiciones  | Una vez encontrado el libro se tendrá que actualizar el estado del libro que va a ser prestado |
  |Excepciones | 1. El libro que se desea no se encuentre en la biblioteca |
  |  Requerimientos | Debe de estar registrado en la base de datos de la biblioteca  |
  |  Notas |  No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 21/01/2024 |

---
  #### Devolver libro

  |  Caso de Uso	CU | Devolver libro |
  |---|---|
  | Fuentes  | Sistema de una biblioteca  |
  | Actor  |  Usuario  |
  | Descripción | Momento en el cual el se busca un libro y tanto el usuario como el bibliotecario pueden realizar la acción  |
  | Flujo básico | 1. El usuario entra a la biblioteca para buscar un libro <br> 2. Si no encuentra el libro este pedirá ayuda al bibliotecario <br> 3. El usuario tendrá que tener cuenta en la biblioteca <br> 4. Una vez llegado el día máximo el usuario tendrá la responsabilidad de devolver el libro antes de el día máximo. |
  | Pre-condiciones | Debe estar el usario registrado en la biblioteca y además que la base de datos de la biblioteca se actualice y le dé una fecha máxima al usuario  |  
  | Post-condiciones  | El usuario deberá de devolver el libro antes del día indicado y además tendrá que devolverlo buenas condiciones | 
  | Excepciones | 1. No se encuentra el libro que se desea <br> 2. No se tiene cuenta <br> 3. No se entrega en el periodo máximo, por tanto hay sanción |
  |  Requerimientos | Debe de estar registrado en la base de datos de la biblioteca  |
  |  Notas |  No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 21/01/2024 |

---
#### Prestar libro

  |  Caso de Uso	CU | Prestar libro |
  |---|---|
  | Fuentes  | Sistema de una biblioteca  |
  | Actor  |  Usuario y bibliotecario  |
  | Descripción | Acto en el que el usuario quiere que le presten un libro y el bibliotecario tiene que realizar la operación de el péstamo en la base de datos  |
  | Flujo básico | 1. El usuario entra a la biblioteca para buscar un libro <br> 2. Si no encuentra el libro este pedirá ayuda al bibliotecario <br> 3. El usuario tendrá que tener cuenta en la biblioteca|
  | Pre-condiciones | Debe estar el usario registrado en la biblioteca |  
  | Post-condiciones  | El usuario deberá de devolver el libro antes del día indicado y además tendrá que devolverlo buenas condiciones |
  | Excepciones | 1. No se encuentra el libro que se desea <br> 2. No se tiene cuenta|
  |  Requerimientos | Debe de estar registrado en la base de datos de la biblioteca  |
  |  Notas |  No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 21/01/2024 |

  --- 
  #### Login

  |  Caso de Uso	CU | Login |
  |---|---|
  | Fuentes  | Sistema de una biblioteca  |
  | Actor  |  Usuario y bibliotecario  |
  | Descripción | Acto en el que el usuario se registra en la base de datos para crearse una cuenta con la que poder identificarse y poder prestar libros |
  | Flujo básico | 1. El usuario se registra en base de datos de la biblioteca y se identifica con sus datos <br> 2. El administrador que en este caso es el bibliotecario registrará todos estos datos y dará pie a la creación de la cuenta. |
  | Pre-condiciones | El usuario debe de entregar sus documentos de identidad y datos |  
  | Post-condiciones  | El usuario una vez registrado podrá realizar los préstamos de libros |  
  | Excepciones | 1. Los datos en el registro no están bien rellenados|
  |  Requerimientos | Tarjeta de identidad y foto  |
  |  Notas |  No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 21/01/2024 |

## Diagrama de secuencia

![image](https://github.com/liliguoz/ETS/assets/145054491/866ede60-f355-4f70-b896-1795522dc447)

## Diagrama actividad

![biblioteca_diagr_actividad](https://github.com/liliguoz/ETS/assets/145054491/bc7fcc8a-2c62-468e-b7a9-0b3403434153)

## Diagrama de clases

![biblioteca_diagr_clase](https://github.com/liliguoz/ETS/assets/145054491/d90282ea-c1d3-44c6-b14f-ffab3c361cae)

## Diagrama de objetos

![biblioteca_diagr_obj](https://github.com/liliguoz/ETS/assets/145054491/9f13f58e-94a8-44aa-a197-dba06cab015a)

## Diagrama de paquetes



