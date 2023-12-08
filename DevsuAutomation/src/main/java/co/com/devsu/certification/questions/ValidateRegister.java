package co.com.devsu.certification.questions;

import co.com.devsu.certification.utils.Const;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateRegister implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String textCofirmation = actor.recall("text");
        if (textCofirmation.equals(Const.TXT_CONFIRMATION)) {
            return true;
        } else return false;

    }

    public static ValidateRegister validateRegister() {
        return new ValidateRegister();
    }
}
