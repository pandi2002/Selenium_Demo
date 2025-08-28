package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {
  @Test(dataProvider = "dp")
  public void log(String username, String password) {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://testtrack.org/login-demo");
	  driver.manage().window().maximize();
	  WebElement user=driver.findElement(By.id("username"));
	  user.click();
	  user.sendKeys(username);
	  WebElement pwd=driver.findElement(By.id("password"));
	  pwd.click();
	  pwd.sendKeys(password);
	  WebElement login=driver.findElement(By.id("login-submit"));
	  login.click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "testuser", "password123" },
      new Object[] { "Raja", "secret_sauce" },
    };
  }
}
