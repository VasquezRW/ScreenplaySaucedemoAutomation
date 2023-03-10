package stepdefinitions;

import com.saucedemo.questions.AddItemQuestion;
import com.saucedemo.questions.OrderByQuestion;
import com.saucedemo.tasks.AddItemsTask;
import com.saucedemo.tasks.RemoveItemTask;
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

public class AddItemsDefinitions {
    private Actor wilmer;
    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
        wilmer = OnStage.theActorCalled("wilmer");
    }
    @Given("Agregar dos items al carrito")
    public void agregarDosItemsAlCarrito() {
        wilmer.wasAbleTo(
                AddItemsTask.addItems()
        );
    }
    @When("click en carrito y click remove al segundo item")
    public void clickEnCarritoYClickRemoveAlSegundoItem() {
        wilmer.wasAbleTo(
                RemoveItemTask.removeItem()
        );
    }
    @Then("validar que se encuentre el item {string}")
    public void validarQueSeEncuentreElItem(String string) {
        theActorInTheSpotlight().should(
                seeThat("Title", AddItemQuestion.value(),equalTo(string))
        );
    }
}