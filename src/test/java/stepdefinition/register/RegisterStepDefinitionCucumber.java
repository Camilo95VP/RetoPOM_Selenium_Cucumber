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
import static util.Url.DEMO_WEB_SHOP_REGISTER_URL;

public class RegisterStepDefinitionCucumber extends SetupWebUI {

    private static final Logger LOGGER=Logger.getLogger(RegisterStepDefinitionCucumber.class);

    private RegisterPageCases registerPageCases;
    private RegisterModel register;

    @Dado("que el usuario navegó hasta la sección de registro")
    public void navegarHastaRegistro() {
        try{
            setUpLog4j2();
            setUpDriver(DEMO_WEB_SHOP_REGISTER_URL.getValue());
        }catch (Exception e){
            quitDriver();
            Assertions.fail(e.getMessage(), e);
            LOGGER.error(e.getMessage(), e);
        }
    }

        @Cuando("el usuario ingrese todos los datos con claves diferentes")
        public void ingresarClavesErroneas () {
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
        public void mostrarMensajeClavesErroneas () {
            Assertions.assertEquals(infoExpectedKeyError(),registerPageCases.infoActualKeyError());
            quitDriver();
        }

        @Cuando("el usuario ingrese todos los datos")
        public void ingresarDatos() {
            try{
                registerModel();
                registerPageCases=new RegisterPageCases(driver,register);
                registerPageCases.succesfullRegister();

            }catch (Exception e){
                quitDriver();
                Assertions.fail(e.getMessage(), e);
                LOGGER.error(e.getMessage(), e);
            }
        }
        @Entonces("el sistema mostrará un mensaje indicando que se realizo un registro exitoso")
        public void mostrarMensajeRegistroExitoso () {
            Assertions.assertEquals(infoExpectedSuccesful(),registerPageCases.infoActualSucessful());
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

    public ArrayList<String> infoExpectedSuccesful(){
        ArrayList<String> infoExpected=new ArrayList<>();
        infoExpected.add(MESSAGE_REGISTER_SUCCESFULL.getValue());
        return infoExpected;
    }


}
