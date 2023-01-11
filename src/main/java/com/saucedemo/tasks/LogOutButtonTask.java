package com.saucedemo.tasks;

import com.saucedemo.userInterface.LogOutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogOutButtonTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LogOutPage.LOGOUT_BUTTON)
        );
    }
    public static LogOutButtonTask clickLogout() {
        return instrumented(LogOutButtonTask.class);
    }
}
