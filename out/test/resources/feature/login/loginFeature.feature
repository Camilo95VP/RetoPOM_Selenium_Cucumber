#language: es
  Característica: Ingreso de usuario
    Como usuario de Demo Web Shop
    necesito iniciar sesión
    para recibir asesoria y realizar compras de sus productos

  Antecedentes:
    Dado que el usuario navegó hasta el home principal del sitio web

  @Regresion
  Escenario: Ingreso de usuario fallido
    Cuando el usuario de click en el botón Log in sin suministrar ningún dato
    Entonces el sistema no le permitirá loguearse y mostrará un mensaje de alerta

  @Regresion
  Esquema del escenario: Ingreso de usuario exitoso
    Cuando  Cuando el usuario navegue a la sección Ingresar, suministre el "<email>" "<password>"
    Entonces el sistema mostrará que se realizo el inicio exitosamente
    Ejemplos:
    |email|password|
    |manuel@gmail.com|123456|

