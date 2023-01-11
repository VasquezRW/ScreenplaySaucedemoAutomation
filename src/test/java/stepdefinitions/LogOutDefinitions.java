package stepdefinitions;

import com.saucedemo.questions.LogOutQuestion;
import com.saucedemo.tasks.LogOutButtonTask;
import com.saucedemo.tasks.LogOutTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LogOutDefinitions {
    private Actor wilmer;
    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
        wilmer = OnStage.theActorCalled("wilmer");
    }
    @Given("click menu")
    public void clickMenu() {
        wilmer.wasAbleTo(
                LogOutTask.clickMenu()
        );
    }
    @When("click logout")
    public void clickLogout() {
        wilmer.wasAbleTo(
                LogOutButtonTask.clickLogout()
        );
    }
    @Then("validar estar en la pagina de login {string}")
    public void validarEstarEnLaPaginaDeLogin(String string) {
        theActorInTheSpotlight().should(
                seeThat("Boton Login", LogOutQuestion.value(),equalTo(string))
        );
    }
}
