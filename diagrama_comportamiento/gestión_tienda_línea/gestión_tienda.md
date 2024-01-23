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
| Flujo básico | Para poder ver el catálogo, el administrador tendrá que actualizar el catálogo y subir todas estas nuevas actualizaciones al catálogo. Por tanto, podrá ver el catálogo el cliente y el administrador para ver las posibles fallas |
| Pre-condiciones | Actualización  de el catálogo |  
| Post-condiciones  | Que esté actualizado el catálogo y disponible para la compra de productos  |  
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
| Flujo básico | Para poder ver el catálogo, el administrador tendrá que actualizar el catálogo y subir todas estas nuevas actualizaciones al catálogo. Por tanto, podrá ver el catálogo el cliente y el administrador para ver las posibles fallas , asimismo una vez hecho todo lo anterior se podrá realizar compras por porte del cliente|
| Pre-condiciones | Actualización de el catálogo y posibilidad de compra |  
| Post-condiciones  | Que esté actualizado el catálogo y disponible para la compra de productos  |  
|  Requerimientos | Tarjeta de crédito y actualización  del catálogo |
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
| Flujo básico | Antes de poner la actualización del inventario se debe de realizar un conteo de la cantidad de stock que hay, asimismo de debe de registrar lo que falta, sobra, etc|
| Pre-condiciones | Conteo de stock |  
| Post-condiciones  | Tener todo el stock contado y registrado |  
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
| Flujo básico | El administrador deberá de tener el sistema actualizado para que se vea en el catálogo, asimismo el cliente comprará el producto y el administrador deberá de actualizar la base del sistema con respecto a la demanda que haya. Una vez casi sin producto o sin producto el administrador tendrá que pedir más inventario para poder satisfacer la demanda de los clientes|
| Pre-condiciones | Conteo de stock y demanda de clientes |  
| Post-condiciones  | No tener stock o casi sin stock para posterirmente pedir el producto o otro|  
|  Requerimientos | Registros y demanda de los clientes|
|  Notas |  No hay |
| Autor  | Lili Guo Zeng |
|Fecha | 23/01/2024 |
