package com.sauceDemo.stepDefs;

import com.sauceDemo.pages.CheckoutFinishPage;
import com.sauceDemo.pages.CheckoutOverviewPage;
import com.sauceDemo.pages.CheckoutYourInformationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Checkout_StepDefs {

    CheckoutYourInformationPage checkoutYourInformationPage= new CheckoutYourInformationPage();
    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();
    CheckoutFinishPage checkoutFinishPage = new CheckoutFinishPage();

    @When("The user fills the your information form with following data")
    public void the_user_fills_the_your_information_form_with_following_data(Map<String,String> userData) {
        checkoutYourInformationPage.fillYourInfermationForm(userData.get("first_name"),userData.get("last_name"),userData.get("postal_code"));

    }
    @Then("The user should be able to verify total price with {string}")
    public void the_user_should_be_able_to_verify_total_price_with(String expectedPrice) {
        String actualTotalPrice = checkoutOverviewPage.geetTotalPrice();
       assertEquals(expectedPrice,actualTotalPrice);


    }
    @Then("The user verifies the success shopping message: {string}")
    public void the_user_verifies_the_success_shopping_message(String expectedMessage) {
        String actualMessage = checkoutFinishPage.getSuccessMessageText();
        assertEquals(expectedMessage,actualMessage);


    }
}
