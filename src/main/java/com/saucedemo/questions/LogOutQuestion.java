package com.saucedemo.questions;

import com.saucedemo.userInterface.CheckOutPage;
import com.saucedemo.userInterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class LogOutQuestion implements Question<String> {
    public static Question<String> value(){
        return new LogOutQuestion();
    }
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(LoginPage.BTN_LOGIN).getTextValue().toUpperCase();
    }
}
