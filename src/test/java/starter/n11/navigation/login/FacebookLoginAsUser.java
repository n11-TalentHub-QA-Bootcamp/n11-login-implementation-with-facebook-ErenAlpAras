package starter.n11.navigation.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import starter.n11.navigation.user_interface.n11HomePageElements;
import starter.n11.navigation.user_interface.n11LoginPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class FacebookLoginAsUser implements Task {

    private final String email_text;
    private final String password_text;

    @Step("{0} Login with email '#email_text' and password '#password_text'")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(n11HomePageElements.LOGIN_LINK),
                Click.on(n11LoginPageElements.FACEBOOK_BTN),
                Click.on(n11LoginPageElements.FACEBOOK_EMAIL),
                SendKeys.of(this.email_text).into(n11LoginPageElements.FACEBOOK_EMAIL),
                Click.on(n11LoginPageElements.FACEBOOK_PASSWORD),
                SendKeys.of(this.password_text).into(n11LoginPageElements.FACEBOOK_PASSWORD),
                Click.on(n11LoginPageElements.FACEBOOK_LOGIN_BTN)
        );


    }

    public FacebookLoginAsUser(String email_text, String password_text){
        this.email_text = email_text;
        this.password_text = password_text;

    }



    public static FacebookLoginAsUser loginThePage(String email_text, String password_text) {
        return instrumented(FacebookLoginAsUser.class
                ,email_text,password_text);
    }

}
