package stepdefinition.register;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class RegisterStepDefinitionCucumber{

    @Dado("que el usuario navegó hasta la sección de registro")
    public void queElUsuarioNavegoHastaLaSeccionDeRegistro() {

    }

        @Cuando("el usuario ingrese todos los datos,con claves diferentes, acepte terminos y condiciones y confirme la acción")
        public void elUsuarioIngreseTodosLosDatosConClavesDiferentesAcepteTerminosYCondicionesYConfirmeLaAccion () {

        }
        @Entonces("el sistema mostrará un mensaje indicando que las claves no coinciden")
        public void elSistemaMostraraUnMensajeIndicandoQueLasClavesNoCoinciden () {

        }

        @Cuando("el usuario ingrese todos los datos pero no acepte términos y condiciones y confirme la acción")
        public void elUsuarioIngreseTodosLosDatosPeroNoAcepteTerminosYCondicionesYConfirmeLaAccion () {

        }
        @Entonces("el sistema mostrará un mensaje indicando que se deben aceptar los términos y condiciones")
        public void elSistemaMostraraUnMensajeIndicandoQueSeDebenAceptarLosTerminosYCondiciones () {

        }


}
