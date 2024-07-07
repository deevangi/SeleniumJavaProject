package LearningSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class LB001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	}

}
