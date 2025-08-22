package com.sauceDemo.pages;

import com.sauceDemo.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class YourCartPage extends BasePage {

    @FindBy(css=".inventory_item_name")
    private List<WebElement> cartItems;


    public List<String> getCartItemsText(){
      return   BrowserUtils.getElementsText(cartItems);
    }

}
