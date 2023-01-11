package com.saucedemo.questions;

import com.saucedemo.userInterface.CartPage;
import com.saucedemo.userInterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class OrderByQuestion  implements Question<String> {
    public static Question<String> value(){
        return new OrderByQuestion();
    }
    @Override
    public String answeredBy(Actor actor) {
        return null;
    }
}
