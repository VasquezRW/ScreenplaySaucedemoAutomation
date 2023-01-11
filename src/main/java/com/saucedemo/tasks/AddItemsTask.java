package com.saucedemo.tasks;

import com.saucedemo.userInterface.CartPage;
import com.saucedemo.userInterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddItemsTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.ITEM_1),
                Click.on(HomePage.ITEM_2),
                Click.on(HomePage.BTN_CART)
        );
    }
    public static AddItemsTask addItems() {
        return instrumented(AddItemsTask.class);
    }
}
