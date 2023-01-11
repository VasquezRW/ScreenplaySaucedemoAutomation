package com.saucedemo.questions;

import com.saucedemo.userInterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class LoginQuestion implements Question<String> {
    public static Question<String> value(){
        return new LoginQuestion();
    }
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(HomePage.TITLE_HP).getText();
    }
}
