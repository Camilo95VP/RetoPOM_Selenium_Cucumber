# language: es

  Característica: Registro de usuario
    Como usuario externo de demo web shop
    necesito registrarme
    para poder realizar consultas y asesorias como usuario registrado

    Antecedentes:
      Dado que el usuario navegó hasta la sección de registro

  @Regresion
  Escenario: Registro no exitoso
    Cuando el usuario ingrese todos los datos con claves diferentes
    Entonces el sistema mostrará un mensaje indicando que las claves no coinciden

  @Regresion
  Escenario: Registro exitoso
    Cuando el usuario ingrese todos los datos
    Entonces el sistema mostrará un mensaje indicando que se realizo un registro exitoso
