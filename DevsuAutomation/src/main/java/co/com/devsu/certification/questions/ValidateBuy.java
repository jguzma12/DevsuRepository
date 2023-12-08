package co.com.devsu.certification.questions;

import co.com.devsu.certification.userinterfaces.BuyPage;
import co.com.devsu.certification.utils.Const;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.assertj.core.api.SoftAssertions;

public class ValidateBuy implements Question<Boolean> {
    private final SoftAssertions validate = new SoftAssertions();

    @Override
    public Boolean answeredBy(Actor actor) {
        validate.assertThat(BuyPage.MESSAGE.resolveFor(actor).getText()).isEqualTo(Const.TXT_CONFIRMATION_BUY);
        return true;
    }

    public static Question<Boolean> ValidateBuy() {
        return new ValidateBuy();
    }
}
