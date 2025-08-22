package com.sauceDemo.stepDefs;

import com.sauceDemo.pages.YourCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YourCart_StepDefs {

    YourCartPage yourCartPage = new YourCartPage();

    @Then("The user should be able to see the following items on the page that added before")
    public void the_user_should_be_able_to_see_the_following_items_on_the_page_that_added_before(List<String> expectedItem) {
        List<String> actualItems = yourCartPage.getCartItemsText();

       assertTrue(actualItems.containsAll(expectedItem));
    //assertEquals(expectedItem, actualItems);
    }

    @When("The user navigates to next page with related button: {string}")
    public void the_user_navigates_to_next_page_with_related_button(String buttonName) {
        yourCartPage.navigateToPageWithRelatedButton(buttonName);

    }

}
