import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class runner {

	public static void main(String[] args) {

		//invoking web browser
		//Selenium manager manages the chrome driver
		System.setProperty("webdriver.edge.driver", "/Users/yashg/OneDrive/Documents/Applications/Web drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		
		
		
		driver.close();
	}

}
