package Automation_project.Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automate_SIte {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
	
		driver.navigate().to("https://the-internet.herokuapp.com");

	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	
//	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	String TL=driver.getTitle();
	System.out.println(TL);
	
	 driver.findElement(By.xpath("//a[text()='Add/Remove Elements']")).click();
	 
	 driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
	 
	 Thread.sleep(5);
	 driver.findElement(By.className("added-manually")).click();
	 
	 
	driver.navigate().back();
	//https:Jaseemk:Jaseem@123@xyz.com";
	driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	WebElement  basic =driver.findElement(By.xpath("//div[@id='content']/child::div/p"));
	 System.out.println(basic.getText());
	 
	 
	 driver.navigate().back();
	}

}
