package stepdefinitions;
import com.saucedemo.questions.CheckOutQuestion;
import com.saucedemo.tasks.CheckoutDataTask;
import com.saucedemo.tasks.CheckoutTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.annotations.CastMember;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class ChekoutDefinitions {
    private Actor wilmer;
    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
        wilmer = OnStage.theActorCalled("wilmer");
    }
    @Given("En el carrito click en checkout")
    public void enElCarritoClickEnCheckout() {
        wilmer.wasAbleTo(
                CheckoutTask.ClickCheckout()
        );
    }
    @When("ingresar los datos {string} {string} {string} luego click continue y click finish")
    public void ingresarLosDatosLuegoClickContinueYClickFinish(String name, String lastName, String zipCode) {
        wilmer.wasAbleTo(
                CheckoutDataTask.IngresarDatosCheckout(name, lastName, zipCode)
        );
    }
    @Then("validar estar en la pagina de checkout {string}")
    public void validarEstarEnLaPaginaDeCheckout(String checkOutText) {
        theActorInTheSpotlight().should(
                seeThat("Title", CheckOutQuestion.value(),equalTo(checkOutText))
        );
    }
}