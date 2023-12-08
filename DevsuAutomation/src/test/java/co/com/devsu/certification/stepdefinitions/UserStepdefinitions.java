package co.com.devsu.certification.stepdefinitions;

import co.com.devsu.certification.questions.ValidateBuy;
import co.com.devsu.certification.questions.ValidateLogin;
import co.com.devsu.certification.questions.ValidateRegister;
import co.com.devsu.certification.tasks.Buy;
import co.com.devsu.certification.tasks.Login;
import co.com.devsu.certification.tasks.RegisterUser;
import co.com.devsu.certification.utils.Const;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserStepdefinitions {
    @Managed
    WebDriver driver;

    @Before
    public void setup() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("Actor");

    }

    @Given("^User in the homepage$")
    public void userInTheHomepage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Const.URL_DEMON));
    }

    @When("^The user enters the fields for registration$")
    public void theUserEntersTheFieldsForRegistration() {
        theActorInTheSpotlight().attemptsTo(RegisterUser.registerUser());

    }

    @Then("^The user register succesfully$")
    public void theUserRegisterSuccesfully() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateRegister.validateRegister()));

    }

    @When("^The user logs in successfully$")
    public void theUserLogsInSuccessfully() {
        theActorInTheSpotlight().attemptsTo(Login.login());

    }

    @Then("^the user can see username$")
    public void theCanSeeUsername() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateLogin.ValidateLogin(), Matchers.is(true)));

    }


    @When("^the user logs in successfully, they go to the laptop section and purchase one\\.$")
    public void theUserLogsInSuccessfullyTheyGoToTheLaptopSectionAndPurchaseOne() {
        theActorInTheSpotlight().attemptsTo(Buy.buyLaptop());

    }

    @Then("^The user can see a message after confirming their purchase$")
    public void theUserCanSeeAMessageAfterConfirmingTheirPurchase() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateBuy.ValidateBuy(), Matchers.is(true)));
    }


}
