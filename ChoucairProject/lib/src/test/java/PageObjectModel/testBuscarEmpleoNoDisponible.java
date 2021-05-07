package PageObjectModel;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class testBuscarEmpleoNoDisponible {
	
	private WebDriver driver;
	ModuloEmpleo moduloEmpleo;
	TagConvocatoria tagConvocatoria;
	EmpleosDisponibles empleosDisponibles;
	
	
	@Before
	public void setUp() throws Exception {
		moduloEmpleo = new ModuloEmpleo(driver);
		driver = moduloEmpleo.chromeDriverConnection();
		tagConvocatoria = new TagConvocatoria(driver);
		empleosDisponibles = new EmpleosDisponibles(driver);
		moduloEmpleo.visit("https://www.choucairtesting.com/");
	}
	

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		moduloEmpleo.Navegar();
		assertTrue(moduloEmpleo.isSerChoucairDisplayed());
		assertTrue(moduloEmpleo.isConvocatoriasDisplayed());
		assertTrue(moduloEmpleo.isPreparseDisplayed());
		tagConvocatoria.navegarEnlace();
		assertEquals("CONVOCATORIAS",tagConvocatoria.ObtenertextConvocatorias());
		empleosDisponibles.NoExisteEmpleo();
		assertEquals("There are no listings matching your search.",empleosDisponibles.NoJobsMessage());
	}


}
