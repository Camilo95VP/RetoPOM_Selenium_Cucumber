package page.page.contact;

import page.common.CommonActionsInPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPageLocator extends CommonActionsInPages {

    @CacheLookup
    @FindBy(xpath="/html/body/div[4]/div[2]/div[1]/div[1]/ul/li[6]/a")
    protected WebElement contactButtonLocator;

    @CacheLookup
    @FindBy(id="FullName")
    protected WebElement nameLocator;

    @CacheLookup
    @FindBy(id="Email")
    protected WebElement emailLocator;

    @CacheLookup
    @FindBy(id="Enquiry")
    protected WebElement enquiryLocator;

    @CacheLookup
    @FindBy(xpath="//input[@name='send-email']")
    protected WebElement btnSubmitLocator;

    //Validaciones

    @FindBy(xpath="//span[@for='Email']")
    protected WebElement alertLocator;

    @FindBy(xpath = "//div[@class='result']")
    protected WebElement succesfulContact;

    public ContactPageLocator(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
}
