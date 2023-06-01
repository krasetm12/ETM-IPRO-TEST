package lib.ui;

import lib.BaseSeleniumPage;

public class HeaderPageObject extends BaseSeleniumPage {
  MainPageObject MainPageObject = new MainPageObject();

  public void selectCity(){ //выбор города в хэдэре-дописать , чтобы выводит параметр города в сигнатуре метода строкой
    MainPageObject.waitForElementAndClick("//button[@data-testid='current-city']","not found element geolocation",5);
    MainPageObject.waitForElementAndClick("//span[contains(.,'Санкт-Петербург и ЛО')]","not click SPB",5);
  }
  public void exitToProfile(){
    MainPageObject.waitForElementAndClick("//button[@id=['composition-button']","not found button of profile",5);
    MainPageObject.waitForElementAndClick("//li[@data-testid='drop-menu-item-exit']","not found and click of exit ",5);
  }
}
