package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.GittiGo.tasks.NavigateToGitti;
import starter.GittiGo.user_interfacegitti.GittiGoLogin;
import starter.n11.navigation.tasks.NavigateTo;
import starter.n11.navigation.user_interface.n11UserHomePageElements;


public class GittigoLoginStepDefinitions {
    Actor actor = Actor.named("patikabootcampers");

    @Managed
    WebDriver webDriver;

    @Given("user go to login page")
    public void userGoToLoginPage() {
        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(NavigateTo.theN11HomePage());

    }

    @When("User clicks on giris yap button")
    public void userClicksOnGirisYapButton() {

    }



    @Given("user launch browser")
    public void userLaunchBrowser() {

        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(NavigateToGitti.GittiGoHomePage());
    }

    @When("user logged in")
    public void userLoggedIn() {
        actor.attemptsTo(GittiGoLogin.loginPage("erenalparas@gmail.com","emre9196"));
    }

   /* @Then("user logged in successfully")
    public void userLoggedInSuccessfully() {


        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //serenity tester
        actor.attemptsTo(
                Ensure.that(n11UserHomePageElements.USERNAME_LINK).isDisplayed(),
                Ensure.that(n11UserHomePageElements.USERNAME_LINK).value().startsWith("serenity")

        );*/
}
