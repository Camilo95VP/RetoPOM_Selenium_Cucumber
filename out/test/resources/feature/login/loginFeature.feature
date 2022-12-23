#language: es
  Característica: Ingreso de usuario
    Como usuario de Sublime Solutions
    necesito iniciar sesión al portal de Sublime Solutions
    para recibir asesoria acerca de sus servicios

  Antecedentes:
    Dado que el usuario navegó hasta el home principal del sitio web

  @Regresion
  Escenario: Ingreso fallido por email y contraseña vacios
    Cuando el usuario navegue a la sección Ingresar, no suminstre los datos y confirme la acción
    Entonces el sistema mostrará indicando que debe ingresar el email y contraseña

  @Regresion
  Escenario: Ingreso de usuario fallido
    Cuando  Cuando el usuario navegue a la sección Ingresar, suministre los datos incorrectos y confirme la acción
    Entonces el sistema mostrará un mensaje de ingreso fallido

