package google;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.google.GoogleSearchPage;

public class GoogleTestsSuite {

  private WebDriver webDriver; //ссылка поля на наш драйвер -WebDriver -interface (у каждого своя реализация)

  @Before
  public void initDriver(){
    System.setProperty("webdriver.chrome.driver","chromedriver.exe");  // key and путь к драйверу (если в idea ./idea/ch..exe)
    webDriver = new ChromeDriver(); //создали драйвер Chrome, который умеет работать с Chrome браузером
    webDriver.manage().window().maximize();
  }

  @Test
  public void verifyGoogleSearchFunctionality(){
    webDriver.get("https://www.google.com/");
    GoogleSearchPage searchPage = new GoogleSearchPage(webDriver); //создаем объект страницы
    searchPage.searchFor("rozetka");
  }

  @After
  public void shutDownDriver(){
    webDriver.close();
    webDriver.quit();
  }
}
