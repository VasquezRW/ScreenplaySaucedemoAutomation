package stepdefinitions;

import com.saucedemo.tasks.SelectOrderTask;
import com.saucedemo.tasks.SelectTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class OrderByDefinitions {
    private Actor wilmer;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        wilmer = OnStage.theActorCalled("wilmer");
    }

    @Given("se da click en ordenar")
    public void seDaClickEnOrdenar() {
        wilmer.wasAbleTo(
                SelectTask.clickSelector()
        );
    }
    @When("click en {string}")
    public void clickEn(String string) {
        wilmer.wasAbleTo(
                SelectOrderTask.clickOption(string)
        );
    }
    @Then("validar que los items esten ordenados")
    public void validarQueLosItemsEstenOrdenados() {
        System.out.println("validado");
    }

}
