package com.saucedemo.tasks;

import com.saucedemo.userInterface.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RemoveItemTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartPage.REMOVE_ITEM)
        );
    }
    public static RemoveItemTask removeItem() {
        return instrumented(RemoveItemTask.class);
    }
}
