package starter.n11.navigation.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class n11LoginPageElements {

    public static Target FACEBOOK_BTN = Target.the("facebook btn").located(By.cssSelector("div[class='facebook_large medium facebookBtn  btnLogin']"));

    public static Target FACEBOOK_EMAIL = Target.the("facebook email").located(By.cssSelector("div>input[type='text']"));
    public static Target FACEBOOK_PASSWORD = Target.the("facebook password").located(By.cssSelector("input[type='password']"));
    public static Target FACEBOOK_LOGIN_BTN = Target.the("facebook login btn").located(By.cssSelector("input[name='login']"));

}
