# Diagrama de comportamiento

En este ejercicio procederemos a analizar el diagrama de comportamiento de la siguiente imagen: 

![imagen](https://github.com/liliguoz/ETS/assets/145054491/0a5a8aa3-da5a-4cdb-901b-be6a6e9d778c)

## Actores

#### Cliente
|  Actor | Cliente |
|---|---|
| Descripción  | Persona que va a comprar productos, etc |
| Características  | Persona que compra y revisa los productos respecto a sus necesidades|
| Relaciones | Ver catálogo |
| Referencias | Ver catálogo y realizar compras |   
|  Notas |  No hay |
| Autor  | Lili Guo Zeng |
|Fecha | 23/01/2024 |

---

#### Actor
|  Actor | Administrador |
|---|---|
| Descripción  | Persona encargada de la tienda |
| Características  | Gestión de stock, almacén, etc|
| Relaciones | Ver catálogo  |
| Referencias | Ver catálogo, gestionar inventario y pedir inventario |   
|  Notas | No hay|
| Autor  | Lili Guo Zeng|
|Fecha | 23/01/2024 |

## Casos de uso

#### Ver catálogo

|  Caso de Uso	CU | Ver catálogo  |
|---|---|
| Fuentes  | Gestón tienda en línea |
| Actor  |  Administrador y cliente |
| Descripción | Se revisa por parte de el administrador el catálogo para ver las actualizaciones y las fallas y por parte de el cliente lo usará para ver las diferentes ofertar y lo que ofrece la tienda para vender |
| Flujo básico | 1. El administrador tendrá que actualizar el catálogo y subir todas estas nuevas actualizaciones al catálogo |
|              | 2. Podrá ver el catálogo el cliente y el administrador para ver las posibles fallas |
| Pre-condiciones | Actualización  de el catálogo |  
| Post-condiciones  | Que esté actualizado el catálogo y disponible para la compra de productos  |  
| Excepciones | 1. No se consigue hacer la actualización |
|             | 2. Hay errores en la actualización |
|             | 3. La web da fallas a nivel diseño |
|  Requerimientos | Tarjeta de crédito y actualización  del catálogo |
|  Notas |  No hay |
| Autor  | Lili Guo Zeng |
|Fecha | 23/01/2024 |

---
#### Realizar compras

|  Caso de Uso	CU | Realizar compras  |
|---|---|
| Fuentes  | Gestón tienda en línea |
| Actor  |  Cliente |
| Descripción | El cliente formaliza la compra de el objeto |
| Flujo básico | 1. El administrador actualiza el catálogo y subirá las nuevas actualizaciones | 
|              | 2. Podrá ver el catálogo el cliente y el administrador para ver las posibles fallas |
|              | 3. Se realizará las compras por parte del cliente|
| Pre-condiciones | Actualización de el catálogo y posibilidad de compra |  
| Post-condiciones  | Que esté actualizado el catálogo y disponible para la compra de productos  |  
|  Requerimientos | Tarjeta de crédito y actualización  del catálogo |
| Excepciones | 1. No se consigue hacer la actualización |
|             | 2. Hay errores en la actualización |
|             | 3. La web da fallas a nivel diseño |
|  Notas |  No hay |
| Autor  | Lili Guo Zeng |
|Fecha | 23/01/2024 |

---
#### Gestionar inventario

|  Caso de Uso	CU | Gestionar inventario |
|---|---|
| Fuentes  | Gestón tienda en línea |
| Actor  |  Administrador |
| Descripción | Se gestiona la cantidad de inventario que hay para vender, la reserva que hay de productos, la anotación del inventario, etc |
| Flujo básico | 1. Conteo de la cantidad de stock que hay
|              | 2. Registro de lo que falta, sobra, etc|
| Pre-condiciones | Conteo de stock |  
| Post-condiciones  | Tener todo el stock contado y registrado |  
| Excepciones | 1. No se consigue hacer la actualización |
|             | 2. Hay errores en la actualización |
|             | 3. No hay stock |
|  Requerimientos | Registros |
|  Notas |  No hay |
| Autor  | Lili Guo Zeng |
|Fecha | 23/01/2024 |

---
#### Pedir inventario

|  Caso de Uso	CU | Pedir inventario |
|---|---|
| Fuentes  | Gestón tienda en línea |
| Actor  |  Administrador |
| Descripción | Se gestiona la cantidad de inventario que hay para vender y la cantidad que falta|
| Flujo básico | 1. Sistema actualizado para que se vea en el catálogo |
|              | 2. El cliente comprará el producto |
|              | 3. El administrador deberá de actualizar la base del sistema con respecto a la demanda que haya |
|              | 4. El administrador tendrá que pedir más inventario para poder satisfacer la demanda de los clientes|
| Pre-condiciones | Conteo de stock y demanda de clientes |  
| Post-condiciones  | No tener stock o casi sin stock para posterirmente pedir el producto o otro|  
| Excepciones | 1. No se consigue hacer la actualización |
|             | 2. Hay errores en la actualización |
|             | 3. La web da fallas a nivel diseño |
|  Requerimientos | Registros y demanda de los clientes|
|  Notas |  No hay |
| Autor  | Lili Guo Zeng |
|Fecha | 23/01/2024 |

## Diagrama de actividad

![gestión_tienda_diagr_actividad](https://github.com/liliguoz/ETS/assets/145054491/9bc96f1d-a3c4-468e-be1e-ab4fd215aead)

## Diagrama de clases

![gestion_tienda_diagr_clases](https://github.com/liliguoz/ETS/assets/145054491/6d04e877-6216-4667-b051-4e4ca659c172)

## Diagrama de objetos

![tienda_online_diagr_obj](https://github.com/liliguoz/ETS/assets/145054491/78688626-05d7-4b4c-add2-1134cafea71c)

## Diagrama de paquetes

![image](https://github.com/liliguoz/ETS/assets/145054491/ef09ac04-ec9b-4d8d-95c8-9363c586c69a)



