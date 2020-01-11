package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		
/*	System.setProperty("webdriver.chrome.driver", "Firefoxdriver");
        WebDriver driver = new FirefoxDriver();
     driver.manage().window().maximize(); 
       
        driver.get("http://facebook.com"); */
		
		
	
		System.setProperty("webdriver.chrome.driver", "D: \\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/guru99home/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.close();
		
		
		
		
}
	}
