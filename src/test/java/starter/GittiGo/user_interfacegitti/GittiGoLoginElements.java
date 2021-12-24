package starter.GittiGo.user_interfacegitti;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
public class GittiGoLoginElements {
    public static Target EMAIL_FIELD = Target.the("email textbox").located(By.id("L-UserNameField"));
    public static Target PASSWORD_FIELD = Target.the("pass textbox").located(By.id("L-PasswordField"));
    public static Target LOGIN_BTN = Target.the("login btn").located(By.id("gg-login-enter"));
    public static Target LOGIN_LINK = Target.the("login link").located(By.xpath("//a[@data-cy='header-login-button']"));
}
