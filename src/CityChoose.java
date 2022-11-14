import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CityChoose {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","/Users/imac/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.booking.com");
		
		driver.manage().window().maximize();
		
		

	}

}
