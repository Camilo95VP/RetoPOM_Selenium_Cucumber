package page.page.login;

import model.login.LoginModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class LoginPageCases extends LoginPageLocator{

    private final WebDriver driver;

    private final LoginModel login;

    public LoginPageCases(WebDriver driver, LoginModel login) {
        super(driver);
        this.driver=driver;
        this.login=login;
    }

    public void onlySubmit(){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        scrollOn(btnLoginLocator);
        clickOnJSE(btnLoginLocator);

        scrollOn(submitLocator);
        clickOnJSE(submitLocator);

        WebDriverWait wdw=new WebDriverWait(driver,10);
        wdw.until(ExpectedConditions.visibilityOf(alertLocator));
    }

    public void fillLogin(){

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        clickOnJSE(btnLoginLocator);

        scrollOn(emailLocator);
        clearOnJSE(emailLocator);
        typeOnJSE(emailLocator,login.getEmail());

        scrollOn(passwordLocator);
        clearOnJSE(passwordLocator);
        typeOnJSE(passwordLocator,login.getPassword());

        scrollOn(submitLocator);
        clickOnJSE(submitLocator);

        WebDriverWait wdw=new WebDriverWait(driver,10);
        wdw.until(ExpectedConditions.visibilityOf(emailSuccess));
    }

    public List<String> infoActualFillBlank() {
        ArrayList<String> infoActual=new ArrayList<>();
        infoActual.add(alertLocator.getText());
        return infoActual;
    }

    public List<String> infoActualCorrectLogin() {
        ArrayList<String> infoActual=new ArrayList<>();
        infoActual.add(emailSuccess.getText());
        return infoActual;
    }


}
