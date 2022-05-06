// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Test2Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test2() {
    driver.get("http://localhost:4200/");
    driver.manage().window().setSize(new Dimension(974, 1040));
    driver.findElement(By.cssSelector(".mat-menu-trigger")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".mat-menu-item:nth-child(2)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".cdk-focused")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("#mat-tab-label-0-1 > .mat-tab-label-content")).click();
    driver.findElement(By.cssSelector(".ng-tns-c93-8 > .mat-form-field-infix")).click();
    driver.findElement(By.id("mat-input-6")).sendKeys("organizador1@frikiteam.com");
    driver.findElement(By.id("mat-input-8")).sendKeys("Angulo");
    driver.findElement(By.id("mat-input-9")).sendKeys("123456");
    driver.findElement(By.id("mat-input-10")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".btn-submit"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("mat-input-10")).sendKeys("Organizador de Eventos Friki de Puno");
    driver.findElement(By.cssSelector(".btn-submit")).click();
    driver.findElement(By.cssSelector(".btn-submit")).click();
    driver.findElement(By.cssSelector(".btn-submit")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
  }
}