package stepdefinition.login;

import data.login.LoginGenerationData;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import model.login.LoginModel;
import page.page.login.LoginPageCases;
import setup.SetupWebUI;
import java.util.ArrayList;
import static util.Message.EMAIL_LOGUED;
import static util.Message.MESSAGE_LOGIN_ALERT;
import static util.Url.DEMO_WEB_SHOP_URL;


public class LoginStepDefinitionCucumber extends SetupWebUI {


    private LoginModel login;
    private LoginPageCases loginPageCases;

    private final Logger LOGGER= Logger.getLogger(LoginStepDefinitionCucumber.class);

    @Dado("que el usuario navegó hasta el home principal del sitio web")
    public void navegarHastaElHome() {
        try{
            setUpLog4j2();
            setUpDriver(DEMO_WEB_SHOP_URL.getValue());
        }catch (Exception e){
            quitDriver();
            Assertions.fail(e.getMessage(), e);
            LOGGER.error(e.getMessage(), e);
        }
    }
    @Cuando("el usuario de click en el botón Log in sin suministrar ningún dato")
    public void clickEnBoton() {
        try{
            login=login();
            loginPageCases=new LoginPageCases(driver,login);
            loginPageCases.onlySubmit();
        }catch (Exception e){
            quitDriver();
            Assertions.fail(e.getMessage(), e);
            LOGGER.error(e.getMessage(), e);
        }
    }
    @Entonces("el sistema no le permitirá loguearse y mostrará un mensaje de alerta")
    public void mostrarMensaje() {
            try{
                Assertions.assertEquals(infoExpectedBlank(), loginPageCases.infoActualFillBlank());
                quitDriver();
            }
            catch (Exception e){
                quitDriver();
                Assertions.fail(e.getMessage(), e);
                LOGGER.error(e.getMessage(), e);
        }
    }

    //test2

    @Cuando("Cuando el usuario navegue a la sección Ingresar, suministre el {string} {string}")
    public void navegarSeccionIngresar(String email, String contraseña) {
        try{
            login=new LoginModel(email,contraseña);
            loginPageCases=new LoginPageCases(driver,login);
            loginPageCases.fillLogin();

        }catch (Exception e){
            quitDriver();
            Assertions.fail(e.getMessage(), e);
            LOGGER.error(e.getMessage(), e);
        }
    }
    @Entonces("el sistema mostrará que se realizo el inicio exitosamente")
    public void inicioDeSesionExitoso() {
            try{
                Assertions.assertEquals(emailExpected(), loginPageCases.infoActualCorrectLogin());
                quitDriver();
            }catch (Exception e){
                quitDriver();
                Assertions.fail(e.getMessage(), e);
                LOGGER.error(e.getMessage(), e);
            }
    }

    public LoginModel login() {
        login= LoginGenerationData.generateLoginData();
        return login;
    }

    private ArrayList<String> emailExpected(){
        ArrayList<String> infoExpected = new ArrayList<>();
        infoExpected.add(EMAIL_LOGUED.getValue());
        return infoExpected;
    }

    private ArrayList<String> infoExpectedBlank(){
        ArrayList<String> infoExpected=new ArrayList<>();
        infoExpected.add(MESSAGE_LOGIN_ALERT.getValue());
        return infoExpected;
    }

}
