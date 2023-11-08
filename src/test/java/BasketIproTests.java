import lib.BaseSeleniumPage;
import lib.CoreTestCase;
import lib.ui.*;
import lib.webelemens.webelements;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;

public class BasketIproTests extends CoreTestCase {
  String SITE_URL = "https://itest.etm.ru:3004/catalog";
  EstimateMarketPageObject EstimateMarketPageObject = new EstimateMarketPageObject();
  EstimateIPROPageObject EstimateIPROPageObject = new EstimateIPROPageObject();
  AuthPageObject AuthPageObject = new AuthPageObject();
  MainPageObject MainPageObject = new MainPageObject();
  BasketPageObject BasketPageObject = new BasketPageObject();

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

    AuthPageObject.marketAuthorization();
    EstimateMarketPageObject.addEstimateToBasket();
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    BasketPageObject.marketPickup();
    BasketPageObject.marketPayUponReceipt();
    //MainPageObject.waitForElementAndClick("//input[@value='4280']","not click button want to pickup LC",5);выбор радиокнопки
  }
}


  /*@Test
  public void testMarketOrderByPickupPaymentByCard() {
    driver.get(SITE_URL);
    AuthPageObject.marketAuthorization();
    EstimateMarketPageObject.addEstimateToBasket();
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    BasketPageObject.marketPickup();
    BasketPageObject.paymentByCard();
  }

  @Test
  public void testMarketOrderByPickupPaymentByBill() {
    driver.get(SITE_URL);
    AuthPageObject.marketAuthorization();
    EstimateMarketPageObject.addEstimateToBasket();
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    BasketPageObject.marketPickup();
    BasketPageObject.paymentByBill();

  }

  @Test
  public void testMarketOrderByPickupPaymentByQR() {
    driver.get(SITE_URL);
    AuthPageObject.marketAuthorization();
    EstimateMarketPageObject.addEstimateToBasket();
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    BasketPageObject.marketPickup();
    BasketPageObject.paymentByQR();


  }

  @Test
  public void testMarketOrderByPickupPaymentByPoint() {
    driver.get(SITE_URL);
    AuthPageObject.marketAuthorization();
    EstimateMarketPageObject.addEstimateToBasket();
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    BasketPageObject.marketPickup();
    BasketPageObject.paymentByPoint();
  }

  @Test
  public void testMarketOrderByDeliveryPaymentByCard() throws InterruptedException {

    driver.get(SITE_URL);
    AuthPageObject.marketAuthorization();
    EstimateMarketPageObject.addEstimateToBasket();
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    BasketPageObject.marketDelivery();
    BasketPageObject.paymentByCard();
  }
  @Test
  public void testMarketOrderByDeliveryPaymentByBill() throws InterruptedException {

    driver.get(SITE_URL);
    AuthPageObject.marketAuthorization();
    EstimateMarketPageObject.addEstimateToBasket();
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    BasketPageObject.marketDelivery();
    BasketPageObject.paymentByBill();
  }
  @Test
  public void testMarketOrderByDeliveryPaymentByQR() throws InterruptedException {
    driver.get(SITE_URL);
    AuthPageObject.marketAuthorization();
    EstimateMarketPageObject.addEstimateToBasket();
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    BasketPageObject.marketDelivery();
    BasketPageObject.paymentByQR();
  }

  @Test

  public void testMarketOrderBySDEKPayUponReceipt() {
    driver.get(SITE_URL);
    AuthPageObject.marketAuthorization();
    EstimateMarketPageObject.addEstimateToBasket();
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    BasketPageObject.marketCDEK();
    BasketPageObject.marketPayUponReceipt();

  }
  @Test
  public void testMarketOrderBySDEKPayUponQR() {
    driver.get(SITE_URL);
    AuthPageObject.marketAuthorization();
    EstimateMarketPageObject.addEstimateToBasket();
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    BasketPageObject.marketCDEK();
    BasketPageObject.paymentByQR();
  }
  @Test
  public void testMarketOrderBySDEKPayByCard()  {
    driver.get(SITE_URL);
    AuthPageObject.marketAuthorization();
    EstimateMarketPageObject.addEstimateToBasket();
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    BasketPageObject.marketCDEK();
    BasketPageObject.paymentByCard();
  }

  @Test

  public void testIPRO_OrderByPickupPayByBill() throws InterruptedException {
    driver.get(SITE_URL);
    AuthPageObject.iPROAuthorization();
    EstimateIPROPageObject.addEstimateToBasketIPRO();
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    BasketPageObject.marketPickup();
    BasketPageObject.paymentByBillIPRO();
  }

  @Test
  public void testIPRO_OrderByPickupPaymentByCard() throws InterruptedException {
    driver.get(SITE_URL);
    AuthPageObject.iPROAuthorization();
    EstimateIPROPageObject.addEstimateToBasketIPRO();
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    BasketPageObject.marketPickup();
    BasketPageObject.paymentByCard();
  }

  @Test
  public void testIPRO_OrderByPickupPaymentByQR() throws InterruptedException {
    driver.get(SITE_URL);
    AuthPageObject.iPROAuthorization();
    EstimateIPROPageObject.addEstimateToBasketIPRO();
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    BasketPageObject.marketPickup();
    BasketPageObject.paymentByQR();
  }

  @Test
  public void testIPRO_OrderByPickupPaymentByAmpers() throws InterruptedException {
    driver.get(SITE_URL);
    AuthPageObject.iPROAuthorization();
    EstimateIPROPageObject.addEstimateToBasketIPRO();
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    BasketPageObject.marketPickup();
    BasketPageObject.paymentByAmpers();
  }

  @Test
  public void testIPRO_OrderByDeliveryPaymentByQR() throws InterruptedException {

    driver.get(SITE_URL);
    AuthPageObject.iPROAuthorization();
    EstimateIPROPageObject.addEstimateToBasketIPRO();
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    BasketPageObject.iPRODelivery();
    BasketPageObject.paymentByQR();
  }

  @Test
  public void testIPRO_OrderByDeliveryPaymentByCard() throws InterruptedException {

    driver.get(SITE_URL);
    AuthPageObject.iPROAuthorization();
    EstimateIPROPageObject.addEstimateToBasketIPRO();
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    BasketPageObject.iPRODelivery();
    BasketPageObject.paymentByCard();

  }
  @Test
  public void testIPRO_OrderByDeliveryPaymentByBill() throws InterruptedException {

    driver.get(SITE_URL);
    AuthPageObject.iPROAuthorization();
    EstimateIPROPageObject.addEstimateToBasketIPRO();
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    BasketPageObject.iPRODelivery();
    BasketPageObject.paymentByBillIPRO();
  }
  @Test
  public void testIPRO_OrderByDeliveryPaymentByAmpers() throws InterruptedException {

    driver.get(SITE_URL);
    AuthPageObject.iPROAuthorization();
    EstimateIPROPageObject.addEstimateToBasketIPRO();
    MainPageObject.waitForElementAndClick("//button[@data-testid='go-checkout-btn']", "not found and click go-checkout-btn", 5);
    BasketPageObject.iPRODelivery();
    BasketPageObject.paymentByAmpers();
  }

  }*/
