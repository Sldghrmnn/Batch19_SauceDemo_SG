package com.sauceDemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutFinishPage extends BasePage{

    @FindBy(tagName = "h2")
    private WebElement successMessage;

    public String getSuccessMessageText(){
        return successMessage.getText();
    }
}
