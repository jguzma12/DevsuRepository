package co.com.devsu.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuyPage {
    public static final Target LAPTOP = Target.the("Select laptop")
            .locatedBy("(//h4[@class='card-title'])[3]");
    public static final Target ADD_CART = Target.the("Add to cart")
            .locatedBy("//*[@class='btn btn-success btn-lg']");
    public static final Target PLACE_ORDER = Target.the("Place order")
            .locatedBy("//button[@class='btn btn-success']");
    public static final Target NAME = Target.the("Name")
            .located(By.id("name"));
    public static final Target COUNTRY = Target.the("Country")
            .located(By.id("country"));
    public static final Target CITY = Target.the("City")
            .located(By.id("city"));
    public static final Target CREDIT_CARD = Target.the("Credit card")
            .located(By.id("card"));
    public static final Target MONTH = Target.the("Month")
            .located(By.id("month"));
    public static final Target YEAR = Target.the("Year")
            .located(By.id("year"));
    public static final Target PURCHASE = Target.the("Purchase button")
            .locatedBy("//button[@onclick='purchaseOrder()']");
    public static final Target MESSAGE = Target.the("Message")
            .locatedBy("//h2[contains(text(),'Thank you for your purchase!')]");
}
