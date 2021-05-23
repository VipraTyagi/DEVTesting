package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbLogin {
	WebDriver driver;
	
	

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		FbLogin obj = new FbLogin();
		obj.setup();
		obj.signup();
		

	}
	public void setup() throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        
	         driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
		}
public void  login() {
	
	WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
	WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
	WebElement loginbutton = driver.findElement(By.xpath("//*[@name='login']"));
	username.sendKeys("abc@xyz.com");
	password.sendKeys("abc123");
	loginbutton.click();
	
	
	 //Tag and ID for CSS selector
    //Syntax :”css = tag#id”
    
    // Tag and Class
    // Syntax : “css = tag.class”
    //Tag and Attribute
    // Syntax : “css = tag[attribute=value]”
	 //WebElement username = driver.findElement(By.cssSelector("input#email"));
    // WebElement password = driver.findElement(By.cssSelector("input#pass"));
     //WebElement loginbutton = driver.findElement(By.cssSelector("button[name=login]"));
     
     
     //username.sendKeys("abc@xyz.com");
     //password.sendKeys("pwd");
     //loginbutton.click();
	
}

public void signup() throws InterruptedException {
	WebElement signupbutton = driver.findElement(By.xpath("//*[text()='Create New Account']"));
	signupbutton.click();
	Thread.sleep(2000);
	WebElement DayDropDown = driver.findElement(By.xpath("//*[@title='Day']"));
	
	Select day= new Select(DayDropDown);
	day.selectByVisibleText("1");
	//day.selectByIndex(0);
	WebElement GenderMale = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
    GenderMale.click();
    
  //*[contains(text(),'friends')]                // minimise the length of string or text
  //*[starts-with(text(),'Connect')]			// To find with start of text or string
    
   
    
    
    
    
}
}
