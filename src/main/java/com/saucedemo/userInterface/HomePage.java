package com.saucedemo.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage {
    public static final By TITLE_HP = By.xpath("//span[@class='title']");
    public static final Target SelectBtn = Target.the("Boton ordenar").locatedBy("//select[@class='product_sort_container']");
    public static final Target OPTION_ORDER = Target.the("OPTION").locatedBy("//option[@value='lohi']");
    public static final Target ITEM_1 = Target.the("Primer Item").locatedBy("//button[@id='add-to-cart-sauce-labs-onesie']");
    public static final Target ITEM_2 = Target.the("Segundo Item").locatedBy("//button[@id='add-to-cart-sauce-labs-bike-light']");
    public static final Target BTN_CART= Target.the("Boton Carrito").locatedBy("//a[@class='shopping_cart_link']");
}
