package co.com.devsu.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target USERNAME = Target.the("Field User name")
            .located(By.id("loginusername"));
    public static final Target PASSWORD = Target.the("Field password")
            .located(By.id("loginpassword"));
    public static final Target LOGIN_BUTTON = Target.the("Button login")
            .locatedBy("(//button[@class='btn btn-primary'])[3]");
}
