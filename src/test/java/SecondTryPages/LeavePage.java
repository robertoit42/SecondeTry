package SecondTryPages;

import org.openqa.selenium.WebDriver;

import SecondTrySteps.ButtonPages;
import SecondTrySteps.Questions;


public class LeavePage {
	private ButtonPages buttonPages;
	private Questions questions;
	

	//constructor
	public LeavePage(WebDriver driver) {
		this.buttonPages = new ButtonPages(driver);
		this.questions= new Questions(driver);
	}
	
	public void llegarleavePage() {
		buttonPages.Leavebutton();
		
	}
	
	public void scrolldown(String employee) {
	  questions.searchScroll(employee);
	}
	
	
	
}
