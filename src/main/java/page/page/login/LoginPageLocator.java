package page.page.login;

import page.common.CommonActionsInPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPageLocator extends CommonActionsInPages {

    @FindBy(xpath = "//a[@class='ico-login']")
    protected WebElement btnLoginLocator;

    @FindBy(id="Email")
    protected WebElement emailLocator;

    @FindBy(id="Password")
    protected WebElement passwordLocator;

    @FindBy(xpath="//input[@class='button-1 login-button']")
    protected WebElement submitLocator;


    //validaciones
    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    protected WebElement alertLocator;

    @FindBy(xpath="//a[@href='/customer/info']")
    protected WebElement emailSuccess;

    public LoginPageLocator(WebDriver driver) {
        super(driver);

        PageFactory.initElements(driver,this);
    }
}
