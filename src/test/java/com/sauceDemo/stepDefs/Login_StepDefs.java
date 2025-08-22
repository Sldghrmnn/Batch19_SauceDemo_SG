package com.sauceDemo.stepDefs;

import com.sauceDemo.pages.LoginPage;
import com.sauceDemo.utilities.ConfigurationReader;
import com.sauceDemo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user type in valid credentials {string} and {string}")
    public void the_user_type_in_valid_credentials_and(String username, String password) {
        loginPage.login(username,password);
    }


}
