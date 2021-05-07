package PageObjectModel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class testTagConvocatoria {
	
	private WebDriver driver;
	ModuloEmpleo empleo;
	TagConvocatoria convocatoria;
	
	@Before
	public void setUp() throws Exception {
		empleo = new ModuloEmpleo(driver);
		driver = empleo.chromeDriverConnection();
		convocatoria = new TagConvocatoria(driver);
	    empleo.visit("https://www.choucairtesting.com/");
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	public void test() throws InterruptedException {
		empleo.Navegar();
		assertTrue(empleo.isSerChoucairDisplayed());
		assertTrue(empleo.isConvocatoriasDisplayed());
		assertTrue(empleo.isPreparseDisplayed());
		convocatoria.navegarEnlace();
		assertEquals("CONVOCATORIAS",convocatoria.ObtenertextConvocatorias());
			
	}



}
