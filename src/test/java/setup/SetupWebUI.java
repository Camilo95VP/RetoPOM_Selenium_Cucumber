package setup;

import org.apache.log4j.PropertyConfigurator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static util.Log4jValues.LOG4J_PROPERTIES_FILE_PATH;
import static com.google.common.base.StandardSystemProperty.USER_DIR;


public class SetupWebUI {

    protected WebDriver driver;

    private static final String WEBDRIVER_CHROME_DRIVER="webdriver.chrome.driver";

    private static final String WEBDRIVER_CHROME_DRIVER_PATH="src/test/resources/webdriver/chromedriver.exe";

    protected void setUpDriver(String url){
        try{
            System.setProperty(WEBDRIVER_CHROME_DRIVER,WEBDRIVER_CHROME_DRIVER_PATH);
            generalSetUp(url);
        }catch(Exception e){
            //LOGGER
            quitDriver();
        }
    }

    protected void generalSetUp(String url){
        try{
            driver=new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
        }catch(Exception e){
            quitDriver();
            //logger
        }
    }

    protected void setUpLog4j2(){
        PropertyConfigurator.configure(USER_DIR.value()+LOG4J_PROPERTIES_FILE_PATH.getValue());
    }
    @AfterEach
    protected void quitDriver(){
        driver.quit();
    }

}
