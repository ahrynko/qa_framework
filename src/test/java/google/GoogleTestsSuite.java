package google;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTestsSuite {

  private WebDriver webDriver; //ссылка поля на наш драйвер -WebDriver -interface (у каждого своя реализация)

  @Before
  public void initDriver(){
    System.setProperty("webdriver.chrome.driver","chromedriver.exe");  // key and путь к драйверу (если в idea ./idea/ch..exe)
    webDriver = new ChromeDriver(); //создали драйвер Chrome, который умеет работать с Chrome браузером
    webDriver.manage().window().maximize();  // на весь экран
  }

  @Test
  public void checkGoogleSiteTitle(){
    webDriver.get("https://www.google.com/");  //пока хардкодим
    String title = webDriver.getTitle();  //
    Assert.assertEquals("There is incorrect title diplayed","Google",title ); // title -то что на сайте

  }

  @After
  public void shutDownDriver(){
    webDriver.close();
    webDriver.quit();

  }
}
