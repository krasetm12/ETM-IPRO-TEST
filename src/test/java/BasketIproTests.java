import lib.BaseSeleniumPage;
import lib.CoreTestCase;
import lib.ui.AuthPageObject;
import lib.ui.MainPageObject;
import lib.webelemens.webelements;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;

public class BasketIproTests extends CoreTestCase {
  String SITE_URL = "https://itest.etm.ru:3004/catalog";
  // https://itest.etm.ru:3004
  /*protected WebDriver driver;
  private MainPageObject MainPageObject;
  public  void setUp() throws Exception{
    super.setUp();
    MainPageObject=new MainPageObject(driver);
  }*/
  @Test


  public void testMarketOrderByPickupPayUponReceipt() {
    driver.get(SITE_URL);
    AuthPageObject AuthPageObject = new AuthPageObject();
    AuthPageObject.marketAuthorization();
    MainPageObject MainPageObject = new MainPageObject();
    try {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    }
    MainPageObject.waitForElementAndSendKeys("//input[@name='nameEst']", "999/0816925", "not found the data entry element ", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='search-button']", "not found and click element of search", 5);

    MainPageObject.waitForElementAndClickable("//span[contains(.,'999/0816925')]", "not found element add to cart", 5);
    MainPageObject.waitForElementPresent("//tr[@data-testid='estimate-item-1']", "not found estimate", 5);
    MainPageObject.waitForElementAndClickable("//button[@data-testid='estimate-item-1-button-cart']", "not found element add to cart", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='estimate-item-1-button-cart']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);

    //MainPageObject.waitForElementAndClick("//button[@data-testid='current-city']","not found element geolocation",5);
    //MainPageObject.waitForElementAndClick("//span[contains(.,'Санкт-Петербург и ЛО')]","not click SPB",5);

    //WebElement element = driver.findElement(By.xpath("div[contains(text(),'Применить промокод')]"));
    //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    /*MainPageObject.waitForElementAndClick("//div[contains(.,'Применить промокод')]","not found and click element of promocode",5);
    MainPageObject.waitForElementAndSendKeys("//input[@name='promocode']","mar","not found and click element input of promocode",10);
    MainPageObject.waitForElementAndClick("//div[@data-testid='save-promo']","not found and click element save-promo",5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']","not found and click element X",5);
     */
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);


    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);
    MainPageObject.waitForElementAndClick("//img[@alt='close-btn']", "not close window of point", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);

    try {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    }


    //MainPageObject.waitForElementAndClick("//div[contains(text(),'Самовывоз')]","the PickUp is not issued",5);
    MainPageObject.waitForElementAndClick("(//button[contains(.,'Выбрать')])[1]", "not found and click point of pickup", 5);
    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-5']", "not found and check button of receiving", 5);
    //MainPageObject.waitForElementAndClick("//input[@value='4280']","not click button want to pickup LC",5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
    MainPageObject.waitForElementPresent("//p[contains(.,'Благодарим вас за использование системы iPRO!')]", "the order is not issued", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Перейти в Заказы')]", "not found and click button to go to orders", 5);
    //MainPageObject.waitForElementAndClick("//button[@id=['composition-button']","not found button of profile",5);
    //MainPageObject.waitForElementAndClick("//li[@data-testid='drop-menu-item-exit']","not found and click of exit ",5);



    /*driver.findElement(By.xpath("(//div[@data-testid='catalog-item-product-1']//input[@value=''])[1]")).click();
    driver.findElement(By.xpath("(//div[@data-testid='catalog-item-product-1']//input[@value=''])[1]")).sendKeys("10");
    driver.findElement(By.xpath("//div[@data-testid='catalog-item-product-1']//span[@class='MuiButton-label']")).click();



    driver.findElement(By.xpath("//img[@src='/assets/img/logo_cdek.png']")).click();
    driver.findElement(By.xpath("//div[contains(.,'Самовывоз СДЭК')]")).click();
    MainPageObject.clickVisible(By.xpath("//div[contains(.,'Сенная площадь, Адмиралтейская')]") ,"not click delivery point", 5 );
    driver.findElement(By.xpath("//div[contains(text(),'Сенная площадь, Адмиралтейская')]")).click();


    driver.findElement(By.xpath("//input[@name='phone']")).click();
    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9216572712");
    driver.findElement(By.xpath("//input[@name='name']")).click();
    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Алексей");
    driver.findElement(By.xpath("//span[contains(.,'Подтвердить заявку')]")).click();
    driver.findElement(By.xpath("//div[contains(text(),'При получении')]")).click();
    driver.findElement(By.xpath("//span[contains(.,'Оформить заказ')]")).click();
    MainPageObject.waitForElementPresent("//p[contains(.,'Благодарим вас за использование системы iPRO!')]","the order is not issued",0);
    driver.findElement(By.xpath("//span[contains(.,'Перейти в Заказы')]")).click();

    driver.findElement(By.xpath("//button[@title='Выход']")).click();

    */

  }

  @Test
  public void testMarketOrderByPickupPaymentByCard() {
    driver.get(SITE_URL);
    AuthPageObject AuthPageObject = new AuthPageObject();
    AuthPageObject.marketAuthorization();
    MainPageObject MainPageObject = new MainPageObject();
    try {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    }
    MainPageObject.waitForElementAndSendKeys("//input[@name='nameEst']", "999/0817524", "not found the data entry element ", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='search-button']", "not found and click element of search", 5);

    MainPageObject.waitForElementAndClickable("//span[contains(.,'999/0817524')]", "not found element add to cart", 5);
    MainPageObject.waitForElementPresent("//tr[@data-testid='estimate-item-1']", "not found estimate", 5);
    MainPageObject.waitForElementAndClickable("//button[@data-testid='estimate-item-1-button-cart']", "not found element add to cart", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='estimate-item-1-button-cart']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);

    //MainPageObject.waitForElementAndClick("//button[@data-testid='current-city']","not found element geolocation",5);
    //MainPageObject.waitForElementAndClick("//span[contains(.,'Санкт-Петербург и ЛО')]","not click SPB",5);

    //WebElement element = driver.findElement(By.xpath("div[contains(text(),'Применить промокод')]"));
    //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    /*MainPageObject.waitForElementAndClick("//div[contains(.,'Применить промокод')]","not found and click element of promocode",5);
    MainPageObject.waitForElementAndSendKeys("//input[@name='promocode']","mar","not found and click element input of promocode",10);
    MainPageObject.waitForElementAndClick("//div[@data-testid='save-promo']","not found and click element save-promo",5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']","not found and click element X",5);
     */
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);


    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);
    MainPageObject.waitForElementAndClick("//img[@alt='close-btn']", "not close window of point", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);

    try {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    }


    //MainPageObject.waitForElementAndClick("//div[contains(text(),'Самовывоз')]","the PickUp is not issued",5);
    MainPageObject.waitForElementAndClick("(//button[contains(.,'Выбрать')])[1]", "not found and click point of pickup", 5);


    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-3']", "not found and check button of receiving", 5);
    //MainPageObject.waitForElementAndClick("//input[@value='4280']","not click button want to pickup LC",5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
    MainPageObject.waitForElementPresent("//img[@src='img/main-logo-ru.png']", "the order is not issued", 20);
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

    //id="email"
    driver.findElement(By.xpath("//button[@name='SendPayment']")).click();
    MainPageObject.waitForElementPresent("//h1[contains(text(),'Подтверждение оплаты')]","the page of pay dont present",20);
    driver.findElement(By.xpath("//input[@id='password']")).click();
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
    MainPageObject.waitForElementPresent("//p[contains(.,'Статус оплаты: платёж принят')]","the page of catalog dont present",10);

     */

  }

  @Test
  public void testMarketOrderByPickupPaymentByBill() {
    driver.get(SITE_URL);
    AuthPageObject AuthPageObject = new AuthPageObject();
    AuthPageObject.marketAuthorization();
    MainPageObject MainPageObject = new MainPageObject();
    try {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    }
    MainPageObject.waitForElementAndSendKeys("//input[@name='nameEst']", "999/0817524", "not found the data entry element ", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='search-button']", "not found and click element of search", 5);

    MainPageObject.waitForElementAndClickable("//span[contains(.,'999/0817524')]", "not found element add to cart", 5);
    MainPageObject.waitForElementPresent("//tr[@data-testid='estimate-item-1']", "not found estimate", 5);
    MainPageObject.waitForElementAndClickable("//button[@data-testid='estimate-item-1-button-cart']", "not found element add to cart", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='estimate-item-1-button-cart']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);

    //MainPageObject.waitForElementAndClick("//button[@data-testid='current-city']","not found element geolocation",5);
    //MainPageObject.waitForElementAndClick("//span[contains(.,'Санкт-Петербург и ЛО')]","not click SPB",5);

    //WebElement element = driver.findElement(By.xpath("div[contains(text(),'Применить промокод')]"));
    //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    /*MainPageObject.waitForElementAndClick("//div[contains(.,'Применить промокод')]","not found and click element of promocode",5);
    MainPageObject.waitForElementAndSendKeys("//input[@name='promocode']","mar","not found and click element input of promocode",10);
    MainPageObject.waitForElementAndClick("//div[@data-testid='save-promo']","not found and click element save-promo",5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']","not found and click element X",5);
     */
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);


    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);
    MainPageObject.waitForElementAndClick("//img[@alt='close-btn']", "not close window of point", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);

    try {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    }


    //MainPageObject.waitForElementAndClick("//div[contains(text(),'Самовывоз')]","the PickUp is not issued",5);
    MainPageObject.waitForElementAndClick("(//button[contains(.,'Выбрать')])[1]", "not found and click point of pickup", 5);


    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-1']", "not found and check button of receiving", 5);

    MainPageObject.waitForElementAndSendKeys("//input[@data-testid='inn_org']", "7802316523", "not found field of inn", 5);
    MainPageObject.waitForElementAndClick("//input[@value='60004392']", "not found and check button of trevis", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='set-company-button']", "not found and check button of Confirm the selection", 5);


    //MainPageObject.waitForElementAndClick("//input[@value='4280']","not click button want to pickup LC",5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);

  }

  @Test
  public void testMarketOrderByPickupPaymentByQR() {
    driver.get(SITE_URL);
    AuthPageObject AuthPageObject = new AuthPageObject();
    AuthPageObject.marketAuthorization();
    MainPageObject MainPageObject = new MainPageObject();
    try {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    }
    MainPageObject.waitForElementAndSendKeys("//input[@name='nameEst']", "999/0817524", "not found the data entry element ", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='search-button']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClickable("//span[contains(.,'999/0817524')]", "not found element add to cart", 5);
    MainPageObject.waitForElementPresent("//tr[@data-testid='estimate-item-1']", "not found estimate", 5);
    MainPageObject.waitForElementAndClickable("//button[@data-testid='estimate-item-1-button-cart']", "not found element add to cart", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='estimate-item-1-button-cart']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);

    //MainPageObject.waitForElementAndClick("//button[@data-testid='current-city']","not found element geolocation",5);
    //MainPageObject.waitForElementAndClick("//span[contains(.,'Санкт-Петербург и ЛО')]","not click SPB",5);

    //WebElement element = driver.findElement(By.xpath("div[contains(text(),'Применить промокод')]"));
    //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    /*MainPageObject.waitForElementAndClick("//div[contains(.,'Применить промокод')]","not found and click element of promocode",5);
    MainPageObject.waitForElementAndSendKeys("//input[@name='promocode']","mar","not found and click element input of promocode",10);
    MainPageObject.waitForElementAndClick("//div[@data-testid='save-promo']","not found and click element save-promo",5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']","not found and click element X",5);
     */
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);


    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);
    MainPageObject.waitForElementAndClick("//img[@alt='close-btn']", "not close window of point", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);

    try {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    }


    //MainPageObject.waitForElementAndClick("//div[contains(text(),'Самовывоз')]","the PickUp is not issued",5);
    MainPageObject.waitForElementAndClick("(//button[contains(.,'Выбрать')])[1]", "not found and click point of pickup", 5);


    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-4']", "not found and check button of receiving", 5);

    //MainPageObject.waitForElementAndClick("//input[@value='4280']","not click button want to pickup LC",5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
    MainPageObject.waitForElementPresent("//form[contains(.,'Отсканируйте QR‑код')]", "not found QR-code", 5);
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

    //id="email"
    driver.findElement(By.xpath("//button[@name='SendPayment']")).click();
    MainPageObject.waitForElementPresent("//h1[contains(text(),'Подтверждение оплаты')]","the page of pay dont present",20);
    driver.findElement(By.xpath("//input[@id='password']")).click();
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
    MainPageObject.waitForElementPresent("//p[contains(.,'Статус оплаты: платёж принят')]","the page of catalog dont present",10);

     */

  }

  @Test
  public void testMarketOrderByPickupPaymentByPoint() {
    driver.get(SITE_URL);
    AuthPageObject AuthPageObject = new AuthPageObject();
    AuthPageObject.marketAuthorization();
    MainPageObject MainPageObject = new MainPageObject();
    try {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    }
    MainPageObject.waitForElementAndSendKeys("//input[@name='nameEst']", "999/0817524", "not found the data entry element ", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='search-button']", "not found and click element of search", 5);

    MainPageObject.waitForElementAndClickable("//span[contains(.,'999/0817524')]", "not found element add to cart", 5);
    MainPageObject.waitForElementPresent("//tr[@data-testid='estimate-item-1']", "not found estimate", 5);
    MainPageObject.waitForElementAndClickable("//button[@data-testid='estimate-item-1-button-cart']", "not found element add to cart", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='estimate-item-1-button-cart']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);

    //MainPageObject.waitForElementAndClick("//button[@data-testid='current-city']","not found element geolocation",5);
    //MainPageObject.waitForElementAndClick("//span[contains(.,'Санкт-Петербург и ЛО')]","not click SPB",5);

    //WebElement element = driver.findElement(By.xpath("div[contains(text(),'Применить промокод')]"));
    //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    /*MainPageObject.waitForElementAndClick("//div[contains(.,'Применить промокод')]","not found and click element of promocode",5);
    MainPageObject.waitForElementAndSendKeys("//input[@name='promocode']","mar","not found and click element input of promocode",10);
    MainPageObject.waitForElementAndClick("//div[@data-testid='save-promo']","not found and click element save-promo",5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']","not found and click element X",5);
     */
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);


    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);
    MainPageObject.waitForElementAndClick("//img[@alt='close-btn']", "not close window of point", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);

    try {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    }
    //MainPageObject.waitForElementAndClick("//div[contains(text(),'Самовывоз')]","the PickUp is not issued",5);
    MainPageObject.waitForElementAndClick("(//button[contains(.,'Выбрать')])[1]", "not found and click point of pickup", 5);
    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-7']", "not found and check button of receiving", 5);
    //MainPageObject.waitForElementAndClick("//input[@value='4280']","not click button want to pickup LC",5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
    MainPageObject.waitForElementPresent("//p[contains(.,'Благодарим вас за использование системы iPRO!')]", "the order is not issued", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Перейти в Заказы')]", "not found and click button to go to orders", 5);

  }

  @Test
  public void testMarketOrderByDeliveryPaymentByCard() throws InterruptedException {

    driver.get(SITE_URL);
    AuthPageObject AuthPageObject = new AuthPageObject();
    AuthPageObject.marketAuthorization();
    MainPageObject MainPageObject = new MainPageObject();
    try {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    }
    MainPageObject.waitForElementAndSendKeys("//input[@name='nameEst']", "999/0817524", "not found the data entry element ", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='search-button']", "not found and click element of search", 5);

    MainPageObject.waitForElementAndClickable("//span[contains(.,'999/0817524')]", "not found element add to cart", 5);
    MainPageObject.waitForElementPresent("//tr[@data-testid='estimate-item-1']", "not found estimate", 5);
    MainPageObject.waitForElementAndClickable("//button[@data-testid='estimate-item-1-button-cart']", "not found element add to cart", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='estimate-item-1-button-cart']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);

    //MainPageObject.waitForElementAndClick("//button[@data-testid='current-city']","not found element geolocation",5);
    //MainPageObject.waitForElementAndClick("//span[contains(.,'Санкт-Петербург и ЛО')]","not click SPB",5);

    //WebElement element = driver.findElement(By.xpath("div[contains(text(),'Применить промокод')]"));
    //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    /*MainPageObject.waitForElementAndClick("//div[contains(.,'Применить промокод')]","not found and click element of promocode",5);
    MainPageObject.waitForElementAndSendKeys("//input[@name='promocode']","mar","not found and click element input of promocode",10);
    MainPageObject.waitForElementAndClick("//div[@data-testid='save-promo']","not found and click element save-promo",5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']","not found and click element X",5);
     */
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'До адреса')]", "the PickUp is not issued", 5);
    //MainPageObject.waitForElementAndClick("//input[@name='date_fake']","not found field of date",5);
    MainPageObject.waitForElementAndClick("(//button[contains(.,'Выбрать')])[1]", "not found and click point of pickup", 5);
    MainPageObject.clickOrderDelivery();
    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-3']", "not found and check button of receiving", 5);
    //MainPageObject.waitForElementAndClick("//input[@value='4280']","not click button want to pickup LC",5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
    //MainPageObject.waitForElementPresent("//img[@src='img/main-logo-ru.png']", "the order is not issued", 20);
  }
  @Test
  public void testMarketOrderByDeliveryPaymentByBill() throws InterruptedException {

    driver.get(SITE_URL);
    AuthPageObject AuthPageObject = new AuthPageObject();
    AuthPageObject.marketAuthorization();
    MainPageObject MainPageObject = new MainPageObject();
    try {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    }
    MainPageObject.waitForElementAndSendKeys("//input[@name='nameEst']", "999/0817524", "not found the data entry element ", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='search-button']", "not found and click element of search", 5);

    MainPageObject.waitForElementAndClickable("//span[contains(.,'999/0817524')]", "not found element add to cart", 5);
    MainPageObject.waitForElementPresent("//tr[@data-testid='estimate-item-1']", "not found estimate", 5);
    MainPageObject.waitForElementAndClickable("//button[@data-testid='estimate-item-1-button-cart']", "not found element add to cart", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='estimate-item-1-button-cart']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'До адреса')]", "the PickUp is not issued", 5);
    MainPageObject.waitForElementAndClick("(//button[contains(.,'Выбрать')])[1]", "not found and click point of pickup", 5);
    MainPageObject.clickOrderDelivery();
    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-1']", "not found and check button of receiving", 5);
    MainPageObject.waitForElementAndSendKeys("//input[@data-testid='inn_org']", "7802316523", "not found field of inn", 5);
    MainPageObject.waitForElementAndClick("//input[@value='60004392']", "not found and check button of trevis", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='set-company-button']", "not found and check button of Confirm the selection", 5);
    //MainPageObject.waitForElementAndClick("//input[@value='4280']","not click button want to pickup LC",5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);

  }
  @Test
  public void testMarketOrderByDeliveryPaymentByQR() throws InterruptedException {

    driver.get(SITE_URL);
    AuthPageObject AuthPageObject = new AuthPageObject();
    AuthPageObject.marketAuthorization();
    MainPageObject MainPageObject = new MainPageObject();
    try {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    }
    MainPageObject.waitForElementAndSendKeys("//input[@name='nameEst']", "999/0817524", "not found the data entry element ", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='search-button']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClickable("//span[contains(.,'999/0817524')]", "not found element add to cart", 5);
    MainPageObject.waitForElementPresent("//tr[@data-testid='estimate-item-1']", "not found estimate", 5);
    MainPageObject.waitForElementAndClickable("//button[@data-testid='estimate-item-1-button-cart']", "not found element add to cart", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='estimate-item-1-button-cart']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'До адреса')]", "the PickUp is not issued", 5);
    MainPageObject.waitForElementAndClick("(//button[contains(.,'Выбрать')])[1]", "not found and click point of pickup", 5);
    MainPageObject.clickOrderDelivery();
    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-4']", "not found and check button of receiving", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
    MainPageObject.waitForElementPresent("//form[contains(.,'Отсканируйте QR‑код')]", "not found QR-code", 5);
  }

  @Test

  public void testMarketOrderBySDEKPayUponReceipt() {
    driver.get(SITE_URL);
    AuthPageObject AuthPageObject = new AuthPageObject();
    AuthPageObject.marketAuthorization();
    MainPageObject MainPageObject = new MainPageObject();
    try {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    }
    MainPageObject.waitForElementAndSendKeys("//input[@name='nameEst']", "999/0817524", "not found the data entry element ", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='search-button']", "not found and click element of search", 5);

    MainPageObject.waitForElementAndClickable("//span[contains(.,'999/0817524')]", "not found element add to cart", 5);
    MainPageObject.waitForElementPresent("//tr[@data-testid='estimate-item-1']", "not found estimate", 5);
    MainPageObject.waitForElementAndClickable("//button[@data-testid='estimate-item-1-button-cart']", "not found element add to cart", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='estimate-item-1-button-cart']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);

    //MainPageObject.waitForElementAndClick("//button[@data-testid='current-city']","not found element geolocation",5);
    //MainPageObject.waitForElementAndClick("//span[contains(.,'Санкт-Петербург и ЛО')]","not click SPB",5);

    //WebElement element = driver.findElement(By.xpath("div[contains(text(),'Применить промокод')]"));
    //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    /*MainPageObject.waitForElementAndClick("//div[contains(.,'Применить промокод')]","not found and click element of promocode",5);
    MainPageObject.waitForElementAndSendKeys("//input[@name='promocode']","mar","not found and click element input of promocode",10);
    MainPageObject.waitForElementAndClick("//div[@data-testid='save-promo']","not found and click element save-promo",5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']","not found and click element X",5);
     */
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);


    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);
    MainPageObject.waitForElementAndClick("//img[@alt='close-btn']", "not close window of point", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);

    //Thread.sleep(2000);
    driver.findElement(By.xpath("//span/input[@data-testid='checkbox-0']/following::input[5]")).click();


    //By.xpath("//p[contains(.,'Магазины ЭТМ')]")

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

    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-5']", "not found and check button of receiving", 5);
    //MainPageObject.waitForElementAndClick("//input[@value='4280']","not click button want to pickup LC",5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
    MainPageObject.waitForElementPresent("//p[contains(.,'Благодарим вас за использование системы iPRO!')]", "the order is not issued", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Перейти в Заказы')]", "not found and click button to go to orders", 5);
    //MainPageObject.waitForElementAndClick("//button[@id=['composition-button']","not found button of profile",5);
    //MainPageObject.waitForElementAndClick("//li[@data-testid='drop-menu-item-exit']","not found and click of exit ",5);



    /*driver.findElement(By.xpath("(//div[@data-testid='catalog-item-product-1']//input[@value=''])[1]")).click();
    driver.findElement(By.xpath("(//div[@data-testid='catalog-item-product-1']//input[@value=''])[1]")).sendKeys("10");
    driver.findElement(By.xpath("//div[@data-testid='catalog-item-product-1']//span[@class='MuiButton-label']")).click();



    driver.findElement(By.xpath("//img[@src='/assets/img/logo_cdek.png']")).click();
    driver.findElement(By.xpath("//div[contains(.,'Самовывоз СДЭК')]")).click();
    MainPageObject.clickVisible(By.xpath("//div[contains(.,'Сенная площадь, Адмиралтейская')]") ,"not click delivery point", 5 );
    driver.findElement(By.xpath("//div[contains(text(),'Сенная площадь, Адмиралтейская')]")).click();


    driver.findElement(By.xpath("//input[@name='phone']")).click();
    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9216572712");
    driver.findElement(By.xpath("//input[@name='name']")).click();
    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Алексей");
    driver.findElement(By.xpath("//span[contains(.,'Подтвердить заявку')]")).click();
    driver.findElement(By.xpath("//div[contains(text(),'При получении')]")).click();
    driver.findElement(By.xpath("//span[contains(.,'Оформить заказ')]")).click();
    MainPageObject.waitForElementPresent("//p[contains(.,'Благодарим вас за использование системы iPRO!')]","the order is not issued",0);
    driver.findElement(By.xpath("//span[contains(.,'Перейти в Заказы')]")).click();

    driver.findElement(By.xpath("//button[@title='Выход']")).click();

    */

  }
  @Test
  public void testMarketOrderBySDEKPayUponQR() {
    driver.get(SITE_URL);
    AuthPageObject AuthPageObject = new AuthPageObject();
    AuthPageObject.marketAuthorization();
    MainPageObject MainPageObject = new MainPageObject();
    try {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    }
    MainPageObject.waitForElementAndSendKeys("//input[@name='nameEst']", "999/0817524", "not found the data entry element ", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='search-button']", "not found and click element of search", 5);

    MainPageObject.waitForElementAndClickable("//span[contains(.,'999/0817524')]", "not found element add to cart", 5);
    MainPageObject.waitForElementPresent("//tr[@data-testid='estimate-item-1']", "not found estimate", 5);
    MainPageObject.waitForElementAndClickable("//button[@data-testid='estimate-item-1-button-cart']", "not found element add to cart", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='estimate-item-1-button-cart']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);

    //MainPageObject.waitForElementAndClick("//button[@data-testid='current-city']","not found element geolocation",5);
    //MainPageObject.waitForElementAndClick("//span[contains(.,'Санкт-Петербург и ЛО')]","not click SPB",5);

    //WebElement element = driver.findElement(By.xpath("div[contains(text(),'Применить промокод')]"));
    //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    /*MainPageObject.waitForElementAndClick("//div[contains(.,'Применить промокод')]","not found and click element of promocode",5);
    MainPageObject.waitForElementAndSendKeys("//input[@name='promocode']","mar","not found and click element input of promocode",10);
    MainPageObject.waitForElementAndClick("//div[@data-testid='save-promo']","not found and click element save-promo",5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']","not found and click element X",5);
     */
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);


    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);
    MainPageObject.waitForElementAndClick("//img[@alt='close-btn']", "not close window of point", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);

    //Thread.sleep(2000);
    driver.findElement(By.xpath("//span/input[@data-testid='checkbox-0']/following::input[5]")).click();


    //By.xpath("//p[contains(.,'Магазины ЭТМ')]")

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

    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-4']", "not found and check button of receiving", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
    MainPageObject.waitForElementPresent("//form[contains(.,'Отсканируйте QR‑код')]", "not found QR-code", 5);

  }
  @Test
  public void testMarketOrderBySDEKPayByCard() throws InterruptedException {
    driver.get(SITE_URL);
    AuthPageObject AuthPageObject = new AuthPageObject();
    AuthPageObject.marketAuthorization();
    MainPageObject MainPageObject = new MainPageObject();
    try {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    }
    MainPageObject.waitForElementAndSendKeys("//input[@name='nameEst']", "999/0817524", "not found the data entry element ", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='search-button']", "not found and click element of search", 5);

    MainPageObject.waitForElementAndClickable("//span[contains(.,'999/0817524')]", "not found element add to cart", 5);
    MainPageObject.waitForElementPresent("//tr[@data-testid='estimate-item-1']", "not found estimate", 5);
    MainPageObject.waitForElementAndClickable("//button[@data-testid='estimate-item-1-button-cart']", "not found element add to cart", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='estimate-item-1-button-cart']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);

    //MainPageObject.waitForElementAndClick("//button[@data-testid='current-city']","not found element geolocation",5);
    //MainPageObject.waitForElementAndClick("//span[contains(.,'Санкт-Петербург и ЛО')]","not click SPB",5);

    //WebElement element = driver.findElement(By.xpath("div[contains(text(),'Применить промокод')]"));
    //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    /*MainPageObject.waitForElementAndClick("//div[contains(.,'Применить промокод')]","not found and click element of promocode",5);
    MainPageObject.waitForElementAndSendKeys("//input[@name='promocode']","mar","not found and click element input of promocode",10);
    MainPageObject.waitForElementAndClick("//div[@data-testid='save-promo']","not found and click element save-promo",5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']","not found and click element X",5);
     */
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);


    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);
    MainPageObject.waitForElementAndClick("//img[@alt='close-btn']", "not close window of point", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);

    //Thread.sleep(2000);
    driver.findElement(By.xpath("//span/input[@data-testid='checkbox-0']/following::input[5]")).click();


    //By.xpath("//p[contains(.,'Магазины ЭТМ')]")

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

    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-3']", "not found and check button of receiving", 5);
    //MainPageObject.waitForElementAndClick("//input[@value='4280']","not click button want to pickup LC",5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
    //MainPageObject.waitForElementPresent("//img[@src='img/main-logo-ru.png']", "the order is not issued", 20);
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

    //id="email"
    driver.findElement(By.xpath("//button[@name='SendPayment']")).click();
    MainPageObject.waitForElementPresent("//h1[contains(text(),'Подтверждение оплаты')]","the page of pay dont present",20);
    driver.findElement(By.xpath("//input[@id='password']")).click();
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
    MainPageObject.waitForElementPresent("//p[contains(.,'Статус оплаты: платёж принят')]","the page of catalog dont present",10);

     */

  }
  @Test


  public void testIPRO_OrderByPickupPayByBill() throws InterruptedException {
    driver.get(SITE_URL);
    AuthPageObject AuthPageObject = new AuthPageObject();
    AuthPageObject.iPROAuthorization();
    MainPageObject MainPageObject = new MainPageObject();
    try {
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

    //MainPageObject.waitForElementAndClickable("//span[contains(.,'999/0816925')]", "not found element add to cart", 5);
    //MainPageObject.waitForElementPresent("//tr[@data-testid='estimate-item-1']", "not found estimate", 5);
    //MainPageObject.waitForElementAndClickable("//button[@data-testid='estimate-item-1-button-cart']", "not found element add to cart", 5);
    //MainPageObject.waitForElementAndClick("//button[@data-testid='estimate-item-1-button-cart']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);

    //MainPageObject.waitForElementAndClick("//button[@data-testid='current-city']","not found element geolocation",5);
    //MainPageObject.waitForElementAndClick("//span[contains(.,'Санкт-Петербург и ЛО')]","not click SPB",5);

    //WebElement element = driver.findElement(By.xpath("div[contains(text(),'Применить промокод')]"));
    //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    /*MainPageObject.waitForElementAndClick("//div[contains(.,'Применить промокод')]","not found and click element of promocode",5);
    MainPageObject.waitForElementAndSendKeys("//input[@name='promocode']","mar","not found and click element input of promocode",10);
    MainPageObject.waitForElementAndClick("//div[@data-testid='save-promo']","not found and click element save-promo",5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']","not found and click element X",5);
     */
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);


    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);
    MainPageObject.waitForElementAndClick("//img[@alt='close-btn']", "not close window of point", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);

    try {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    }


    //MainPageObject.waitForElementAndClick("//div[contains(text(),'Самовывоз')]","the PickUp is not issued",5);
    MainPageObject.waitForElementAndClick("(//button[contains(.,'Выбрать')])[1]", "not found and click point of pickup", 5);
    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-1']", "not found and check button of receiving", 5);
    //MainPageObject.waitForElementAndClick("//input[@value='4280']","not click button want to pickup LC",5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='closePopup']", "not found and check button of close popup bill", 5);
    MainPageObject.waitForElementPresent("//p[contains(.,'Благодарим вас за использование системы iPRO!')]", "the order is not issued", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Перейти в Документы')]", "not found and click button to go to orders", 5);
    //MainPageObject.waitForElementAndClick("//button[@id=['composition-button']","not found button of profile",5);
    //MainPageObject.waitForElementAndClick("//li[@data-testid='drop-menu-item-exit']","not found and click of exit ",5);



    /*driver.findElement(By.xpath("(//div[@data-testid='catalog-item-product-1']//input[@value=''])[1]")).click();
    driver.findElement(By.xpath("(//div[@data-testid='catalog-item-product-1']//input[@value=''])[1]")).sendKeys("10");
    driver.findElement(By.xpath("//div[@data-testid='catalog-item-product-1']//span[@class='MuiButton-label']")).click();




    driver.findElement(By.xpath("//button[@title='Выход']")).click();

    */

  }

  @Test
  public void testIPRO_OrderByPickupPaymentByCard() throws InterruptedException {
    driver.get(SITE_URL);
    AuthPageObject AuthPageObject = new AuthPageObject();
    AuthPageObject.iPROAuthorization();
    MainPageObject MainPageObject = new MainPageObject();
    try {
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

    //MainPageObject.waitForElementAndClickable("//span[contains(.,'999/0816925')]", "not found element add to cart", 5);
    //MainPageObject.waitForElementPresent("//tr[@data-testid='estimate-item-1']", "not found estimate", 5);
    //MainPageObject.waitForElementAndClickable("//button[@data-testid='estimate-item-1-button-cart']", "not found element add to cart", 5);
    //MainPageObject.waitForElementAndClick("//button[@data-testid='estimate-item-1-button-cart']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);

    //MainPageObject.waitForElementAndClick("//button[@data-testid='current-city']","not found element geolocation",5);
    //MainPageObject.waitForElementAndClick("//span[contains(.,'Санкт-Петербург и ЛО')]","not click SPB",5);

    //WebElement element = driver.findElement(By.xpath("div[contains(text(),'Применить промокод')]"));
    //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    /*MainPageObject.waitForElementAndClick("//div[contains(.,'Применить промокод')]","not found and click element of promocode",5);
    MainPageObject.waitForElementAndSendKeys("//input[@name='promocode']","mar","not found and click element input of promocode",10);
    MainPageObject.waitForElementAndClick("//div[@data-testid='save-promo']","not found and click element save-promo",5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']","not found and click element X",5);
     */
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);


    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);
    MainPageObject.waitForElementAndClick("//img[@alt='close-btn']", "not close window of point", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);

    try {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    }


    //MainPageObject.waitForElementAndClick("//div[contains(text(),'Самовывоз')]","the PickUp is not issued",5);
    MainPageObject.waitForElementAndClick("(//button[contains(.,'Выбрать')])[1]", "not found and click point of pickup", 5);


    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-3']", "not found and check button of receiving", 5);
    //MainPageObject.waitForElementAndClick("//input[@value='4280']","not click button want to pickup LC",5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
    MainPageObject.waitForElementPresent("//img[@src='img/main-logo-ru.png']", "the order is not issued", 20);
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

    //id="email"
    driver.findElement(By.xpath("//button[@name='SendPayment']")).click();
    MainPageObject.waitForElementPresent("//h1[contains(text(),'Подтверждение оплаты')]","the page of pay dont present",20);
    driver.findElement(By.xpath("//input[@id='password']")).click();
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
    MainPageObject.waitForElementPresent("//p[contains(.,'Статус оплаты: платёж принят')]","the page of catalog dont present",10);

     */

  }

  @Test
  public void testIPRO_OrderByPickupPaymentByQR() throws InterruptedException {
    driver.get(SITE_URL);
    AuthPageObject AuthPageObject = new AuthPageObject();
    AuthPageObject.iPROAuthorization();
    MainPageObject MainPageObject = new MainPageObject();
    try {
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

    //MainPageObject.waitForElementAndClickable("//span[contains(.,'999/0816925')]", "not found element add to cart", 5);
    //MainPageObject.waitForElementPresent("//tr[@data-testid='estimate-item-1']", "not found estimate", 5);
    //MainPageObject.waitForElementAndClickable("//button[@data-testid='estimate-item-1-button-cart']", "not found element add to cart", 5);
    //MainPageObject.waitForElementAndClick("//button[@data-testid='estimate-item-1-button-cart']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);

    //MainPageObject.waitForElementAndClick("//button[@data-testid='current-city']","not found element geolocation",5);
    //MainPageObject.waitForElementAndClick("//span[contains(.,'Санкт-Петербург и ЛО')]","not click SPB",5);

    //WebElement element = driver.findElement(By.xpath("div[contains(text(),'Применить промокод')]"));
    //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    /*MainPageObject.waitForElementAndClick("//div[contains(.,'Применить промокод')]","not found and click element of promocode",5);
    MainPageObject.waitForElementAndSendKeys("//input[@name='promocode']","mar","not found and click element input of promocode",10);
    MainPageObject.waitForElementAndClick("//div[@data-testid='save-promo']","not found and click element save-promo",5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']","not found and click element X",5);
     */
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);


    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);
    MainPageObject.waitForElementAndClick("//img[@alt='close-btn']", "not close window of point", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);

    try {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    }


    //MainPageObject.waitForElementAndClick("//div[contains(text(),'Самовывоз')]","the PickUp is not issued",5);
    MainPageObject.waitForElementAndClick("(//button[contains(.,'Выбрать')])[1]", "not found and click point of pickup", 5);
    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-4']", "not found and check button of receiving", 5);
    //MainPageObject.waitForElementAndClick("//input[@value='4280']","not click button want to pickup LC",5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
    MainPageObject.waitForElementPresent("//form[contains(.,'Отсканируйте QR‑код')]", "not found QR-code", 5);

  }

  @Test
  public void testIPRO_OrderByPickupPaymentByAmpers() throws InterruptedException {
    driver.get(SITE_URL);
    AuthPageObject AuthPageObject = new AuthPageObject();
    AuthPageObject.iPROAuthorization();
    MainPageObject MainPageObject = new MainPageObject();
    try {
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

    //MainPageObject.waitForElementAndClickable("//span[contains(.,'999/0816925')]", "not found element add to cart", 5);
    //MainPageObject.waitForElementPresent("//tr[@data-testid='estimate-item-1']", "not found estimate", 5);
    //MainPageObject.waitForElementAndClickable("//button[@data-testid='estimate-item-1-button-cart']", "not found element add to cart", 5);
    //MainPageObject.waitForElementAndClick("//button[@data-testid='estimate-item-1-button-cart']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);

    //MainPageObject.waitForElementAndClick("//button[@data-testid='current-city']","not found element geolocation",5);
    //MainPageObject.waitForElementAndClick("//span[contains(.,'Санкт-Петербург и ЛО')]","not click SPB",5);

    //WebElement element = driver.findElement(By.xpath("div[contains(text(),'Применить промокод')]"));
    //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    /*MainPageObject.waitForElementAndClick("//div[contains(.,'Применить промокод')]","not found and click element of promocode",5);
    MainPageObject.waitForElementAndSendKeys("//input[@name='promocode']","mar","not found and click element input of promocode",10);
    MainPageObject.waitForElementAndClick("//div[@data-testid='save-promo']","not found and click element save-promo",5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']","not found and click element X",5);
     */
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);


    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);
    MainPageObject.waitForElementAndClick("//img[@alt='close-btn']", "not close window of point", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Пункты выдачи')]", "the PickUp is not issued", 5);

    try {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//p[contains(.,'Магазины ЭТМ')]"));

    }


    //MainPageObject.waitForElementAndClick("//div[contains(text(),'Самовывоз')]","the PickUp is not issued",5);
    MainPageObject.waitForElementAndClick("(//button[contains(.,'Выбрать')])[1]", "not found and click point of pickup", 5);
    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-6']", "not found and check button of receiving", 5);

    MainPageObject.waitForElementAndClear("//input[@name='tovzak']","not clear field of ampers",5);
    MainPageObject.waitForElementAndSendKeys("//input[@name='tovzak']","1","not found and click element input of tovzak",10);
    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[5]/div[2]/div[1]/div[4]/div[2]/div[2]/div/div[2]/div[1]")).click();



    //MainPageObject.waitForElementAndClick("//input[@value='4280']","not click button want to pickup LC",5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);



  }

  @Test
  public void testIPRO_OrderByDeliveryPaymentByQR() throws InterruptedException {

    driver.get(SITE_URL);
    AuthPageObject AuthPageObject = new AuthPageObject();
    AuthPageObject.iPROAuthorization();
    MainPageObject MainPageObject = new MainPageObject();
    try {
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

    //MainPageObject.waitForElementAndClickable("//span[contains(.,'999/0816925')]", "not found element add to cart", 5);
    //MainPageObject.waitForElementPresent("//tr[@data-testid='estimate-item-1']", "not found estimate", 5);
    //MainPageObject.waitForElementAndClickable("//button[@data-testid='estimate-item-1-button-cart']", "not found element add to cart", 5);
    //MainPageObject.waitForElementAndClick("//button[@data-testid='estimate-item-1-button-cart']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);

    //MainPageObject.waitForElementAndClick("//button[@data-testid='current-city']","not found element geolocation",5);
    //MainPageObject.waitForElementAndClick("//span[contains(.,'Санкт-Петербург и ЛО')]","not click SPB",5);

    //WebElement element = driver.findElement(By.xpath("div[contains(text(),'Применить промокод')]"));
    //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    /*MainPageObject.waitForElementAndClick("//div[contains(.,'Применить промокод')]","not found and click element of promocode",5);
    MainPageObject.waitForElementAndSendKeys("//input[@name='promocode']","mar","not found and click element input of promocode",10);
    MainPageObject.waitForElementAndClick("//div[@data-testid='save-promo']","not found and click element save-promo",5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']","not found and click element X",5);
     */
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'До адреса')]", "the PickUp is not issued", 5);
    MainPageObject.waitForElementAndClick("(//button[contains(.,'Выбрать')])[1]", "not found and click point of pickup", 5);
    MainPageObject.clickOrderDelivery();
    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-4']", "not found and check button of receiving", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
    MainPageObject.waitForElementPresent("//form[contains(.,'Отсканируйте QR‑код')]", "not found QR-code", 5);
  }

  @Test
  public void testIPRO_OrderByDeliveryPaymentByCard() throws InterruptedException {

    driver.get(SITE_URL);
    AuthPageObject AuthPageObject = new AuthPageObject();
    AuthPageObject.marketAuthorization();
    MainPageObject MainPageObject = new MainPageObject();
    try {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    }
    MainPageObject.waitForElementAndSendKeys("//input[@name='nameEst']", "999/0817524", "not found the data entry element ", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='search-button']", "not found and click element of search", 5);

    MainPageObject.waitForElementAndClickable("//span[contains(.,'999/0817524')]", "not found element add to cart", 5);
    MainPageObject.waitForElementPresent("//tr[@data-testid='estimate-item-1']", "not found estimate", 5);
    MainPageObject.waitForElementAndClickable("//button[@data-testid='estimate-item-1-button-cart']", "not found element add to cart", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='estimate-item-1-button-cart']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);

    //MainPageObject.waitForElementAndClick("//button[@data-testid='current-city']","not found element geolocation",5);
    //MainPageObject.waitForElementAndClick("//span[contains(.,'Санкт-Петербург и ЛО')]","not click SPB",5);

    //WebElement element = driver.findElement(By.xpath("div[contains(text(),'Применить промокод')]"));
    //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    /*MainPageObject.waitForElementAndClick("//div[contains(.,'Применить промокод')]","not found and click element of promocode",5);
    MainPageObject.waitForElementAndSendKeys("//input[@name='promocode']","mar","not found and click element input of promocode",10);
    MainPageObject.waitForElementAndClick("//div[@data-testid='save-promo']","not found and click element save-promo",5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']","not found and click element X",5);
     */
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'До адреса')]", "the PickUp is not issued", 5);
    //MainPageObject.waitForElementAndClick("//input[@name='date_fake']","not found field of date",5);
    MainPageObject.waitForElementAndClick("(//button[contains(.,'Выбрать')])[1]", "not found and click point of pickup", 5);
    MainPageObject.clickOrderDelivery();
    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-3']", "not found and check button of receiving", 5);
    //MainPageObject.waitForElementAndClick("//input[@value='4280']","not click button want to pickup LC",5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);
    //MainPageObject.waitForElementPresent("//img[@src='img/main-logo-ru.png']", "the order is not issued", 20);
  }
  @Test
  public void testIPRO_OrderByDeliveryPaymentByBill() throws InterruptedException {

    driver.get(SITE_URL);
    AuthPageObject AuthPageObject = new AuthPageObject();
    AuthPageObject.marketAuthorization();
    MainPageObject MainPageObject = new MainPageObject();
    try {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    } catch (org.openqa.selenium.StaleElementReferenceException ex) {
      WebElement button = driver.findElement(By.xpath("//a[@data-testid='top-menu-estimates']"));
      button.click();
    }
    MainPageObject.waitForElementAndSendKeys("//input[@name='nameEst']", "999/0817524", "not found the data entry element ", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='search-button']", "not found and click element of search", 5);

    MainPageObject.waitForElementAndClickable("//span[contains(.,'999/0817524')]", "not found element add to cart", 5);
    MainPageObject.waitForElementPresent("//tr[@data-testid='estimate-item-1']", "not found estimate", 5);
    MainPageObject.waitForElementAndClickable("//button[@data-testid='estimate-item-1-button-cart']", "not found element add to cart", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='estimate-item-1-button-cart']", "not found and click element of search", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='message-close-button']", "not found and click element X", 5);
    MainPageObject.waitForElementAndClick("//p[@data-testid='go-to-basket']", "not found and click element of go to basket", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'До адреса')]", "the PickUp is not issued", 5);
    MainPageObject.waitForElementAndClick("(//button[contains(.,'Выбрать')])[1]", "not found and click point of pickup", 5);
    MainPageObject.clickOrderDelivery();
    MainPageObject.waitForElementAndClick("//div[@data-testid='option-payment-1']", "not found and check button of receiving", 5);
    MainPageObject.waitForElementAndSendKeys("//input[@data-testid='inn_org']", "7802316523", "not found field of inn", 5);
    MainPageObject.waitForElementAndClick("//input[@value='60004392']", "not found and check button of trevis", 5);
    MainPageObject.waitForElementAndClick("//button[@data-testid='set-company-button']", "not found and check button of Confirm the selection", 5);
    //MainPageObject.waitForElementAndClick("//input[@value='4280']","not click button want to pickup LC",5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Оформить заказ')]", "not found and click button of set an order", 5);

  }

}
