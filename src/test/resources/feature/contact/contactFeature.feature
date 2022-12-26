# language: es
Característica: Formulario de contacto
    Como un usuario de Demo Web Shop
    necesito registar un contacto
    para asegurar que se realizan correctamente las solicitudes

    Antecedentes:
        Dado que el usuario navegó al home principal del sitio web

    @Regresion
    Escenario: Registro de contacto fallido por email
        Cuando el usuario ingrese a la sección Contacto y suministre un email incorrecto
        Entonces el sistema mostrará un mensaje de validación

    @Regresion
    Escenario: Registro de contacto exitoso
        Cuando el usuario ingrese a la sección Contacto y suministre todos los datos correctos
        Entonces el sistema mostrará que se realizo la solicitud de contacto


