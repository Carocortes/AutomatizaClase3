package Booking.Definitions;

import org.openqa.selenium.WebDriver;

import Booking.Paginas.CargarArchivoPagina;
import Booking.Paginas.EnviarCorreoPagina;
import Booking.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion ;
    private EnviarCorreoPagina enviarCorreoPagina;
    private CargarArchivoPagina cargarArchivoPagina;
   
	

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}
	@And("^Seleccionar campo nombre (.*) y correo (.*)$")
	public void diligenciarNombreM(String nombreP,String correoP) 
	{
		this.enviarCorreoPagina = new EnviarCorreoPagina(driver);
		this.enviarCorreoPagina.registrocorreoM(nombreP,correoP);
		
	}
	@Then("^Se validan que los campos cumplen (.*)")
	public void validacion(String nombreP,String correoP) 
	{
		//this.enviarCorreoPagina = new EnviarCorreoPagina(driver);
		this.enviarCorreoPagina.validacionCampos(nombreP);
		
	}
	
	@And("^llegar a cargar$")
	public void llegar() {
		this.cargarArchivoPagina = new CargarArchivoPagina(driver);
		this.cargarArchivoPagina.llegarUpload();
	}
	
	
}