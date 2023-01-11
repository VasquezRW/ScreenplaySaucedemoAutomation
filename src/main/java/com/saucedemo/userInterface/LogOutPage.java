package com.saucedemo.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogOutPage extends PageObject {
    public static final Target MENU_BUTTON = Target.the("Boton Menu").locatedBy("//button[@id='react-burger-menu-btn']");
    public static final Target LOGOUT_BUTTON = Target.the("Boton Logout").locatedBy("//a[@id='logout_sidebar_link']");


}
