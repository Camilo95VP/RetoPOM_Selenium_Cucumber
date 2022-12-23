package page.page.contact;

import model.contact.ContactModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;


public class ContactPageCases extends ContactPageLocator{

    private final ContactModel contact;
    private final WebDriver driver;
    public ContactPageCases(WebDriver driver,ContactModel contact) {
        super(driver);
        this.driver=driver;
        this.contact=contact;
    }

    public void incorrectEmailInformation() {

        scrollOn(contactButtonLocator);
        clickOnJSE(contactButtonLocator);

        scrollOn(nameLocator);
        clearOn(nameLocator);
        typeOn(nameLocator,contact.getName());

        scrollOn(emailLocator);
        clearOn(emailLocator);
        typeOn(emailLocator,contact.getEmail()+"-");

        scrollOn(enquiryLocator);
        clearOn(enquiryLocator);
        typeOn(enquiryLocator, contact.getEnquiry());

        scrollOn(btnSubmitLocator);
        clickOnJSE(btnSubmitLocator);

        WebDriverWait wdw2=new WebDriverWait(driver,300);
        wdw2.until(ExpectedConditions.visibilityOf(alertLocator));
    }





    public void sucessfullContact() {

        scrollOn(contactButtonLocator);
        clickOnJSE(contactButtonLocator);

        scrollOn(nameLocator);
        clearOn(nameLocator);
        typeOn(nameLocator,contact.getName());

        scrollOn(emailLocator);
        clearOn(emailLocator);
        typeOn(emailLocator,contact.getEmail());

        scrollOn(enquiryLocator);
        clearOn(enquiryLocator);
        typeOn(enquiryLocator, contact.getEnquiry());

        scrollOn(btnSubmitLocator);
        clickOnJSE(btnSubmitLocator);

        WebDriverWait wdw2=new WebDriverWait(driver,300);
        wdw2.until(ExpectedConditions.visibilityOf(succesfulContact));
    }

    public List<String> infoActualEmailError(){
        ArrayList<String> infoActual=new ArrayList<>();
        infoActual.add(alertLocator.getText().trim());
        return infoActual;
    }

    public List<String> succesfullCOntactResult(){
        ArrayList<String> infoActual=new ArrayList<>();
        infoActual.add(succesfulContact.getText().trim());
        return infoActual;
    }
}
