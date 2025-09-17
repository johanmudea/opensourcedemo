package org.johan.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static org.johan.userinterface.DemoLandingPage.*;
import static org.johan.userinterface.HomePageUI.RECRUITMENT_BUTTON;

public class BrowseTorecruitmentModuleTask implements Task {


    @Override
    public <T extends Actor> void performAs(T t) {

        t.attemptsTo(
                Scroll.to(USERNAME_BOX),
                Enter.theValue("Admin").into(USERNAME_BOX),
                Scroll.to(PASSWORD_BOX),
                Enter.theValue("admin123").into(PASSWORD_BOX),
                Scroll.to(LOGIN_BUTTON),
                Click.on(LOGIN_BUTTON),
                Scroll.to(RECRUITMENT_BUTTON),
                Click.on(RECRUITMENT_BUTTON)

        );

    }
    public static BrowseTorecruitmentModuleTask browseTorecruitmentModuleTask (){
        return new BrowseTorecruitmentModuleTask();
    }

}
