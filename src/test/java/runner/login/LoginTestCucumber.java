package runner.login;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true,
        features = {"src/test/resources/feature/login/loginFeature.feature"},
        glue={"stepdefinition.login"},
        tags = "@Regresion"
)
public class LoginTestCucumber {
}
