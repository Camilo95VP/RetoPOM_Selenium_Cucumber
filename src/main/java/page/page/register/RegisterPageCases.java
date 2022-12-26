package page.page.register;

import model.register.RegisterModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class RegisterPageCases extends RegisterPageLocator {

    private final RegisterModel registerModel;

    private final WebDriver driver;

    public RegisterPageCases(WebDriver driver, RegisterModel register) {
        super(driver);
        this.driver=driver;
        this.registerModel=register;

    }
    public void unSuccesfullRegisterKeyError(){

        scrollOn(genderLocator);
        clickOnJSE(genderLocator);
        clickOn(gender);

        scrollOn(nameLocator);
        clearOn(nameLocator);
        typeOn(nameLocator,registerModel.getName());

        scrollOn(lastNameLocator);
        clearOn(lastNameLocator);
        typeOn(lastNameLocator,registerModel.getLastName());

        scrollOn(emailLocator);
        clearOn(emailLocator);
        typeOn(emailLocator, registerModel.getEmail());

        scrollOn(passwordLocator);
        clearOn(passwordLocator);
        typeOn(passwordLocator,registerModel.getPassword());

        scrollOn(passwordConfirmLocator);
        clearOn(passwordConfirmLocator);
        typeOn(passwordConfirmLocator,registerModel.getPassword()+"-");

        scrollOn(btnSubmitLocator);
        clickOnJSE(btnSubmitLocator);

        WebDriverWait wdw=new WebDriverWait(driver,10);
        wdw.until(ExpectedConditions.visibilityOf(alertMSGLocator));

    }


    public void succesfullRegister() {

        scrollOn(genderLocator);
        clickOnJSE(genderLocator);
        clickOn(gender);

        scrollOn(nameLocator);
        clearOn(nameLocator);
        typeOn(nameLocator,registerModel.getName());

        scrollOn(lastNameLocator);
        clearOn(lastNameLocator);
        typeOn(lastNameLocator,registerModel.getLastName());

        scrollOn(emailLocator);
        clearOn(emailLocator);
        typeOn(emailLocator, registerModel.getEmail());

        scrollOn(passwordLocator);
        clearOn(passwordLocator);
        typeOn(passwordLocator,registerModel.getPassword());

        scrollOn(passwordConfirmLocator);
        clearOn(passwordConfirmLocator);
        typeOn(passwordConfirmLocator,registerModel.getPassword());

        scrollOn(btnSubmitLocator);
        clickOnJSE(btnSubmitLocator);

        WebDriverWait wdw=new WebDriverWait(driver,10);
        wdw.until(ExpectedConditions.visibilityOf(alertSuccessfulRegister));
    }



    public List<String> infoActualKeyError(){
        ArrayList<String> infoActual=new ArrayList<>();
        infoActual.add(alertMSGLocator.getText());
        return infoActual;
    }

    public List<String> infoActualSucessful(){
        ArrayList<String> infoActual=new ArrayList<>();
        infoActual.add(alertSuccessfulRegister.getText());
        return infoActual;
    }
}
