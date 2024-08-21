package Automation_project.Selenium;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TakesScreenshot;
public class SeleniumPro {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub 
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click(); 
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
     
    
     
        driver.findElement(By.name("firstname")).sendKeys("Jaseem");
       WebElement last = driver.findElement(By.name("lastname"));
       //last.sendKeys("khan");
       JavascriptExecutor js =(JavascriptExecutor)driver;
       js.executeScript("arguments[0].value='Khan'", last);
       last.submit();
       
       Thread.sleep(3000);
      
       
       driver.findElement(By.name("reg_email__")).sendKeys("jaseem313@gmail.com");
   //    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Jaseem313@gmail.com");
       
      // driver.manage().timeouts().implicitlyWait(null)
       driver.findElement(By.name("reg_passwd__")).sendKeys("12345678");
       
       WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
       Select D = new Select(day);
      D.selectByValue("8");
       
       WebElement month = driver.findElement(By.name("birthday_month"));
       Select M = new Select(month);
     M.selectByVisibleText("Jan");
       
       WebElement year = driver.findElement(By.id("year"));
       Select Y = new Select(year);
       Y.selectByValue("1995");
       
       WebElement button = driver.findElement(By.xpath("//label[text()='Male']"));
       boolean isDisplay = driver.findElement(By.xpath("//label[text()='Male']")).isDisplayed();
       boolean isEnable = driver.findElement(By.xpath("//label[text()='Male']")).isEnabled();

       boolean isSelected = driver.findElement(By.xpath("//label[text()='Male']")).isSelected();
 
       if (isDisplay)
       {  System.out.println("button isDislpayed");
       }else {
    	   System.out.println("button Is not display");
       }
       
       if (isEnable)
       {  System.out.println("button is Enable");
       }else {
    	   System.out.println("button Is not Enable");
       }
       
       
       if (isSelected)
       {  System.out.println("button Is Selected");
       }else {
    	   System.out.println("button Is not Selected");
       }
      
       String text =button.getText();
       button.click();
       
       System.out.println(text);
       TakesScreenshot screen =(TakesScreenshot)driver;
     File src =  screen.getScreenshotAs(OutputType.FILE);
       File Dtn =new File("D:\\screen.png");
       FileHandler.copy(src, Dtn);
       
    WebElement submit =   driver.findElement(By.name("websubmit"));
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
     wait.until(ExpectedConditions.elementToBeClickable(submit));
     
    js.executeScript("arguments[0].scrollIntoView()", submit);
    submit.click();
  Thread.sleep(10000);
 // driver.close();
  
        
	}

}
