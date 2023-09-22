package SecondTryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import SecondTrySteps.ButtonPages;



public class PimPage {
	private ButtonPages buttonPages;

	
	@FindBy(how = How.XPATH, using = "//input[@class='oxd-input oxd-input--active orangehrm-firstname']")
	private WebElement txtfirstName;

	@FindBy(how = How.XPATH, using = "//input[@class='oxd-input oxd-input--active orangehrm-lastname']")
	private WebElement txtlastName;
	
	
	
	//constructor
	public PimPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages=new ButtonPages(driver);
	}
	
	public void llegarPim() {
		buttonPages.buttonPim();
		buttonPages.buttonAdd();
	}
	
	String firstName = "//input[@class='oxd-input oxd-input--active orangehrm-firstname']";
	String lastName = "//input[@class='oxd-input oxd-input--active orangehrm-lastname']";
	
	public void addEmployee	(String firstName,String lastName) {
		txtfirstName.sendKeys(firstName);
		txtlastName.sendKeys(lastName);
		buttonPages.Save();
		
	}
	
}
