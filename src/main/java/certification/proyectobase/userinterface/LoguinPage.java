package certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LoguinPage {

    public static final Target ICON = Target.the("")
            .located(By.xpath("//a[@class='login']"));
    public static final Target USER = Target.the("")
            .located(By.id("email"));
    public static final Target PASSWORD = Target.the("")
            .located(By.id("passwd"));
    public static final Target SIGN_IN = Target.the("")
            .located(By.id("SubmitLogin"));
    public static final Target ANSWER = Target.the("")
            .located(By.xpath("//a[contains(text(),'My account')]"));








}
