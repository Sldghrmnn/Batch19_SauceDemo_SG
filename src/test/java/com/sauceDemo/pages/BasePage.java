package com.sauceDemo.pages;

import com.sauceDemo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement pageTitleElement;

    @FindBy(css=".shopping_cart_badge")
    private WebElement basketNumber;

    @FindBy(css=".shopping_cart_link")
    private WebElement shoppingCartLink;

    public String getPageTitle(){
        return pageTitleElement.getText();
    }

    public String getPageTitle(String pageTitle){
        return Driver.get().findElement(By.xpath("//span[text()='"+pageTitle+"']")).getText();
    }

    public int getBasketNumber(){
        String basketNumberText = basketNumber.getText();
        return Integer.parseInt(basketNumberText);
    }

    public void navigateToShoppingCartPage(){
        shoppingCartLink.click();
    }

    public void navigateToPageWithRelatedButton(String buttonName){
        Driver.get().findElement(By.id(buttonName)).click();
    }
}
