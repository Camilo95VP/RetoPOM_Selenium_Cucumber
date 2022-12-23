package stepdefinition.contact;


import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;


public class ContactStepDefinitionCucumber {

    @Dado("que el usuario navegó al home principal del sitio web")
    public void queElUsuarioNavegoAlHomePrincipalDelSitioWeb() {
    }


    @Cuando("el usuario ingrese a la sección Contacto, suministre todos los datos y confirme la acción")
    public void elUsuarioIngreseALaSeccionContactoSuministreTodosLosDatosYConfirmeLaAccion() {

    }

    @Entonces("el sistema mostrará que se realizo la solicitud de contacto")
    public void elSistemaMostraraQueSeRealizoLaSolicitudDeContacto() {

    }

    @Cuando("el usuario ingrese a la sección Contacto, suministre los datos obligatorios, con email incorrecto y confirme la acción")
    public void elUsuarioIngreseALaSeccionContactoSuministreLosDatosObligatoriosYConfirmeLaAccion() {

    }

    @Entonces("el sistema mostrará que se ingresó un email incorrecto")
    public void elSistemaMostraraQueSeIngresoUnEmailIncorrecto() {

    }

}
