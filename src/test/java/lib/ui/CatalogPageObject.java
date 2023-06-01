package lib.ui;

import lib.BaseSeleniumPage;
import org.openqa.selenium.By;

public class CatalogPageObject extends BaseSeleniumPage {
  MainPageObject MainPageObject = new MainPageObject();
  public void addProductFromList(){
    driver.findElement(By.xpath("(//div[@data-testid='catalog-item-product-1']//input[@value=''])[1]")).click();
    driver.findElement(By.xpath("(//div[@data-testid='catalog-item-product-1']//input[@value=''])[1]")).sendKeys("10");
    driver.findElement(By.xpath("//div[@data-testid='catalog-item-product-1']//span[@class='MuiButton-label']")).click();
  }
}
