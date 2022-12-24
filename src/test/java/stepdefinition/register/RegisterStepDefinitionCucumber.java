package stepdefinition.register;

import data.register.RegisterGenerationData;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import model.register.RegisterModel;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import page.page.register.RegisterPageCases;
import setup.SetupWebUI;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import static util.Message.MESSAGE_KEY_ERROR;
import static util.Message.MESSAGE_REGISTER_SUCCESFULL;
import static util.Message.MESSAGE_REGISTER_UNSUCESSFULL;
import static util.Url.DEMO_WEB_SHOP_REGISTER_URL;

public class RegisterStepDefinitionCucumber extends SetupWebUI {

    private static final Logger LOGGER=Logger.getLogger(RegisterStepDefinitionCucumber.class);

    private RegisterPageCases registerPageCases;
    private RegisterModel register;

    @Dado("que el usuario navegó hasta la sección de registro")
    public void queElUsuarioNavegoHastaLaSeccionDeRegistro() {
        try{
            setUpLog4j2();
            setUpDriver(DEMO_WEB_SHOP_REGISTER_URL.getValue());
        }catch (Exception e){
            quitDriver();
            Assertions.fail(e.getMessage(), e);
            LOGGER.error(e.getMessage(), e);
        }
    }

        @Cuando("el usuario ingrese todos los datos,con claves diferentes, acepte terminos y condiciones y confirme la acción")
        public void elUsuarioIngreseTodosLosDatosConClavesDiferentesAcepteTerminosYCondicionesYConfirmeLaAccion () {
            try{
                register=registerModel();
                registerPageCases=new RegisterPageCases(driver,register);
                registerPageCases.unSuccesfullRegisterKeyError();

            }catch (Exception e){
                quitDriver();
                Assertions.fail(e.getMessage(), e);
                LOGGER.error(e.getMessage(), e);
            }
        }
        @Entonces("el sistema mostrará un mensaje indicando que las claves no coinciden")
        public void elSistemaMostraraUnMensajeIndicandoQueLasClavesNoCoinciden () {
            Assertions.assertEquals(infoExpectedKeyError(),registerPageCases.infoActualKeyError());
            quitDriver();
        }

        @Cuando("el usuario ingrese todos los datos pero no acepte términos y condiciones y confirme la acción")
        public void elUsuarioIngreseTodosLosDatosPeroNoAcepteTerminosYCondicionesYConfirmeLaAccion () {
            try{
                registerModel();
                registerPageCases=new RegisterPageCases(driver,register);
                registerPageCases.unsuccesfullRegister();

            }catch (Exception e){
                quitDriver();
                Assertions.fail(e.getMessage(), e);
                LOGGER.error(e.getMessage(), e);
            }
        }
        @Entonces("el sistema mostrará un mensaje indicando que se deben aceptar los términos y condiciones")
        public void elSistemaMostraraUnMensajeIndicandoQueSeDebenAceptarLosTerminosYCondiciones () {
            Assertions.assertEquals(infoExpectedUnsuccesful(),registerPageCases.infoActualUnsucessful());
            quitDriver();
        }

    public RegisterModel registerModel() throws NoSuchAlgorithmException {
        register= RegisterGenerationData.registerModelData();
        return register;
    }

    public ArrayList<String> infoExpectedKeyError(){
        ArrayList<String> infoExpected=new ArrayList<>();
        infoExpected.add(MESSAGE_KEY_ERROR.getValue());
        return infoExpected;
    }

    public ArrayList<String> infoExpectedUnsuccesful(){
        ArrayList<String> infoExpected=new ArrayList<>();
        infoExpected.add(MESSAGE_REGISTER_SUCCESFULL.getValue());
        return infoExpected;
    }


}
