package selenium_demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

		WebElement btn = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		Thread.sleep(2000);

		btn.click();

		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(a.getText());
		a.accept();
		
		WebElement tab2 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ' ]"));
		tab2.click();
		
		WebElement btn1 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		Thread.sleep(2000);
		
		btn1.click();
		
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(a1.getText());
		a1.accept();




	}

}
