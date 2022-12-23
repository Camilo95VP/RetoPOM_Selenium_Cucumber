package stepdefinition.contact;


import data.contact.ContactGenerationData;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import model.contact.ContactModel;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import page.page.contact.ContactPageCases;
import setup.SetupWebUI;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import static util.Message.MESSAGE_CONTACT_SUCCESFULL;
import static util.Message.MESSAGE_EMAIL_ERROR;
import static util.Url.DEMO_WEB_SHOP_URL;



public class ContactStepDefinitionCucumber extends SetupWebUI {

    private static final Logger LOGGER=Logger.getLogger(ContactStepDefinitionCucumber.class);

    private ContactPageCases contactPageCases;

    private ContactModel contact;

    @Dado("que el usuario navegó al home principal del sitio web")
    public void queElUsuarioNavegoAlHomePrincipalDelSitioWeb() {
        try{
            setUpLog4j2();
            setUpDriver(DEMO_WEB_SHOP_URL.getValue());
        }catch(Exception e){
            quitDriver();
            Assertions.fail(e.getMessage(), e);
            LOGGER.error(e.getMessage(), e);
        }
    }


    @Cuando("el usuario ingrese a la sección Contacto, suministre todos los datos y confirme la acción")
    public void elUsuarioIngreseALaSeccionContactoSuministreTodosLosDatosYConfirmeLaAccion() {
        try{
            contact=contact();
            contactPageCases=new ContactPageCases(driver,contact);
            contactPageCases.sucessfullContact();
        }catch (Exception e){
            quitDriver();
            Assertions.fail(e.getMessage(), e);
            LOGGER.error(e.getMessage(), e);
        }
    }

    @Entonces("el sistema mostrará que se realizo la solicitud de contacto")
    public void elSistemaMostraraQueSeRealizoLaSolicitudDeContacto() {

        try{
            Assertions.assertEquals(infoExpectedComplete(),contactPageCases.succesfullCOntactResult());
            quitDriver();
        } catch(Exception e) {
            Assertions.fail(e.getMessage(), e);
            quitDriver();
            LOGGER.error(e.getMessage(), e);
        }

    }

    @Cuando("el usuario ingrese a la sección Contacto, suministre los datos obligatorios, con email incorrecto y confirme la acción")
    public void elUsuarioIngreseALaSeccionContactoSuministreLosDatosObligatoriosYConfirmeLaAccion() {
        try{
            contact=contact();
            contactPageCases=new ContactPageCases(driver,contact);
            contactPageCases.incorrectEmailInformation();

        }catch(Exception e){
            quitDriver();
            Assertions.fail(e.getMessage(), e);
            LOGGER.error(e.getMessage(), e);
        }
    }

    @Entonces("el sistema mostrará que se ingresó un email incorrecto")
    public void elSistemaMostraraQueSeIngresoUnEmailIncorrecto() {
        Assertions.assertEquals(infoExpectedEmailError(),contactPageCases.infoActualEmailError());
        quitDriver();
    }

    private ContactModel contact() {
        contact= ContactGenerationData.contactData();
        return contact;
    }

    private ArrayList<String> infoExpectedEmailError(){
        ArrayList<String> infoExpected=new ArrayList<>();
        infoExpected.add(MESSAGE_EMAIL_ERROR.getValue());
        return infoExpected;
    }

    private ArrayList<String> infoExpectedComplete(){
        ArrayList<String> infoExpected=new ArrayList<>();
        infoExpected.add(MESSAGE_CONTACT_SUCCESFULL.getValue());
        return infoExpected;
    }

}
