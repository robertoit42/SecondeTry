package SecondTrySteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Conexion {
	 
private WebDriver driver = new ChromeDriver();
	//private WebDriver driver;

	@Before
	public WebDriver abrirElNavegador() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}

	@After
	public WebDriver PostEjecucion(WebDriver driver) {
		
		driver.close();
		driver.quit();
		return driver;
	}
}
