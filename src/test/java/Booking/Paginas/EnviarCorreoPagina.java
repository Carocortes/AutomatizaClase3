package Booking.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Booking.Steps.BotonesPaginas;
import Booking.Steps.Questions;
import net.thucydides.core.annotations.Step;

public class EnviarCorreoPagina {

	private WebDriver driver;
	private BotonesPaginas botonesPaginas = new BotonesPaginas(driver);
	private Questions questions = new Questions ((driver));
	
	
	// Elementos que se encuentran en la página

	@FindBy(how = How.XPATH, using = "//input[@placeholder= 'Full Name']")
	private WebElement textoName; // Variables que se utilizan dentro de la clase
	@FindBy(how = How.ID, using = "userEmail")
	private WebElement textoCorreo;

	public EnviarCorreoPagina(WebDriver driver) 
	{

		PageFactory.initElements(driver, this);
		this.driver= driver;
		
		this.botonesPaginas = new BotonesPaginas (driver);
		this.questions = new Questions (driver);
	}
	
	@Step
	public void registrocorreoM(String nombreP,String correoP) 
	{
		textoName.sendKeys(nombreP);
		textoCorreo.sendKeys(correoP);
		botonesPaginas.scrollBtnUpdate();
		botonesPaginas.btnEnviar();
		questions.assertDatos(nombreP);
	}
	@Step
	public void validacionCampos(String nombreP) 
	{
		questions.assertDatos(nombreP);
		
	}
	
	
	

}
