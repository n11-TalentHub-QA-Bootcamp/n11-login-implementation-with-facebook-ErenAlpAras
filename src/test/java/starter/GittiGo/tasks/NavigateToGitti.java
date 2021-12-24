package starter.GittiGo.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.GittiGo.user_interfacegitti.GittiGoHomePage;
import starter.n11.navigation.user_interface.n11HomePage;

public class NavigateToGitti {

    public static Performable GittiGoHomePage() {
        return Task.where("{0} user launch browser",
                Open.browserOn().the(GittiGoHomePage.class));
    }
}
