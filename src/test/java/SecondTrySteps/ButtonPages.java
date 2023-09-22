package SecondTrySteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement botonLogin;
	
	@FindBy(how = How.XPATH, using = "//*[@href='/web/index.php/pim/viewPimModule']")
	private WebElement btnPim;
	
	@FindBy(how = How.XPATH, using = "//div[@class='orangehrm-header-container']/button[@type='button']")
	private WebElement btnAdd;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement btnSave;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/web/index.php/leave/viewLeaveModule']")
	private WebElement btnLeave;
	
	public ButtonPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void bottonLogin() {
		botonLogin.click();
	}
	
	public void buttonPim() {
		btnPim.click();
	}
	
	public void buttonAdd() {
		btnAdd.click();
	}
	
	public void Save() {
		btnSave.click();
	}
	
	public void Leavebutton() {
		btnLeave.click();
	}
	
}
