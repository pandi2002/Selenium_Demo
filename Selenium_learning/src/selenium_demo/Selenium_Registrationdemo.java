package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Registrationdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd=new ChromeDriver();
		wd.get("https://demo.automationtesting.in/Register.html");
		wd.manage().window().maximize();
		wd.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Raja");
		wd.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Pandi");
		wd.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Chennai");
		wd.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("pandi2002ragav");
		wd.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9361115851");
		wd.findElement(By.xpath("//input[@value='Male']")).click();
		wd.findElement(By.xpath("//input[@value='Movies']")).click();
		wd.findElement(By.id("msdd")).click();
		wd.findElement(By.xpath("//a[contains(text(),'Japanese')]")).click();
//		wd.findElement(By.xpath("//select[@ng-model='Skill']")).sendKeys("Python");
		//for dropdown list handle like this
		Select s=new Select(wd.findElement(By.id("Skills")));
		s.selectByVisibleText("Python");
		Thread.sleep(2000);
		s.selectByIndex(5);
		wd.findElement(By.xpath("//span[@role='combobox']")).click();
		wd.findElement(By.xpath("//li[contains(text(),'India')]")).click();
		Select s1=new Select(wd.findElement(By.id("yearbox")));
		s1.selectByValue("2002");
		Select s2=new Select(wd.findElement(By.xpath("//select[@placeholder='Month']")));
		s2.selectByVisibleText("January");
		Select s3=new Select(wd.findElement(By.id("daybox")));
		s3.selectByValue("1");
		wd.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("Pandi@123");
		wd.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys("Pandi@123");
		wd.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\rajapandi.p\\Downloads\\Assignment03.docx");
		
		
		
		}

}
