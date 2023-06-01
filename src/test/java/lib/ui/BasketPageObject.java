package lib.ui;

import lib.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BasketPageObject extends BaseSeleniumPage {
  MainPageObject MainPageObject = new MainPageObject();

  private static final

  String LOGIN_MARKET="9216572712";
  String PASSWORD_MARKET="qakras1234";
  String LOGIN_IPRO="60004392kal";
  String PASSWORD_IPRO="thqu5943";

  public void addPromocode(){ //добавление промокода -дописать ,чтобы параметр купона передавать в зависимости от типа логина
    WebElement element = driver.findElement(By.xpath("div[contains(text(),'Применить промокод')]"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    MainPageObject.waitForElementAndClick("//div[contains(.,'Применить промокод')]","not found and click element of promocode",5);
    MainPageObject.waitForElementAndSendKeys("//input[@name='promocode']","mar","not found and click element input of promocode",10);
    MainPageObject.waitForElementAndClick("//div[@data-testid='save-promo']","not found and click element save-promo",5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']","not found and click element X",5);

  }

  public void marketPickup(){ //выбор первой точки самовывоза из списка

    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);
    MainPageObject.waitForElementAndClick("//img[@alt='close-btn']", "not close window of point", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);

    try {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    }
    MainPageObject.waitForElementAndClick("(//button[contains(.,'Выбрать')])[1]", "not found and click point of pickup", 5);
  }

  public void marketDelivery() throws InterruptedException { //выбор первой точки доставки из списка
    MainPageObject.waitForElementAndClick("//span[contains(.,'До адреса')]", "the PickUp is not issued", 5);
    MainPageObject.waitForElementAndClick("(//button[contains(.,'Выбрать')])[1]", "not found and click point of pickup", 5);
    MainPageObject.clickOrderDelivery();
  }
  public void iPRODelivery() throws InterruptedException { //выбор первой точки доставки из списка
    MainPageObject.waitForElementAndClick("//span[contains(.,'До адреса')]", "the PickUp is not issued", 5);
    Thread.sleep(2000);//Создать новую доставку /html/body/div[5]/div[3]/div[2]/div[1]
    MainPageObject.waitForElementAndClick("(//button[@type='button'][contains(.,'Создать новую доставку')])[2]", "not found and click current point of delivery", 5);
    MainPageObject.waitForElementAndClick("(//button[contains(.,'Выбрать')])[1]", "not found and click point of pickup", 5);
    MainPageObject.clickOrderDelivery();

  }
  public void marketCDEK(){
    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);
    MainPageObject.waitForElementAndClick("//img[@alt='close-btn']", "not close window of point", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);
    //Thread.sleep(2000);
    driver.findElement(By.xpath("//span/input[@data-testid='checkbox-0']/following::input[5]")).click();
    //MainPageObject.waitForElementAndClick("(//input[@value=''])[5]", "not found and click field of name point sdek", 5);
    //MainPageObject.waitForElementAndSendKeys("(//input[@value=''])[5]", "На Недорубова 15", "not sendkeys name point sdek ", 5);
    MainPageObject.waitForElementAndClick("//button[contains(.,'Выбрать')]", "not found and click point of pickup", 5);

    driver.findElement(By.xpath("//input[@name='phone']")).click();
    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9216572712");
    driver.findElement(By.xpath("//input[@name='f-name']")).click();
    driver.findElement(By.xpath("//input[@name='f-name']")).sendKeys("Красиков");
    driver.findElement(By.xpath("//input[@name='l-name']")).click();
    driver.findElement(By.xpath("//input[@name='l-name']")).sendKeys("Алексей");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  public void marketPayUponReceipt(){ //оплата при получении
    MainPageObject MainPageObject = new MainPageObject();

    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-5']", "not found and check button of receiving", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
    MainPageObject.waitForElementPresent("//p[contains(.,'Благодарим вас за использование системы iPRO!')]", "the order is not issued", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Перейти в Заказы')]", "not found and click button to go to orders", 5);
  }
  public void paymentByCard(){
    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-3']", "not found and check button of receiving", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
    //MainPageObject.waitForElementPresent("//img[@class='logo-bank']", "the order is not issued", 20);
    /*driver.findElement(By.xpath("//input[@id='iPAN_sub']")).click();
    driver.findElement(By.xpath("//input[@id='iPAN_sub']")).sendKeys("4111111111111111");
    driver.findElement(By.xpath("//input[@id='input-month']")).click();
    driver.findElement(By.xpath("//input[@id='input-month']")).sendKeys("12");
    driver.findElement(By.xpath("//input[@id='input-year']")).click();
    driver.findElement(By.xpath("//input[@id='input-year']")).sendKeys("24");
    driver.findElement(By.xpath("//input[@id='iTEXT']")).click();
    driver.findElement(By.xpath("//input[@id='iTEXT']")).sendKeys("IVAN IVANOV");
    driver.findElement(By.xpath("//input[@id='iCVC']")).click();
    driver.findElement(By.xpath("//input[@id='iCVC']")).sendKeys("123");

    driver.findElement(By.xpath("//button[@name='SendPayment']")).click();
    MainPageObject.waitForElementPresent("//h1[contains(text(),'Подтверждение оплаты')]","the page of pay dont present",20);
    driver.findElement(By.xpath("//input[@id='password']")).click();
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
    MainPageObject.waitForElementPresent("//p[contains(.,'Статус оплаты: платёж принят')]","the page of catalog dont present",10);

     */

  }
  public void paymentByBill(){
    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-1']", "not found and check button of receiving", 5);
    MainPageObject.waitForElementAndSendKeys("//input[@data-testid='inn_org']", "7802316523", "not found field of inn", 5);
    MainPageObject.waitForElementAndClick("//input[@value='60004392']", "not found and check button of trevis", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='set-company-button']", "not found and check button of Confirm the selection", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
  }

  public void paymentByBillIPRO(){
    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-1']", "not found and check button of receiving", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='closePopup']", "not found and check button of close popup bill", 5);
    MainPageObject.waitForElementPresent("//p[contains(.,'Благодарим вас за использование системы iPRO!')]", "the order is not issued", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Перейти в Документы')]", "not found and click button to go to orders", 5);
  }

  public void paymentByQR(){
    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-4']", "not found and check button of receiving", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
    MainPageObject.waitForElementPresent("//form[contains(.,'Отсканируйте QR‑код')]", "not found QR-code", 5);
  }
  public void paymentByPoint(){// оплата баллами
    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-7']", "not found and check button of receiving", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
    MainPageObject.waitForElementPresent("//p[contains(.,'Благодарим вас за использование системы iPRO!')]", "the order is not issued", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Перейти в Заказы')]", "not found and click button to go to orders", 5);


  }
  public void paymentByAmpers(){ //оплата амперами
    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-6']", "not found and check button of receiving", 5);
    MainPageObject.waitForElementAndClear("//input[@name='tovzak']","not clear field of ampers",5);
    MainPageObject.waitForElementAndSendKeys("//input[@name='tovzak']","1","not found and click element input of tovzak",10);
    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[5]/div[2]/div[1]/div[4]/div[2]/div[2]/div/div[2]/div[1]")).click();
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);


  }


}
