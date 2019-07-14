package demoJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoJenkinsnJobs {
	
	@Test
	public void testJenkins() {
		System.out.println("Welcome to Jenkins world");
		System.setProperty("webdriver.chrome.driver", "C:\\STS_BC\\JenkinsDemo\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println("I am Done with opening of google in browser");
		System.out.println("Hello from branch2");
		driver.quit();
	}

}
