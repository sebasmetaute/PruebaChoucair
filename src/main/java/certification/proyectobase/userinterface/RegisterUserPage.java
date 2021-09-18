package certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class RegisterUserPage {

    public static final Target SIGNIN = Target.the("")
            .located(By.xpath("//a[@class='login']"));
    public static final Target EMAIL = Target.the("")
            .located(By.id("email_create"));
    public static final Target BUTTON = Target.the("")
            .located(By.xpath("//span[contains(.,'Create an account')]"));
    public static final Target FIRST_NAME = Target.the("")
            .located(By.id("customer_firstname"));
    public static final Target LAST_NAME = Target.the("")
            .located(By.id("customer_lastname"));
    public static final Target EMAILDOS = Target.the("")
            .located(By.id("email"));
    public static final Target PASSWORD = Target.the("")
            .located(By.id("passwd"));
    public static final Target FIRST_NAMEDOS = Target.the("")
            .located(By.id("firstname"));
    public static final Target LAST_NAMEDOS = Target.the("")
            .located(By.id("lastname"));
    public static final Target ADDRESS = Target.the("")
            .located(By.id("address1"));
    public static final Target CITY = Target.the("")
            .located(By.id("city"));
    public static final Target STATE = Target.the("")
            .located(By.id("id_state"));
    public static final Target COUNTRY = Target.the("")
            .located(By.id("id_country"));
    public static final Target POSTAL = Target.the("")
            .located(By.id("postcode"));
    public static final Target PHONE_NUMBER = Target.the("")
            .located(By.id("phone_mobile"));
    public static final Target ALIAS = Target.the("")
            .located(By.id("alias"));
    public static final Target REGISTER = Target.the("")
            .located(By.id("submitAccount"));
    public static final Target ANSWER_REGISTER = Target.the("")
            .located(By.xpath("//a[contains(text(),'My account')]"));



}
