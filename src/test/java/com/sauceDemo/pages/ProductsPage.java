package com.sauceDemo.pages;

import com.sauceDemo.utilities.BrowserUtils;
import com.sauceDemo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductsPage extends BasePage{

  @FindBy(css=".product_sort_container")
    private WebElement sortItemsDropDown;

  @FindBy(css=".inventory_item_name ")
  private List<WebElement> sortedItemsList;

  public void sortItems(String orderType){
    Select select = new Select(sortItemsDropDown);
    select.selectByVisibleText(orderType);
  }

  public String sortedFirstItem(){
      return sortedItemsList.get(0).getText();
  }

  public void addItemWithName(String itemName){
      BrowserUtils.waitFor(2);
      Driver.get().findElement(By.xpath("//*[.='"+itemName+"']/ancestor::*[@*='inventory_item_description']//button")).click();
  }
}
