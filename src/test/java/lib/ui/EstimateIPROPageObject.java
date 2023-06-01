package lib.ui;

import lib.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class EstimateIPROPageObject extends BaseSeleniumPage { //переход в сметы и добавление сметы в Корзину 997/0817620
  MainPageObject MainPageObject = new MainPageObject();
  public void addEstimateToBasketIPRO() throws InterruptedException {try {
    WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
    button.click();
  } catch (org.openqa.selenium.StaleElementReferenceException ex) {
    WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
    button.click();
  }
    MainPageObject.waitForElementAndSendKeys("//input[@data-testid='input-estimate-number']", "997/0817620", "not found the data entry element ", 5);
    driver.findElement(By.xpath("//input[@data-testid='input-estimate-number']")).sendKeys(Keys.ENTER);
    MainPageObject.waitForElementAndClick("//input[@type='checkbox']", "not found and click element of checkbox", 5);
    Thread.sleep(1000);
    MainPageObject.waitForElementAndClick("//button[@data-testid='action-4']", "not found and click element of add to basket", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);
  }

}
