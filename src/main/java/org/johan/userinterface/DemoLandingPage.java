package org.johan.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class DemoLandingPage  extends PageObject {

    public static final Target USERNAME_BOX = Target.the("CAMPO NOMBRE USUARIO").located(xpath("//input[@placeholder='Username']"));

    public static final Target PASSWORD_BOX = Target.the("CAMPO CONTRASEÑA USUARIO").located(xpath("//input[@placeholder='Password']"));

    public static final Target LOGIN_BUTTON = Target.the("BOTON LOGIN").located(xpath("//button[normalize-space()='Login']"));

}

