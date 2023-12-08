package co.com.devsu.certification.questions;

import co.com.devsu.certification.userinterfaces.MainPage;
import co.com.devsu.certification.utils.Const;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.assertj.core.api.SoftAssertions;

public class ValidateLogin implements Question<Boolean> {
    private final SoftAssertions validate = new SoftAssertions();

    @Override
    public Boolean answeredBy(Actor actor) {
        validate.assertThat(MainPage.NAMEUSER.resolveFor(actor).getText()).isEqualTo(Const.TXT_CONFIRMATION_LOGIN);
        return true;
    }

    public static Question<Boolean> ValidateLogin() {
        return new ValidateLogin();
    }
}
