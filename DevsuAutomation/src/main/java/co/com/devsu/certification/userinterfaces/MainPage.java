package co.com.devsu.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
    public static final Target SIGN_UP = Target.the("Select Sign Up")
            .located(By.id("signin2"));
    public static final Target LOG_IN = Target.the("Select log in")
            .located(By.id("login2"));
    public static final Target LAPTOPS = Target.the("Select laptops")
            .locatedBy("(//a[@id='itemc'])[2]");
    public static final Target HOME_PAGE = Target.the("Home page")
            .locatedBy("(//*[@class='nav-link'])[1]");
    public static final Target IPHONE = Target.the("Iphone")
            .locatedBy("(//*[@class='hrefch'])[5]");

    public static final Target CART = Target.the("Select cart")
            .located(By.id("cartur"));
    public static final Target NAMEUSER = Target.the("Name of user")
            .located(By.id("nameofuser"));
    public static final Target LAPTOP_NAME = Target.the("Laptop name")
            .locatedBy("//h2[@class='name']");
    public static final Target PRICE = Target.the("Price laptop 1")
            .locatedBy("//h3[contains(text(),'$700')]");
    public static final Target DESCRIPTION = Target.the("Description laptop 1")
            .locatedBy("//strong[contains(text(),'Product description')]");
    public static final Target LAPTOP = Target.the("Select laptop")
            .locatedBy("(//h4[@class='card-title'])[3]");
}
