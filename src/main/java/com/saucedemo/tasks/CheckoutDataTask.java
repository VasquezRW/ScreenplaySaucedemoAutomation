package com.saucedemo.tasks;

import com.saucedemo.userInterface.CheckOutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckoutDataTask implements Task {
    String name, lastName, zipCode;
    public  CheckoutDataTask(String name, String lastName, String zipCode) {
        this.name = name;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(CheckOutPage.INPUT_FIRSTNAME),
                Enter.theValue(lastName).into(CheckOutPage.INPUT_LASTNAME),
                Enter.theValue(zipCode).into(CheckOutPage.INPUT_ZIP),
                Click.on(CheckOutPage.CONTINUE_BTN),
                Click.on(CheckOutPage.FINISH_BTN)
        );
    }
    public static CheckoutDataTask IngresarDatosCheckout(String name, String lastName, String zipCode) {
        return instrumented(CheckoutDataTask.class, name, lastName, zipCode);
    }
}
