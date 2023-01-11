package com.saucedemo.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage extends PageObject {
    public static final Target ITEM_1= Target.the("Primer Item").locatedBy("//button[@id='add-to-cart-sauce-labs-onesie']");
    public static final Target ITEM_2= Target.the("Segundo Item").locatedBy("//button[@id='add-to-cart-sauce-labs-bike-light']");
    public static final By CART_ITEM = By.xpath("//a[@id='item_2_title_link']");
    public static final Target REMOVE_ITEM = Target.the("Boton remover item").locatedBy("//button[@id='remove-sauce-labs-bike-light']");
}