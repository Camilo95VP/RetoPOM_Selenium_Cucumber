#language: es
  Característica: Ingreso de usuario
    Como usuario de Sublime Solutions
    necesito iniciar sesión al portal de Sublime Solutions
    para recibir asesoria acerca de sus servicios

  Antecedentes:
    Dado que el usuario navegó hasta el home principal del sitio web

  @Regresion
  Escenario: Ingreso fallido por email erroneo
    Cuando el usuario navegue a la sección Ingresar, no suminstre los datos y confirme la acción
    Entonces el sistema mostrará indicando que debe ingresar el email y contraseña

  @Regresion
  Esquema del escenario: : Ingreso de usuario exitoso
    Cuando  Cuando el usuario navegue a la sección Ingresar, suministre el "<email>" "<contraseña>"
    Entonces el sistema mostrará que se realizo el inicio exitosamente
    Ejemplos:
    |email|contraseña|
    |manuel@gmail.com|123456|

