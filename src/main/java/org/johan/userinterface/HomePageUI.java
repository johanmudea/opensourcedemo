package org.johan.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class HomePageUI extends PageObject {

    public static final Target RECRUITMENT_BUTTON = Target.the("BOTON RECRUITMENT").located(xpath("//span[normalize-space()='Recruitment']"));

}
