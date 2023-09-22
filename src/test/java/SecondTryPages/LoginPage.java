package SecondTryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import SecondTrySteps.ButtonPages;

public class LoginPage {
	
	//llamado de una clase
	private ButtonPages buttonPages;
	
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	private WebElement Inputusername;
	
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	private WebElement Inputpassword;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
	
	}
	
	public void llenarlogin(String username, String pass) {
		Inputusername.sendKeys(username);
		Inputpassword.sendKeys(pass);
		buttonPages.bottonLogin();
		
		
		
	}
	
}
