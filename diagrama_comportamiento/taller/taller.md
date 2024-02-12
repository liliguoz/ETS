# Diagrama de comportamiento

En este ejercicio procederemos a analizar el diagrama de comportamiento de la siguiente imagen: 

![image](https://github.com/liliguoz/ETS/assets/145054491/15d443ec-9164-451b-831f-ed9cd27e8405)

## Actores

#### Cliente

|  Actor | Cliente |
|---|---|
| Descripción  | El cliente es una persona que requiere servicios de mantenimiento o reparación para su vehículo en el taller.  |
| Características  |  Puede solicitar servicios para su vehículo.<br>- Realiza pagos por los servicios prestados.<br>- Recibe facturas por los servicios realizados. |
| Relaciones | Programar cita  |
| Referencias | Programar cita, realizar pago |   
|  Notas |  No hay |
| Autor  | Lili Guo Zeng |
|Fecha | 11/02/2024 |

---
#### Personal taller

|  Actor | Personal taller |
|---|---|
| Descripción  | El personal del taller es el encargado de realizar las diversas tareas administrativas y de mantenimiento en el taller mecánico. |
| Características  | - Registra clientes y vehículos en el sistema.<br>- Programa citas para los clientes.<br>- Registra servicios solicitados por los clientes.<br>- Consulta disponibilidad de horarios.<br>- Genera facturas por los servicios realizados. |
| Relaciones | Programar cita |
| Referencias | Registrar vehículo, registrar cliente, registrar servicio y programar cita |   
|  Notas |  No hay |
| Autor  | Lili Guo Zeng |
|Fecha | 11/02/2024 |

## Casos de uso

#### Registrar cliente

  |  Caso de Uso	CU | Registrar cliente |
  |---|---|
  | Fuentes  | gestión taller  |
  | Actor  |  personal del taller|
  | Descripción | Este caso de uso describe el proceso mediante el cual el personal del taller registra un nuevo cliente en el sistema de gestión.  |
  | Flujo básico | 1. El Personal del Taller accede al sistema de gestión del taller.<br>2. El Personal del Taller selecciona la opción de registrar un nuevo cliente.<br>3. El Personal del Taller completa el formulario de registro con la información del cliente (nombre, dirección, número de teléfono, etc.).<br>4. El sistema valida la información ingresada.<br>5. El sistema registra al nuevo cliente en la base de datos del taller.<br>6. El caso de uso finaliza. |
  | Pre-condiciones | - El Personal del Taller tiene acceso al sistema del taller.<br>- El cliente no está registrado previamente en el sistema. |  
  | Post-condiciones  | El nuevo cliente queda registrado en el sistema del taller. |  
  | Excepción | 	- Si la información ingresada no es válida, el sistema muestra un mensaje de error y solicita al usuario que corrija los campos correspondientes.<br>- Si el cliente ya está registrado en el sistema, el personal del taller puede optar por actualizar su información en lugar de registrar un nuevo cliente.<br>- El personal del taller puede cancelar el registro en cualquier momento antes de completarlo. |
  |  Requerimientos | - Acceso al sistema de gestión del taller.<br>- Información completa y válida del nuevo cliente.  |
  |  Notas | No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 11/02/2024 |

---
#### Registrar usuario

  |  Caso de Uso	CU | Registrar usuario |
  |---|---|
  | Fuentes  | gestión taller |
  | Actor  |  personal del taller |
  | Descripción | 	Este caso de uso describe el proceso mediante el cual el administrador del sistema registra un nuevo usuario en el sistema de gestión. |
  | Flujo básico | 	1. El Administrador del Sistema accede al panel de administración del sistema.<br>2. El Administrador del Sistema selecciona la opción para registrar un nuevo usuario.<br>3. El Administrador del Sistema completa el formulario de registro con la información del nuevo usuario (nombre de usuario, correo electrónico, contraseña, etc.).<br>4. El sistema valida la información ingresada, verificando que el nombre de usuario y el correo electrónico no estén duplicados y que la contraseña cumpla con los requisitos de seguridad establecidos.<br>5. El sistema registra al nuevo usuario en la base de datos del sistema.<br>6. El caso de uso finaliza.|
  | Pre-condiciones | - El Administrador del Sistema tiene acceso al panel de administración del sistema.<br>- No existe otro usuario registrado en el sistema con el mismo nombre de usuario o correo electrónico. |  
  | Post-condiciones  | El nuevo usuario queda registrado en el sistema.  |  
  | Excepcióm | - Si la información ingresada no es válida, el sistema muestra un mensaje de error y solicita al usuario que corrija los campos correspondientes.<br>- Si el nombre de usuario o el correo electrónico ya están en uso, el sistema muestra un mensaje de error y solicita al administrador que elija una nueva combinación.<br>- El Administrador del Sistema puede cancelar el registro en cualquier momento antes de completarlo. |
  |  Requerimientos | - Acceso al panel de administración del sistema.<br>- Información completa y válida del nuevo usuario.<br>- Contraseña que cumpla con los requisitos de seguridad establecidos. |
  |  Notas |  No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 11/02/2024 |

----
#### Registrar vehículo

  |  Caso de Uso	CU | XXX  |
  |---|---|
  | Fuentes  | _Documento que sustenta el caso de uso_  |
  | Actor  |  _Actores que participan en el caso de uso_ |
  | Descripción | _Descripción del caso de uso_  |
  | Flujo básico | _Descripción paso a paso de la ejecución. (1->2->3.)_ |
  | Pre-condiciones | _Que debe ocurrir con anterioridad_  |  
  | Post-condiciones  | _Que debe ocurrir con posterioridad_  |  
  | Excepción | _Momento en el cual el flujo basico no se cumple |
  |  Requerimientos | _Que debe de exister para que el caso de uso se ejecute. Ej: Tarjeta de crédito_  |
  | Excepción | 	- Si la información ingresada no es válida, el sistema muestra un mensaje de error y solicita al usuario que corrija los campos correspondientes.<br>- El Personal del Taller puede cancelar el registro en cualquier momento antes de completarlo. |
  |  Notas |  No hay |
  | Autor  | Lili Guo Zeng |
  |Fecha | 12/02/2024 |

---
#### Programar cita

  |  Caso de Uso	CU | Programar cita |
  |---|---|
  | Fuentes  | gestión taller |
  | Actor  |  personal del taller y cliente |
  | Descripción | Este caso de uso describe el proceso mediante el cual el personal del taller programa una cita para un cliente específico. |
  | Flujo básico | 1. El Personal del Taller accede al sistema de gestión del taller.<br>2. El Personal del Taller selecciona la opción para programar una nueva cita.<br>3. El Personal del Taller selecciona al cliente para el que desea programar la cita.<br>4. El Personal del Taller elige la fecha y hora para la cita.<br>5. El sistema verifica la disponibilidad de la fecha y hora seleccionada.<br>6. El sistema registra la cita en el calendario del taller.<br>7. El caso de uso finaliza.|
  | Pre-condiciones | - El Personal del Taller tiene acceso al sistema del taller.<br>- El cliente para el que se programa la cita está registrado en el sistema.| 
  | Post-condiciones  | La cita queda programada en el sistema del taller. |  
  | Excepción | 	- Si la fecha y hora seleccionadas no están disponibles, el sistema muestra un mensaje de error y solicita al Personal del Taller que elija otra fecha u hora.<br>- El Personal del Taller puede cancelar la programación de la cita en cualquier momento antes de completarla. |
  |  Requerimientos | - Acceso al sistema de gestión del taller.<br>- Cliente registrado en el sistema del taller.<br>- Disponibilidad de fechas y horas para programar la cita. |
  |  Notas |  No hay |
  | Autor  | Lili Guo Zeng|
  |Fecha | 12/02/2024 |

  ---
  #### Realizar pago

  |  Caso de Uso	CU | Realizar pago  |
  |---|---|
  | Fuentes  | gestión taller  |
  | Actor  |  cliente |
  | Descripción | Este caso de uso describe el proceso mediante el cual el cliente realiza el pago por los servicios prestados en el taller. |
  | Flujo básico |1. El Cliente accede al sistema de facturación del taller o se dirige al área de atención al cliente.<br>2. El Cliente selecciona la opción para realizar un pago.<br>3. El Cliente ingresa el monto a pagar y selecciona el método de pago (efectivo, tarjeta de crédito, transferencia bancaria, etc.).<br>4. El sistema verifica la información del pago y procesa la transacción.<br>5. El sistema actualiza el estado del pago y emite un recibo o comprobante de pago.<br>6. El caso de uso finaliza.|
  | Pre-condiciones | - El Cliente tiene acceso al sistema de facturación del taller o se encuentra en el área de atención al cliente.<br>- El cliente tiene un monto pendiente por pagar. |  
  | Post-condiciones  | El pago se registra en el sistema del taller y se actualiza el estado del pago correspondiente.|  
  | Excepción | 	- Si la información del pago no es válida o si hay un problema con la transacción, el sistema muestra un mensaje de error y solicita al Cliente que corrija los datos o elija otro método de pago.<br>- El Cliente puede cancelar el pago en cualquier momento antes de confirmarlo. |
  |  Requerimientos | - Acceso al sistema de facturación del taller o atención al cliente.<br>- Información válida para el pago (monto, método de pago). |
  |  Notas |  No hay |
  | Autor  | Lili Guo Zeng|
  |Fecha | 12/02/2024 |
