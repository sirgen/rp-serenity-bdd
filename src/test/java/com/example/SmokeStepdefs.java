package com.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SmokeStepdefs {

    @Steps
    SerenitySteps serenitySteps;

    @Given("^an object$")
    public void anObject() throws Throwable {
        serenitySteps.dummyMethod();
    }


    @When("^the object is created$")
    public void theObjectIsCreated() throws Throwable {
        serenitySteps.dummyMethod();
    }

    @Then("^I see the object$")
    public void iSeeTheObject() throws Throwable {
        serenitySteps.dummyMethod();
    }
}
