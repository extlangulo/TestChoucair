package PageObjectModel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class testTagPrepararseParaAplicar {
	
	private WebDriver driver;
	ModuloEmpleo empleo;
	TagPrepararseParaAplicar tagPrepararseParaAplicar;
	
	@Before
	public void setUp() throws Exception {
		empleo = new ModuloEmpleo(driver);
		driver = empleo.chromeDriverConnection();
		tagPrepararseParaAplicar = new TagPrepararseParaAplicar(driver);
		tagPrepararseParaAplicar.visit("https://www.choucairtesting.com/");
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
		tagPrepararseParaAplicar.navegarEnlace();
		assertEquals("PREPARARSE PARA APLICAR",tagPrepararseParaAplicar.ObtenerTextPreparse());
	}

}
