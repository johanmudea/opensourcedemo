package org.johan.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/recruitmentflow.feature",
        tags = "",
        glue = "org.johan.stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)


public class RecruitmentFlowRunner {
}
