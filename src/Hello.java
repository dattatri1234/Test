import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hello {

	public static void main(String[] args) {
		AutomationReadProperties prop = new AutomationReadProperties();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://justrechargeit.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(prop.getProperty("home.signin"))).click();
		driver.findElement(By.xpath(prop.getProperty("login.username"))).sendKeys("Anil.Shirole.jy@gmail.com");
		driver.findElement(By.xpath(prop.getProperty("login.password"))).sendKeys("123456");
		driver.findElement(By.xpath(prop.getProperty("login.login"))).click();
		
	}
}


		
		
		
		
		
		
		
		
		
		
		
		
		
//		String mobileNo = "9425152516";
//		List<WebElement> rows= driver.findElements(By.className("listrow"));
//		int i=0;
//		for(WebElement row : rows){
//			if(mobileNo.equals(row.findElement(By.className("listcontent")).getText())){
//				driver.findElement(By.xpath(".//*[@id='listingtable_ImgRecharge_"+i+"']")).click();
//			}
//			i++;
//			//List<WebElement> cols= row.findElements(By.className("listcontent"));
////					for(WebElement col : cols){
////						System.out.println(col.getText());
////					}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
//		List<WebElement> rows = driver.findElements(By.className("listrow"));
//		int i=0;
//		for(WebElement row : rows){
//			if(row.findElement(By.className("listcontent")).getText().equals("9885152516")){
//				row.findElement(By.xpath(".//*[@id='listingtable_ImgRecharge_"+i+"']")).click();
//			}
//			i++;
//		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		Actions mouseA = new Actions(driver);
//		mouseA.contextClick(driver.findElement(By.xpath(".//*[@id='signup-link9']")))
//		.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		
		

//		
//	 	String parentWin = driver.getWindowHandle();
//		driver.findElement(By.linkText("View Popular Recharges")).click();
//		for(String win : driver.getWindowHandles()){
//			driver.switchTo().window(win);
//			if(driver.getCurrentUrl().contains("JRIPopularRecharges.aspx")){
//				driver.findElement(By.linkText("320")).click();
//			}
//		}
//		driver.switchTo().window(parentWin);
//		driver.findElement(By.xpath(".//*[@id='btnProceedtoPay']")).click();
//		
// 		}
//}

