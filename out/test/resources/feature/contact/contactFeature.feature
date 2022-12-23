# language: es
Característica: Ingreso formulario de contacto
    Como un usuario de Sublime Solutions
    necesito validar el formulario de Contacto
    para asegurar que se realizan correctamente las solicitudes de contacto

    Antecedentes:
        Dado que el usuario navegó al home principal del sitio web

    @Regresion
    Escenario: Ingreso de información formulario de contacto fallido por email
        Cuando el usuario ingrese a la sección Contacto, suministre los datos obligatorios, con email incorrecto y confirme la acción
        Entonces el sistema mostrará que se ingresó un email incorrecto

    @Regresion
    Escenario: Ingreso de información formulario exitosa
        Cuando el usuario ingrese a la sección Contacto, suministre todos los datos y confirme la acción
        Entonces el sistema mostrará que se realizo la solicitud de contacto


