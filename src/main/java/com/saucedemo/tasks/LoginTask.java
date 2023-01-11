package com.saucedemo.tasks;

import com.saucedemo.userInterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {
    private String username;
    private String password;
    public LoginTask(String username, String password) {
        this.username = username;
        this.password = password;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginPage.USERNAME),
                Enter.theValue(password).into(LoginPage.PASSWORD),
                Click.on(LoginPage.BTN_LOGIN)
        );
    }
    public static LoginTask login(String username, String password) {
        return instrumented(LoginTask.class, username, password);
    }
}
