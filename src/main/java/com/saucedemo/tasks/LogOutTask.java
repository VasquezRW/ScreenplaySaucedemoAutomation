package com.saucedemo.tasks;

import com.saucedemo.userInterface.LogOutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogOutTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LogOutPage.MENU_BUTTON)
        );
    }
    public static LogOutTask clickMenu() {
        return instrumented(LogOutTask.class);
    }

}
