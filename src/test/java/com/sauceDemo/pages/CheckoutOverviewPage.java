package com.sauceDemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage extends BasePage{

    @FindBy(css=".summary_total_label")
    private WebElement totalPrice;

    public String geetTotalPrice(){
        return totalPrice.getText();
    }
}
