# language: es

  Característica: Registro de usuario
    Como usuario externo de Sublime Solutions
    necesito registrarme en el portal web
    para poder realizar consultas y asesorias como usuario registrado

    Antecedentes:
      Dado que el usuario navegó hasta la sección de registro

  @Regresion
  Escenario: Registro exitoso
    Cuando el usuario ingrese todos los datos,con claves diferentes, acepte terminos y condiciones y confirme la acción
    Entonces el sistema mostrará un mensaje indicando que las claves no coinciden

  @Regresion
  Escenario: Registro fallido por no aceptación de términos y condiciones
    Cuando el usuario ingrese todos los datos pero no acepte términos y condiciones y confirme la acción
    Entonces el sistema mostrará un mensaje indicando que se deben aceptar los términos y condiciones
