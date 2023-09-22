package SecondTrySteps;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ibm.icu.text.SimpleDateFormat;
import org.junit.Assert;

public class Questions {
	private WebDriver driver;
		
		public Questions(WebDriver driver) {
			this.driver= driver;
		}
		
		public void tituloAssert() {
			String ActualTitle= driver.getTitle();
			Assert.assertEquals(ActualTitle, "Booking.com");
			
		}
		
		public void screenShot() {
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			//File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//String filename = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			  String filename = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			  File dest = new File("C:\\Users\\Rcarlos\\Captura" + filename + ".png");
			try {
				FileUtils.copyFile(scr, dest);
			} catch (IOException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
				}
		}
		
		public void searchScroll(String employee)  {
			//WebElement result = driver.findElement(By.xpath("//table//*[text() = '" + employee + "' ]"));
			  //WebElement result = driver.findElement(By.xpath("//*[text()= '" + employee + "' ]"));
			  //WebElement result = driver.findElement(By.xpath("//*[text()='" +employee + "']"));
			  												   //*[text()='Anthony  Nolan']
			//WebElement result = driver.findElement(By.xpath("(//*[text()='" +employee + "'])")); works
			//WebElement result = driver.findElement(By.xpath("(//*[text()='Anthony  Nolan'])[2]")); works
			 WebElement result = driver.findElement(By.xpath("(//*[text()='" +employee + "'])[2]"));                                              
			//WebElement result = driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border']//*[text()='Aaliyah  Haq']"));

			JavascriptExecutor scroll = (JavascriptExecutor) driver;
			scroll.executeScript("arguments[0].scrollIntoView();", result);	
		}

		
		//(//*[text()='Anthony  Nolan'])[2]

}
