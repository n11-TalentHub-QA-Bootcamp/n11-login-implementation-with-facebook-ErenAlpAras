package starter.n11SelllerOffice;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class N11SellerOfficeSignUp {
    Actor actor = Actor.named("patikabootcampers");
    @Managed
    WebDriver webDriver;

    @When("user signed in selleroffice with valid credentials")
    public void userSignedInSellerofficeWithValidCredentials() {


    }
}
