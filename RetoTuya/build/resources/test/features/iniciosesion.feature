#autor: juan97guzman@gmail.com / Juan Pablo Guzman Q
  # language: es

Característica: iniciar sesion en la aplicacion  DemoBlaze

  Antecedentes:
    Dado Yo como usuario ingreso a la pagina

  @Login
  Escenario: Login exitoso
    Cuando Yo quiero iniciar sesion
    Entonces Yo ingreso con exito

  @Productos
  Escenario: El usuario inicia sesion correctamente y compara una laptop
    Cuando El usuario inicia sesion correctamente se dirige a la seccion de laptops
    Entonces El usuario puede ver nombre descripcion precio
      | nombre      | precio | descripcion                                                                        |
      | MacBook air | $700   | 1.6GHz dual-core Intel Core i5 (Turbo Boost up to 2.7GHz) with 3MB shared L3 cache |

  @VerImagen
  Escenario: El usuario inicia sesion correctamente y compara una laptop
    Cuando El usuario inicia sesion correctamente se dirige a la seccion de laptops
    Entonces El usuario puede ver la imagen