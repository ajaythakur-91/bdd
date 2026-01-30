package com.qa.opencart.steps;

import com.qa.opencart.hooks.Hooks;
import com.qa.opencart.pages.GoogleHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleHomePageSteps {

    private GoogleHomePage gPage;

    public GoogleHomePageSteps(Hooks hooks){
        this.gPage= hooks.getGpage();
    }
    @Given("user is on google home page")
    public void user_is_on_google_home_page(){
    }

    @When("user look for title")
    public void user_look_for_title(){

    }
    @Then("title should be {string}")
    public void title_should_be(String expectedTitle){
       String actualTitle =gPage.pageTitle();
       Assert.assertEquals(expectedTitle,actualTitle);

    }
}
