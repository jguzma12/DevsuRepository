package co.com.devsu.certification.tasks;

import co.com.devsu.certification.interactions.Wait;
import co.com.devsu.certification.userinterfaces.BuyPage;
import co.com.devsu.certification.userinterfaces.MainPage;
import co.com.devsu.certification.utils.Const;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Buy implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Login.login(),
                Wait.theSeconds(2),
                Click.on(MainPage.LAPTOPS),
                Click.on(BuyPage.LAPTOP),
                Click.on(BuyPage.ADD_CART));
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

        actor.attemptsTo(
                Click.on(MainPage.HOME_PAGE),
                Click.on(MainPage.IPHONE),
                Click.on(BuyPage.ADD_CART));
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
        actor.attemptsTo(
                Click.on(MainPage.CART),
                Click.on(BuyPage.PLACE_ORDER),
                SendKeys.of(Const.NOMBRE).into(BuyPage.NAME),
                SendKeys.of(Const.PAIS).into(BuyPage.COUNTRY),
                SendKeys.of(Const.CIUDAD).into(BuyPage.CITY),
                SendKeys.of(Const.TARJETA).into(BuyPage.CREDIT_CARD),
                SendKeys.of(Const.MES).into(BuyPage.MONTH),
                SendKeys.of(Const.YEAR).into(BuyPage.YEAR),
                Click.on(BuyPage.PURCHASE)
        );
    }

    public static Buy buyLaptop() {
        return instrumented(Buy.class);
    }
}
