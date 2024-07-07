package LearningSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64
		// (2)\\chromedriver-win64.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		// driver.quit();

		// Chrome

		// ChromeOptions options = new ChromeOptions();

		// options.addArguments("--remote-allow-origins=*");

		// System.setProperty("webdriver.chrome.driver",
		// "/Users/rahulshetty/Documents/chromedriver");

		// WebDriver driver = new ChromeDriver(options);

           //Firefox

		//System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");

		//WebDriver driver1 = new FirefoxDriver();

            //Microsoft Edge

		//System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");

		WebDriver driver2 = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.close();

        //driver.quit();

	}

}
