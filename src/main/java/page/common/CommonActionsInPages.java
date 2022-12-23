package page.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CommonActionsInPages{

    private final WebDriver driver;

    public CommonActionsInPages(WebDriver driver) {
        this.driver = driver;
    }

    protected void scrollOn(WebElement webElement){
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView();",webElement);
    }

    protected void clearOn(WebElement webElement){
        webElement.clear();
    }

    protected void clearOnJSE(WebElement webElement){
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("arguments[0].value = '';",webElement);
    }

    protected void typeOn(WebElement webElement,CharSequence... sequence){
        webElement.sendKeys(sequence);
    }

    protected void typeOnJSE(WebElement webElement,String sequence){
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("arguments[0].value='" + sequence +"';",webElement);
    }

    protected void clickOn(WebElement webElement){
        webElement.click();
    }

    protected void clickOnBy(By locator){
        driver.findElement(locator);
    }

    protected void clickOnJSE(WebElement webElement){
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click();",webElement);
    }

}
