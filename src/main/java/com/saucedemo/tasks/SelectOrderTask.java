package com.saucedemo.tasks;

import com.saucedemo.userInterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectOrderTask implements Task {
    String option;
    public SelectOrderTask(String option) {
        this.option = option;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.OPTION_ORDER)
        );
    }

    public static SelectOrderTask clickOption(String option) {
        return instrumented(SelectOrderTask.class, option);
    }
}