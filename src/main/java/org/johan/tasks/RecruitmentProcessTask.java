package org.johan.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static org.johan.userinterface.RecruitmentPageUI.*;

public class RecruitmentProcessTask implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {

        t.attemptsTo(
                Scroll.to(ADD_BUTTON),
                Click.on(ADD_BUTTON),
                Scroll.to(FIRST_NAME),
                Enter.theValue("Johan").into(FIRST_NAME),
                Scroll.to(LAST_NAME),
                Enter.theValue("Prueba").into(LAST_NAME),
                Scroll.to(VACANCY),
                Click.on(VACANCY)





/*                Enter.theValue("Admin").into(USERNAME_BOX),
                Scroll.to(PASSWORD_BOX),
                Enter.theValue("admin123").into(PASSWORD_BOX),
                Scroll.to(LOGIN_BUTTON),
                Click.on(LOGIN_BUTTON),
                Scroll.to(RECRUITMENT_BUTTON),
                Click.on(RECRUITMENT_BUTTON)*/

        );

    }
    public static RecruitmentProcessTask recruitmentProcessTask (){
        return new RecruitmentProcessTask();
    }
}
