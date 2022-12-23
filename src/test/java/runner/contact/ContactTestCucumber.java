package runner.contact;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true,
        features = {"src/test/resources/feature/contact/contactFeature.feature"},
        glue={"stepdefinition.contact"},
        tags = "@Regresion"
)
public class ContactTestCucumber {

}
