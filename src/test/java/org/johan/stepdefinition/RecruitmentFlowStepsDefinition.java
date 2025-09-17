package org.johan.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.johan.tasks.BrowseTorecruitmentModuleTask.browseTorecruitmentModuleTask;
import static org.johan.tasks.OpenLandingPageTask.openLandingPageTask;
import static org.johan.tasks.RecruitmentProcessTask.recruitmentProcessTask;

public class RecruitmentFlowStepsDefinition extends Setup {

    private static final  String ACTOR_NAME = "Johan";


    @Given("login in the application")
    public void loginInTheApplication() {
        try {

            System.out.println("entrando al given");
            userSetupBrowser(ACTOR_NAME);
            theActorInTheSpotlight().wasAbleTo(
                    openLandingPageTask(),
                    browseTorecruitmentModuleTask()


            );



        } catch (Exception e){
            System.out.println(e);
        }
    }

    @When("add a new person in recruitment")
    public void addANewPersonInRecruitment() {

        System.out.println("entrando al When");
        userSetupBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                recruitmentProcessTask()


        );





    }
    @Then("will be visible the person data and hired status")
    public void willBeVisibleThePersonDataAndHiredStatus() {

    }

}
