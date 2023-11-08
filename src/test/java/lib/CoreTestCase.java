package lib;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

abstract public class CoreTestCase {
  /*protected WebDriver driver;
  @BeforeEach
  public  void setUp() throws Exception{

    WebDriverManager.chromedriver().setup();
    ChromeOptions options= new ChromeOptions();
    options.setHeadless(false);
    options.addArguments("--disable-gpu");
    driver= new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
    driver.manage().timeouts().setScriptTimeout(3L, TimeUnit.SECONDS);
    //driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    BaseSeleniumPage.setDriver(driver);
  }
  @AfterEach
  public void tearDown(){
    driver.close();
    driver.quit();
  }
}*/
  public RemoteWebDriver driver;

  //http://localhost:4444/wd/hub"

  private static final
  String SELENIUM_URL = "http://autotest.etm.corp:4444/wd/hub";
  String ITEST_HOME_PAGE = "https://itest.etm.ru:3004";
  String SITE_URL = "https://idev.etm.ru/ipro3";
  String LOGIN_MARKET = "9216572712";
  String PASSWORD_MARKET = "qakras123";
  String LOGIN_IPRO = "60004392kal";
  String PASSWORD_IPRO = "qakras123";


  @BeforeEach
  public void start() throws Exception {
    this.driver = new RemoteWebDriver(
            new URL(SELENIUM_URL),
            new ChromeOptions()
    );
    this.driver.manage().window().maximize();
    this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterEach
  public void closeSeleniumSession() {
    this.driver.close();
    this.driver.quit();
  }
}
