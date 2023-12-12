# ALUMNOS 
<!-- Insertamos una foto como decoración -->
![hornos](https://www.tenerife.es/portalcabtfe/images/Img/Temas/PatrimonioHistorico/BIC/PuertoDeLaCruz/1193/P1010159.JPG "IES Puerto de la Cruz-Telesforo Bravo")

---
<!-- Realizamos un título con una lista ordenada de la clase -->
### LISTA DE CLASE ORDENADA

1. **Nichole**
2. **David**
3. **Eduardo**
---
<!-- Realizamos un título con una lista desordenada de la clase -->
### LISTA DE CLASE DESORDENADA

* **Nichole**
* **David**
* **Eduardo**
---
<!-- A continuación procederemos a hacer una tabla donde se separen por columnas el nombre y los àpellidos de los alumnos  -->
### Nombres completos

|Nombre |Apellidos|
|-------|---------|
|*Nichole*|*Arboleda*|
|*David*|*Riccio*|
|*Eduardo*|*Rabadán*|
---
<!-- Pasaremos una lista de asistencia de la clase -->
### ASISTENCIAS DÍA 5/12/2023

* [X] Nichole Arboleda
* [ ] David Riccio
* [ ] Eduardo Rabadán
<!-- Asimismo, agregaremos la página web del centro para buscar información sobre ella -->
### WEB DEL INSTITUTO

[IES Puerto de la Cruz-Telesforo Bravo](https://www3.gobiernodecanarias.org/medusa/edublog/iespuertodelacruztelesforobravo/)

<!-- Insertamos una imagen del logo del instituto -->
![logo institulo](https://www3.gobiernodecanarias.org/medusa/edublog/iespuertodelacruztelesforobravo/wp-content/uploads/sites/408/2023/01/logotipo-fondo-transparente.png "IES Puerto de la Cruz-Telesforo Bravo")
---
<!-- Insertamos también la ubicación que tiene el centro en google maps -->
### UBICACIÓN DEL CENTRO
[Ubicación](https://www.google.com/maps/place/IES+Puerto+de+la+Cruz/@28.4120495,-16.5528398,17z/data=!3m1!4b1!4m20!1m13!4m12!1m4!2m2!1d-16.6002688!2d28.0461312!4e1!1m6!1m2!1s0xc6a7fecebf92cdd:0x97e763bf7638fd44!2sies+puerto+de+la+cruz+ubicaci%C3%B3n!2m2!1d-16.550332!2d28.4120853!3m5!1s0xc6a7fecebf92cdd:0x97e763bf7638fd44!8m2!3d28.4120448!4d-16.5502649!16s%2Fg%2F1tdy13x_?entry=ttu)

<!-- Además agregaremos las opiniones que tienen del centro -->
### OPINIÓN DEL CENTRO
> Muy buenos profesores en el ciclo superior de ARI.

> Excelente instituto!

> Soy estudiante de la eso y los profes son una maravilla 

<!-- Insertaremos un video para que pueden ver el centro -->
### VIDEO DEL CENTRO 

[![vé al siguiente video](https://fundacionyehudimenuhin.org/wp-content/uploads/2023/01/cabecera-mural-IES-Telesforo-Bravo-Perto-de-la-cruz-entrevistas-TENERIFE-630x200-1.jpg)](https://www.youtube.com/watch?v=ry1PkXs5v8Q)
---
<!-- Se inserta un código xml sde las notas de una alumna-->
### CÓDIGO XML DE NOTAS DE ALUMNO
```xml
 <?xml version="1.0" encoding="UTF-8"?>
<alumnos grupo="3">
<alumno dni="45678966S">
<hombre>Nichole Arboleda</hombre>
<edad>23</edad>
<nota eval="1">8.5</nota>
<nota eval="2">7.3</nota>
<nota eval="3">8.8</nota>
<telefono>649111111</telefono>
</alumno>
</alumnos>
```
---
<!--Se inserta un código python de las notas -->
### CÓDIGO PYTHON DE NOTAS
```python
def agregarTexto(texto):

    """ funcion para añadir un texto """

    while True:

        nombre = input(texto)

        if nombre=="":

            print("No puede estar vacio")

        else:

            return nombre

 

def entrarNota(text):

    """ funcion para añadir una nota """

    while True:

        try:

            nota = float(input("{}(0-100): ".format(text)))

            if 0<=nota<=100:

                return nota

            else:

                print("la nota tiene que estar entre 0 y 100")

        except:

            print("la nota tiene que ser un valor numerico")
```