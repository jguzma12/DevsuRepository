package co.com.devsu.certification.tasks;

import co.com.devsu.certification.interactions.Wait;
import co.com.devsu.certification.userinterfaces.LoginPage;
import co.com.devsu.certification.userinterfaces.MainPage;
import co.com.devsu.certification.utils.Const;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.theSeconds(4),
                Click.on(MainPage.LOG_IN),
                SendKeys.of(Const.USUARIO).into(LoginPage.USERNAME),
                SendKeys.of(Const.CONTRASENA).into(LoginPage.PASSWORD),
                Click.on(LoginPage.LOGIN_BUTTON));
    }

    public static Login login() {
        return instrumented(Login.class);
    }
}
