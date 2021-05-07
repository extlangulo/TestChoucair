package PageObjectModel;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class testOptionsGenerCalidadSoftware {
	
	private WebDriver driver;
	ModuloEmpleo moduloEmpleo;
	TagPrepararseParaAplicar tagPrepararseParaAplicar;
	OptionsGenerCalidadSoftware optionsGenerCalidadSoftware;
	
	@Before
	public void setUp() throws Exception {
		moduloEmpleo = new ModuloEmpleo(driver);
		driver = moduloEmpleo.chromeDriverConnection();
		tagPrepararseParaAplicar = new TagPrepararseParaAplicar(driver);
		optionsGenerCalidadSoftware = new OptionsGenerCalidadSoftware(driver);
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
		tagPrepararseParaAplicar.navegarEnlace();
		assertEquals("PREPARARSE PARA APLICAR",tagPrepararseParaAplicar.ObtenerTextPreparse());
		optionsGenerCalidadSoftware.ClicCurso();
		
	}

}
