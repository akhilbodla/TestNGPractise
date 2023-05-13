package sample;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	 WebDriver driver;
	 
	
  @BeforeMethod
  public void Test1() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.automationtesting.in/Register.html");
	  System.out.println("Application launched");
	  
  }
  @AfterMethod
  public void Test3() {
	  driver.close();
  }
  
  @Test ()
  public void Test2() {
	  
	WebElement firstname =  driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	firstname.sendKeys("BODLA");
//	System.out.println(firstname.getText());
	System.out.println(firstname.getAttribute("placeholder"));
	System.out.println(firstname.getAttribute("value"));
	firstname.clear();
	if(firstname.getAttribute("value").isEmpty()) {
		System.out.println("textbox is cleared");
	}else
	System.out.println("text box is not cleared");	
  }
  
 
//  public void Test4() throws InterruptedException {
//	
//	JavascriptExecutor var = (JavascriptExecutor) driver;
//	WebElement ele =  driver.findElement(By.id("//select[@id='yearbox']"));
//	var.executeScript("argument[0].scrollIntoView(true)", ele);
//	
//	Thread.sleep(3000);
//	Select years = new Select(ele);
//	years.selectByVisibleText("1931");
//	System.out.println(years.getFirstSelectedOption().getText());
//	List<WebElement> elements = years.getOptions();
//	for(WebElement year : elements ) {
//		System.out.println(year.getText());
//	}
//  }
//  
// 
  @Test
  public void Test4() {
	  Select DateDD1 = new Select(driver.findElement(By.id("yearbox")));
		 List<WebElement> YearOptions1 = DateDD1.getOptions();
		 for(WebElement Optionx1 : YearOptions1) {
		 System.out.println(Optionx1.getText());
		String t1 = Optionx1.getText();
		 DateDD1.selectByVisibleText(t1);
		 }
 }
//  
}
