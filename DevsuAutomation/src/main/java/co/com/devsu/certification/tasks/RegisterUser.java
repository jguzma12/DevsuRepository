package co.com.devsu.certification.tasks;

import co.com.devsu.certification.userinterfaces.MainPage;
import co.com.devsu.certification.userinterfaces.RegisterPage;
import co.com.devsu.certification.utils.Const;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUser implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MainPage.SIGN_UP),
                SendKeys.of(Const.USUARIO + Const.CODE).into(RegisterPage.USERNAME),
                SendKeys.of(Const.CONTRASENA).into(RegisterPage.PASSWORD),
                Click.on(RegisterPage.SIGN_UP_BUTTON)
        );
        actor.remember("text", BrowseTheWeb.as(actor).getDriver().switchTo().alert().getText());

    }

    public static RegisterUser registerUser() {
        return instrumented(RegisterUser.class);
    }
}
