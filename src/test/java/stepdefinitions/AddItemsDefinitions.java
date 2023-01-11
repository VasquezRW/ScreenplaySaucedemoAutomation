package stepdefinitions;

import com.saucedemo.tasks.AddItemsTask;
import com.saucedemo.tasks.RemoveItemTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AddItemsDefinitions {
    private Actor wilmer;
    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
        wilmer = OnStage.theActorCalled("wilmer");
    }
    @Given("Agregamos dos items al carrito")
    public void agregamosDosItemsAlCarrito() {
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
    @Then("validamos que se encuentre el item {string}")
    public void validamosQueSeEncuentreElItem(String string) {
        System.out.println("validado add Items");
    }

}
