package org.johan.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;

public class RecruitmentPageUI extends PageObject {

    public static final Target ADD_BUTTON = Target.the("BOTON +ADD").located(xpath("//button[normalize-space()='Add']"));


    public static final Target FIRST_NAME = Target.the("FIRST_NAME").located(xpath("//input[@placeholder='First Name']"));
    public static final Target LAST_NAME = Target.the("LAST_NAME").located(xpath("icon-button-sid//input[@placeholder='Last Name']"));
    public static final Target VACANCY = Target.the("VACANCY").located(xpath("//div[contains(text(),'Payroll Administrator')]"));


    public static final Target EMAIL = Target.the("EMAIL").located(id("icon-button-sidebar-close"));
    public static final Target SAVE_BUTTON = Target.the("BOTON SAVE_BUTTON").located(id("icon-button-sidebar-close"));

    public static final Target SHORTLIST_BUTTON = Target.the("BOTON SHORTLIST_BUTTON").located(id("icon-button-sidebar-close"));
    public static final Target SAVE_SHORTLIST_BUTTON = Target.the("BOTON SAVE_SHORTLIST_BUTTON").located(id("icon-button-sidebar-close"));

    public static final Target SCHEDULE_INTERVIEW_BUTTON = Target.the("BOTON SCHEDULE_INTERVIEW_BUTTON").located(id("icon-button-sidebar-close"));
    public static final Target INTERVIEW_TITLE = Target.the("INTERVIEW_TITLE").located(id("icon-button-sidebar-close"));
    public static final Target INTERVIEWER_NAME = Target.the("INTERVIEWER_NAME Joseph  Evans").located(id("icon-button-sidebar-close"));
    public static final Target INTERVIEW_DATE = Target.the("INTERVIEW_DATE").located(id("icon-button-sidebar-close"));
    public static final Target SAVE_SCHEDULE_INTERVIEW_BUTTON = Target.the("BOTON SCHEDULE_INTERVIEW_BUTTON").located(id("icon-button-sidebar-close"));

    public static final Target MARK_INTERVIEW_PASSED_BUTTON = Target.the("MARK_INTERVIEW_PASSED_BUTTON").located(id("icon-button-sidebar-close"));
    public static final Target SAVE_MARK_INTERVIEW_PASSED_BUTTON = Target.the("BOTON MARK_INTERVIEW_PASSED_BUTTON").located(id("icon-button-sidebar-close"));

    public static final Target OFFER_JOB_BUTTON = Target.the("OFFER_JOB_BUTTON").located(id("icon-button-sidebar-close"));
    public static final Target SAVE_OFFER_JOB_BUTTON = Target.the("BOTON OFFER_JOB_BUTTON").located(id("icon-button-sidebar-close"));

    public static final Target HIRE_BUTTON = Target.the("HIRE_BUTTON").located(id("icon-button-sidebar-close"));
    public static final Target SAVE_HIRE_BUTTON = Target.the("BOTON HIRE_BUTTON").located(id("icon-button-sidebar-close"));


}
