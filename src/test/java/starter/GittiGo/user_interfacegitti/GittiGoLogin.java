package starter.GittiGo.user_interfacegitti;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class GittiGoLogin implements Task {
   protected String email_text;
   protected String password_text;
    @Step("Login with email '#email_text' and password '#password_text'")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(GittiGoLoginElements.LOGIN_LINK),
                WaitUntil.the(GittiGoLoginElements.EMAIL_FIELD,isClickable()).forNoMoreThan(2).seconds(),
                Click.on(GittiGoLoginElements.EMAIL_FIELD),
                SendKeys.of(this.email_text).into(GittiGoLoginElements.EMAIL_FIELD),
                Click.on(GittiGoLoginElements.PASSWORD_FIELD),
                SendKeys.of(this.password_text).into(GittiGoLoginElements.PASSWORD_FIELD)
                        .thenHit(Keys.ENTER)
        );



    }

    public static GittiGoLogin loginPage(String email_text, String password_text) {
        return instrumented(GittiGoLogin.class
                ,email_text,password_text);
    }
}
