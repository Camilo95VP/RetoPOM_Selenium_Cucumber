package stepdefinition.login;

import data.login.LoginGenerationData;
import data.register.RegisterGenerationData;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import model.register.RegisterModel;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import page.page.login.LoginModel;
import setup.SetupWebUI;

import java.security.NoSuchAlgorithmException;

import static util.Url.DEMO_WEB_SHOP_REGISTER_URL;
import static util.Url.DEMO_WEB_SHOP_URL;


public class LoginStepDefinitionCucumber extends SetupWebUI {


    private LoginModel loginModel;

    private final Logger LOGGER= Logger.getLogger(LoginStepDefinitionCucumber.class);

    @Dado("que el usuario navegó hasta el home principal del sitio web")
    public void queElUsuarioNavegoHastaElHomePrincipalDelSitioWeb() {
        try{
            setUpLog4j2();
            setUpDriver(DEMO_WEB_SHOP_URL.getValue());
        }catch (Exception e){
            quitDriver();
            Assertions.fail(e.getMessage(), e);
            LOGGER.error(e.getMessage(), e);
        }
    }
    @Cuando("el usuario navegue a la sección Ingresar, no suminstre los datos y confirme la acción")
    public void elUsuarioNavegueALaSeccionIngresarNoSuminstreLosDatosYConfirmeLaAccion() {
        try{
            loginModel=loginModel();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Entonces("el sistema mostrará indicando que debe ingresar el email y contraseña")
    public void elSistemaMostraraIndicandoQueDebeIngresarElEmailYContrasena() {

    }

    //test2

    @Cuando("Cuando el usuario navegue a la sección Ingresar, suministre el {string} {string}")
    public void cuandoElUsuarioNavegueALaSeccionIngresarSuministreLosDatosIncorrectosYConfirmeLaAccion(String email, String contraseña) {

        try{
            loginModel=new LoginModel(email,contraseña);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Entonces("el sistema mostrará que se realizo el inicio exitosamente")
    public void elSistemaMostraraUnMensajeDeIngresoFallido() {

    }

    public LoginModel loginModel() {
        loginModel= LoginGenerationData.generateLoginData();
        return loginModel;
    }

}
