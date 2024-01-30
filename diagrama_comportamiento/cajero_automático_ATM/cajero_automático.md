# Diagrama de comportamiento

En este ejercicio procederemos a analizar el diagrama de comportamiento de la siguiente imagen: 

![image](https://github.com/liliguoz/ETS/assets/145054491/d01df8c8-7e69-4fd0-a50e-299abc006e64)

## Actores

#### Administrador

|  Actor | Administrador |
|---|---|
| Descripción  | Encargado de hacer que funcione el cajero automático  |
| Características  | Se encarga del mantenimiento, actualización y buen funcionamiento del cajero |
| Relaciones | Login y poner dinero al movil  |
| Referencias | Login, poner dinero al movil y revisar el cajero automático |   
|  Notas |  No hay |
| Autor  | Lili Guo Zeng |
|Fecha | 29/01/2024 |

---
#### Cliente bancario

|  Actor | Cliente bancario |
|---|---|
| Descripción  | Persona que tiene cuenta en ese banco |
| Características  | Utiliza su cuenta bancaria para pagar, ingresar y retirar el dinero |
| Relaciones | Login y poner dinero al movil  |
| Referencias | Login, poner dinero al movil, realizar transferencias, ingresar dinero, ver saldo y retirar dinero |   
|  Notas |  No hay |
| Autor  | Lili Guo Zeng |
|Fecha | 29/01/2024 |

## Casos de uso 

#### Login

  |  Caso de Uso	CU | Login |
  |---|---|
  | Fuentes  | Sistema de cajero automático ATM  |
  | Actor  |  Administrador y cliente bancario |
  | Descripción | Se registra el cliente en el banco |
  | Flujo básico | 1. El cliente aporta la documentación necesaria para crear la cuenta |
  |              | 2. El administrador procede a darle de alta la cuenta creada | 
  |              | 3. El cliente podrá utilizar la cuenta para ingresos, transferencias, etc |
  | Pre-condiciones | Aportar la documentación |  
  | Post-condiciones  |La cuenta se da de alta para poder utilizarla |  
  | Excepciones | 1. La documentación no es correcta |
  |             | 2. No se trae la documentación requerida |
  |             | 3. El sistema para darse de alta cae |
  |  Requerimientos | DNI y dinero |
  |  Notas | No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 23/01/2024 |

---
#### Poner dinero al móvil

  |  Caso de Uso	CU | Poner dinero al móvil |
  |---|---|
  | Fuentes  | Sistema de cajero automático ATM  |
  | Actor  |  Administrador y cliente bancario |
  | Descripción | Se redirige el ingreso al teléfono móvil |
  | Flujo básico | 1. El cliente aporta la documentación necesaria para crear la cuenta |
  |              | 2. El administrador procede a darle de alta la cuenta creada | 
  |              | 3. El cliente podrá utilizar la cuenta para ingresos, transferencias, etc |
  |              | 4. El cliente pondrá dinero al móvil
  | Pre-condiciones | Aportar la documentación |  
  | Post-condiciones  | E movil tiene dinero |  
  | Excepciones | 1. La documentación no es correcta |
  |             | 2. No se trae la documentación requerida |
  |             | 3. El sistema para darse de alta cae |
  |  Requerimientos | DNI y dinero |
  |  Notas | No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 23/01/2024 |

---
#### Realizar transferencia

  |  Caso de Uso	CU | Realizar transferencia |
  |---|---|
  | Fuentes  | Sistema de cajero automático ATM  |
  | Actor  |  Cliente bancario |
  | Descripción | Se hace una transferencia bancaria |
  | Flujo básico | 1. El cliente aporta la documentación necesaria para crear la cuenta |
  |              | 2. El administrador procede a darle de alta la cuenta creada | 
  |              | 3. El cliente podrá utilizar la cuenta para ingresos, transferencias, etc |
  | Pre-condiciones | Tener el IBAN de la cuenta a la que se quiere transferir dinero |  
  | Post-condiciones  | Notificación de que se ha realizado la trnasferencia correctamente |  
  | Excepciones | 1. La documentación no es correcta |
  |             | 2. No se trae la documentación requerida |
  |             | 3. El sistema para darse de alta cae |
  |             | 4. La cuenta de banco a la que se quiere hacer la transferencia no es correcta |
  |  Requerimientos | DNI y dinero |
  |  Notas | No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 23/01/2024 |

---
#### Ingresar dinero

  |  Caso de Uso	CU | Ingresar dinero |
  |---|---|
  | Fuentes  | Sistema de cajero automático ATM  |
  | Actor  |  Cliente bancario |
  | Descripción | Se ingresa una cantidad x de dinero a la cuenta bancaria |
  | Flujo básico | 1. El cliente aporta la documentación necesaria para crear la cuenta |
  |              | 2. El administrador procede a darle de alta la cuenta creada | 
  |              | 3. El cliente ingresa dinero |
  |              | 4. El cliente podrá utilizar la cuenta para ingresos, transferencias, etc |
  | Pre-condiciones | Aportar la documentación, pin y que el cajero funcione |  
  | Post-condiciones  | Actualización de la cuenta con la cantidad de dinero ingresada |  
  | Excepciones | 1. La documentación no es correcta |
  |             | 2. No se trae la documentación requerida |
  |             | 3. El sistema para darse de alta cae |
  |             | 4. El ingreso de dinero da error |
  |  Requerimientos | tarjeta de crédito y dinero |
  |  Notas | No hay |
  | Autor  | Lili Guo Zeng |

  ---
#### Ver saldo 

  |  Caso de Uso	CU | Ver saldo |
  |---|---|
  | Fuentes  | Sistema de cajero automático ATM  |
  | Actor  |  Cliente bancario |
  | Descripción | Cada x tiempo el cliente podrá ver el saldo que tiene en su cuenta |
  | Flujo básico | 1. El cliente aporta la documentación necesaria para crear la cuenta |
  |              | 2. El administrador procede a darle de alta la cuenta creada | 
  |              | 3. El cliente ingresa dinero |
  |              | 4. El cliente podrá utilizar la cuenta para ingresos, transferencias, etc |
  |              | 5. El cliente verá el saldo que tiene en la cuenta |
  | Pre-condiciones | Tener dinero en la cuenta|  
  | Post-condiciones  | Saber la cantidad de dinero que hay en la cuenta del banco |  
  | Excepciones | 1. La documentación no es correcta |
  |             | 2. No se trae la documentación requerida |
  |             | 3. El sistema para darse de alta cae |
  |             | 4. La aplicación da error, no se puede entrar entre otros casos en los que no pueda ver el saldo |
  |  Requerimientos | tarjeta de crédito y dinero |
  |  Notas | No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 23/01/2024 |

  ---
#### Retirar dinero

  |  Caso de Uso	CU | Retirar dinero |
  |---|---|
  | Fuentes  | Sistema de cajero automático ATM  |
  | Actor  |  Cliente bancario |
  | Descripción | El cliente tendrá que usar dinero metálico y por tanto retirará dinero del banco |
  | Flujo básico | 1. El cliente aporta la documentación necesaria para crear la cuenta |
  |              | 2. El administrador procede a darle de alta la cuenta creada | 
  |              | 3. El cliente ingresa dinero |
  |              | 4. El cliente podrá utilizar la cuenta para ingresos, transferencias, etc |
  |              | 5. El cliente verá el saldo que tiene en la cuenta |
  |              | 6. El cliente retirará x cantidad de dinero en el cajero |
  | Pre-condiciones | Tener dinero en la cuenta |  
  | Post-condiciones  | Obtener el dinero en metálico |  
  | Excepciones | 1. La documentación no es correcta |
  |             | 2. No se trae la documentación requerida |
  |             | 3. El sistema para darse de alta cae |
  |             | 4. El cajero será defectuoso y no dejará retirar el dinero |
  |  Requerimientos | tarjeta de crédito y dinero |
  |  Notas | No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 23/01/2024 |

  ---
#### Revisar el cajero automático

  |  Caso de Uso	CU | Revisar el cajero automático |
  |---|---|
  | Fuentes  | Sistema de cajero automático ATM  |
  | Actor  |  Administrador |
  | Descripción | El adminsitrador tendrá que hacer inspecciones periódicas del estado del cajero |
  | Flujo básico | 1. El cliente aporta la documentación necesaria para crear la cuenta |
  |              | 2. El administrador procede a darle de alta la cuenta creada | 
  |              | 3. El cliente ingresa dinero |
  |              | 4. El cliente podrá utilizar la cuenta para ingresos, transferencias, etc |
  |              | 5. El cliente verá el saldo que tiene en la cuenta |
  |              | 6. El cliente retirará x cantidad de dinero en el cajero |
  |              | 7. Todos los días el administrador deberá vigilar que el cajero funcione de forma correcta y realizar cambios en los que corresponda a las necesidades del cajero |
  | Pre-condiciones | Tener el cajero funcionando o no |  
  | Post-condiciones  |Funcionamiento del cajero óptimo |  
  | Excepciones | 1. Gran fallo en el sistema que impida la utilización del cajero |
  |  Requerimientos | conocimiento |
  |  Notas | No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 23/01/2024 |

