package com.sauceDemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutYourInformationPage extends BasePage{

    @FindBy(id= "first-name")
    private WebElement firstnameBox;

    @FindBy(id= "last-name")
    private WebElement lastnameBox;

    @FindBy(id= "postal-code")
    private WebElement postalCodeBox;

    public void fillYourInfermationForm(String firstname,String lastname,String postalCode){
        firstnameBox.sendKeys(firstname);
        lastnameBox.sendKeys(lastname);
        postalCodeBox.sendKeys(postalCode);
    }
}
