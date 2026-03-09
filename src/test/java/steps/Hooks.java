package steps;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.model.util.EnvironmentVariables;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    @Managed
    WebDriver driver;

    @Before
    public void LaunchDriver(){
        OnStage.setTheStage(new OnlineCast());
        EnvironmentVariables environmentVariables = Serenity.environmentVariables();
        String baseUrl = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("webdriver.base.url");
        OnStage.theActorCalled("Robot QA").can(BrowseTheWeb.with(driver));
        OnStage.theActorCalled("Robot QA").wasAbleTo(
                Open.url(baseUrl)
        );
    }
}
