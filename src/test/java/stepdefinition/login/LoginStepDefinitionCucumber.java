package stepdefinition.login;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;


public class LoginStepDefinitionCucumber {



    @Dado("que el usuario navegó hasta el home principal del sitio web")
    public void queElUsuarioNavegoHastaElHomePrincipalDelSitioWeb() {

    }
    @Cuando("el usuario navegue a la sección Ingresar, no suminstre los datos y confirme la acción")
    public void elUsuarioNavegueALaSeccionIngresarNoSuminstreLosDatosYConfirmeLaAccion() {

    }
    @Entonces("el sistema mostrará indicando que debe ingresar el email y contraseña")
    public void elSistemaMostraraIndicandoQueDebeIngresarElEmailYContrasena() {

    }

    //test2

    @Cuando("Cuando el usuario navegue a la sección Ingresar, suministre los datos incorrectos y confirme la acción")
    public void cuandoElUsuarioNavegueALaSeccionIngresarSuministreLosDatosIncorrectosYConfirmeLaAccion() {

    }
    @Entonces("el sistema mostrará un mensaje de ingreso fallido")
    public void elSistemaMostraraUnMensajeDeIngresoFallido() {

    }

}
