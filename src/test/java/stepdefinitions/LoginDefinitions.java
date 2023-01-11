package stepdefinitions;

import com.saucedemo.questions.LoginQuestion;
import com.saucedemo.tasks.LoginTask;
import com.saucedemo.userInterface.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.annotations.CastMember;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginDefinitions {
    @CastMember
    private Actor wilmer = Actor.named("Wilmer");
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        wilmer = OnStage.theActorCalled("wilmer");
    }
    private LoginPage loginPage = new LoginPage();
    @Given("que el usuario ingrese a la pagina web")
    public void queElUsuarioIngreseALaPaginaWeb() {
        wilmer.wasAbleTo(
                Open.browserOn(loginPage)
        );
    }
    @When("el usuario ingrese las credenciales {string} {string} y presione ingresar")
    public void elUsuarioIngreseLasCredenciales(String username, String password) {
        wilmer.wasAbleTo(
                LoginTask.login(username, password)
        );
    }
    @Then("validamos que estemos en la pagina principal {string}")
    public void validamosQueEstemosEnLaPaginaPrincipal(String title) {
        theActorInTheSpotlight().should(
                seeThat("Title", LoginQuestion.value(),equalTo(title))
        );
    }

}
