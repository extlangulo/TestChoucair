package PageObjectModel;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class testEmpleoDisponible {

	private WebDriver driver;
	ModuloEmpleo empleo;
	TagConvocatoria convocatorias;
	EmpleosDisponibles empleosBuscar;
	PostularTrabajo empleoDisponible;
	
	@Before
	public void setUp() throws Exception {
		empleo = new ModuloEmpleo(driver);
		driver = empleo.chromeDriverConnection();
		convocatorias = new TagConvocatoria(driver);
		empleosBuscar = new EmpleosDisponibles(driver);
		empleoDisponible = new PostularTrabajo(driver);
		empleo.visit("https://www.choucairtesting.com/");
	    
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		empleo.Navegar();
		assertTrue(empleo.isSerChoucairDisplayed());
		assertTrue(empleo.isConvocatoriasDisplayed());
		assertTrue(empleo.isPreparseDisplayed());
		convocatorias.navegarEnlace();
		assertEquals("CONVOCATORIAS",convocatorias.ObtenertextConvocatorias());
		empleosBuscar.IngresarEmpleo();
		assertEquals("Search completed. Found 1 matching record.",empleosBuscar.SearchMessageJob());
		Thread.sleep(2000);
		empleoDisponible.VerEmpleo();
		Thread.sleep(2000);
		empleoDisponible.Postulacion();
		Thread.sleep(2000);
		assertEquals("Your job application has been submitted successfully",empleoDisponible.MensajeConfirmacion());
	}

}
