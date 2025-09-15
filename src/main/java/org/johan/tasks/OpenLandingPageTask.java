package org.johan.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.johan.userinterface.DemoLandingPage;

public class OpenLandingPageTask implements Task {

    DemoLandingPage demoLandingPage;
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Open.browserOn(demoLandingPage)
        );

    }
    public static OpenLandingPageTask openLandingPageTask (){
        return new OpenLandingPageTask();
    }
}
