package com.saucedemo.questions;

import com.saucedemo.userInterface.CartPage;
import com.saucedemo.userInterface.CheckOutPage;
import com.saucedemo.userInterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CheckOutQuestion implements Question<String> {
    public static Question<String> value(){
        return new CheckOutQuestion();
    }
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(CheckOutPage.TITLE_HP).getText();
    }
}
