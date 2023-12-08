package co.com.devsu.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage {
    public static final Target USERNAME = Target.the("Field User name")
            .located(By.id("sign-username"));
    public static final Target PASSWORD = Target.the("Field password")
            .located(By.id("sign-password"));
    public static final Target SIGN_UP_BUTTON = Target.the("Button sign up")
            .locatedBy("(//button[@class='btn btn-primary'])[2]");
}
