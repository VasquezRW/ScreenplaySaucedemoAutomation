package com.saucedemo.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage extends PageObject{
    public static final By ITEM_TEXT = By.xpath("//div[contains(text(),'Sauce Labs Onesie')]");
    public static final Target CHECKOUT_BTN = Target.the("Primer Item").locatedBy("//button[@id='checkout']");
    public static final Target REMOVE_ITEM = Target.the("Boton remover item").locatedBy("//button[@id='remove-sauce-labs-bike-light']");
}