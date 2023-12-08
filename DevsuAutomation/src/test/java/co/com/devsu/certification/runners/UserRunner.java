package co.com.devsu.certification.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/user_demon.feature",
        glue = "co.com.devsu.certification.stepdefinitions",
        snippets = SnippetType.CAMELCASE


)
public class UserRunner {
}
