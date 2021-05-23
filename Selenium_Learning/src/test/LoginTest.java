package test;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


@Listeners(TestNGListenerExample.class)

public class LoginTest {
 WebDriver driver;
 XSSFWorkbook Workbook;
 XSSFSheet sheet1;
	
		
		@BeforeMethod
		public void setup() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        
	         driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        
        driver.get("https://www.simplilearn.com/");
        Thread.sleep(2000);
        
        FileInputStream fis = new FileInputStream("dataexcel.xlsx");
        
        Workbook = new XSSFWorkbook(fis);
        sheet1 = Workbook.getSheetAt(0);
		}
		
		
		@Test
		@Parameters({"uname","pwd"})
		public void login( String name,String pass) {
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();
        
        WebElement username = driver.findElement(By.name("user_login"));
        
        String n1=sheet1.getRow(0).getCell(0).getStringCellValue();
        username.sendKeys(n1);
        
        
        WebElement password = driver.findElement(By.name("user_pwd"));
        String p1=sheet1.getRow(0).getCell(1).getStringCellValue();
        password.sendKeys(p1);
        
        WebElement chkBox = driver.findElement(By.className("rememberMe"));
        chkBox.click();
        
        WebElement loginbutton = driver.findElement(By.name("btn_login"));
        loginbutton.click();
        
        WebElement errormsg = driver.findElement(By.id("msg_box"));
    
        String actError = errormsg.getText();
        String expError = "The email or password you have entered is invalid.";
        
        Assert.assertEquals(actError,expError);
        
		/*
		 * if(actError.equals(expError)) { System.out.print("Pass");
		 * 
		 * }else { System.out.print("Fail"); }
		 */
		}
		
		
		@AfterMethod
    public void teardown() {
    	
    	driver.quit();
    }

	}


