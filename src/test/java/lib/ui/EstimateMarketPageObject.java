package lib.ui;

import lib.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EstimateMarketPageObject extends BaseSeleniumPage { //переход в сметы и добавление сметы в Корзину 999/0817524 999/0816925
  MainPageObject MainPageObject = new MainPageObject();
  public void addEstimateToBasket(){

    try {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    }
    MainPageObject.waitForElementAndSendKeys("//input[@name='nameEst']", "999/0823433", "not found the data entry element ", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='search-button']", "not found and click element of search", 5);

    MainPageObject.waitForElementAndClickable("//span[contains(.,'999/0823433')]", "not found element add to cart", 5);
    MainPageObject.waitForElementPresent("//tr[@data-testid='estimate-item-1']", "not found estimate", 5);
    MainPageObject.waitForElementAndClickable("//button[@data-testid='estimate-item-1-button-cart']", "not found element add to cart", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='estimate-item-1-button-cart']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);

  }

}
