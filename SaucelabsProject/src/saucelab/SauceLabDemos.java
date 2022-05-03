package saucelab;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;




public class SauceLabDemos {
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
	
		ChromeOptions options = new ChromeOptions();
		
		options.setPlatformName("Windows 10");
		options.setBrowserVersion("latest");
	
		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("username", System.getenv("oauth-rahul.flexy-22122"));
		sauceOptions.put("accessKey", System.getenv("e3fac0b0-a1cf-48a1-bd0d-cb612d4a2a6d"));
//		sauceOptions.put("name", testInfo.getDisplayName());
	
		options.setCapability("sauce:options", sauceOptions);
		URL url = new URL("https://oauth-rahul.flexy-22122:e3fac0b0-a1cf-48a1-bd0d-cb612d4a2a6d@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
//		https://oauth-rahul.flexy-22122:e3fac0b0-a1cf-48a1-bd0d-cb612d4a2a6d@ondemand.eu-central-1.saucelabs.com:443/wd/hub
		WebDriver driver = new RemoteWebDriver(url, options);
		
//		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumScripts\\SaucelabsProject\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		System.out.println("test complete");
		driver.get("https://www.geniusconsultant.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		   Thread.sleep(4000);
//		driver.findElement(By.id("q")).sendKeys("Automation Testing");
		System.out.println(driver.getTitle());
		driver.quit();
		System.out.println("test complete");
		
		
	}
}