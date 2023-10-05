package SecondTryDefinitions;

import org.openqa.selenium.WebDriver;

import SecondTryPages.PimPage;
import SecondTryPages.LeavePage;
import SecondTryPages.LoginPage;
import SecondTrySteps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class DefinitionsSteps {
	private WebDriver driver;
	
	private Conexion conexion = new Conexion();
	private LoginPage loginPage= new LoginPage(driver);
	private PimPage pimPage = new PimPage(driver);
	private LeavePage leavePage = new LeavePage(driver);
	
	
	@Given("^abrir el navegador$")
	public void abrir_Navegador() {
	this.conexion = new Conexion();
	this.driver=this.conexion.abrirElNavegador();
	}
	
	@And("^llenar campo usuario(.*) y password(.*)$")
	public void llenarDatosLogin(String username,String password) {
	this.loginPage = new LoginPage(driver);
	this.loginPage.llenarlogin(username, password);
	}
	
	@And("^llegar a la opcion agregar empleado")
	public void llegarAddEmployee() {
		this.pimPage= new PimPage(driver);
		this.pimPage.llegarPim();
	}
	
	@And("^al diligenciar first name(.*) y lastname (.*)$")
	public void AddEmployee(String firstName, String lastName) {
		this.pimPage= new PimPage(driver);
		this.pimPage.addEmployee(firstName, lastName);
	}
	
	@And("^llegar a leave page$")
	public void llegarLeavePage() {
		this.leavePage= new LeavePage(driver);
		this.leavePage.llegarleavePage();	
	}
	
	@And("^Scroll Down to employee(.*)$")	
	public void bajarToEmployee(String employee) {
		this.leavePage= new LeavePage(driver);
		this.leavePage.scrolldown(employee);
	}
	
	@And("^regresa a cerrar explorador$")
	public void cerrarExplorador() {
		this.conexion = new Conexion();
		this.driver=this.conexion.PostEjecucion(driver);
		
	}
	
}
