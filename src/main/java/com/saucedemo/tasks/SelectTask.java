package com.saucedemo.tasks;

import com.saucedemo.userInterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.SelectBtn)
        );
    }
    public static SelectTask clickSelector() {
        return instrumented(SelectTask.class);
    }
}
