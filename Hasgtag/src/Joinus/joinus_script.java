package Joinus;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class joinus_script 
{
  @Test
  public void verify() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
		 WebDriverWait wait=new WebDriverWait(driver, 10);
		 String title = driver.getTitle();
		 Assert.assertEquals(title,"");
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,450)");
		 WebElement	name =driver.findElement(By.xpath("//input[@name='name']"));
		 wait.until(ExpectedConditions.visibilityOf(name)).sendKeys("Pallavi");
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pallavilk110@gmail.com");
		 driver.findElement(By.xpath("//input[@type='number']")).sendKeys("8618053929");
		 driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Please find my attached CV");
		 WebElement browse =driver.findElement(By.xpath("//input[@id='inputFile']"));
		 Thread.sleep(1000);
		 browse.sendKeys("C:\\Users\\Admin\\Desktop\\pallavi\\RESUME\\EXPERIENCE\\PallaviCV3.pdf");
		 driver.findElement(By.xpath("//button[@class='btn form-button-child px-3']")).click();
   }
  
}
