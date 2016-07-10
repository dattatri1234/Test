import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Recharge {

	public static void main(String[] args) {
		AutomationReadProperties prop = new AutomationReadProperties();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.justrechargeit.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(prop.getProperty("home.signin"))).click();
		driver.findElement(By.xpath(prop.getProperty("login.username"))).sendKeys("Anil.Shirole.jy@gmail.com");
		driver.findElement(By.xpath(prop.getProperty("login.password"))).sendKeys("123456");
		driver.findElement(By.xpath(prop.getProperty("login.login"))).click();
	}

}
