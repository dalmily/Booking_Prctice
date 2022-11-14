import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {
		
		
		String testemail = "daniaalmilly39@gmail.com";
		
		String testpass = "Myfbpassword2";
		
		
		System.setProperty("webdriver.chrome.driver","/Users/imac/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.booking.com");
		driver.manage().window().maximize();
		

		
		driver.findElement(By.className("js-header-login-link")).click();
		
		driver.findElement(By.id("username")).sendKeys(testemail);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("new_password")).sendKeys(testpass);
		driver.findElement(By.id("confirmed_password")).sendKeys(testpass);
			
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button")).click();

		WebElement book = driver.findElement(By.id("x-captcha"));
		
		Actions act = new Actions(driver);
		act.moveToElement(book );
		 act.clickAndHold().perform();
	
		

	}

}
