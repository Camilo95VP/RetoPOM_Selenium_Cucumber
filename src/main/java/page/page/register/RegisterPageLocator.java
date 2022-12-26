package page.page.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.common.CommonActionsInPages;

public class RegisterPageLocator extends CommonActionsInPages {

    @CacheLookup
    @FindBy(id="gender-male")
    protected WebElement genderLocator;
    @CacheLookup
    @FindBy(id="FirstName")
    protected WebElement nameLocator;

    @CacheLookup
    @FindBy(id="LastName")
    protected WebElement lastNameLocator;

    @CacheLookup
    @FindBy(id="Email")
    protected WebElement emailLocator;


    @CacheLookup
    @FindBy(id="Password")
    protected WebElement passwordLocator;

    @CacheLookup
    @FindBy(id="ConfirmPassword")
    protected WebElement passwordConfirmLocator;

    @CacheLookup
    @FindBy(id="register-button")
    protected WebElement btnSubmitLocator;


    //Validaciones

    @FindBy(xpath="//span[@for='ConfirmPassword']")
    protected WebElement alertMSGLocator;

    @FindBy(xpath = "//div[@class='result']")
    protected WebElement alertSuccessfulRegister;

    @FindBy(xpath="//input[@id='gender-male']")
    protected WebElement gender;

    public RegisterPageLocator(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
}
