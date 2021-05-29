package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridExample {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	      DesiredCapabilities obj=new DesiredCapabilities();
	      obj.setBrowserName("chrome");
	      obj.setPlatform(Platform.WINDOWS);
	      String sURL="http://192.168.29.179:4444/wd/hub";
         WebDriver driver = new RemoteWebDriver(new URL(sURL),obj);
         driver.get("https://www.simplilearn.com/");
         Thread.sleep(2000);
	}

}
