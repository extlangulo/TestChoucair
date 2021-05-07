package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ModuloEmpleo extends Principal {
		
		By EmpleoLinkLocator = By.linkText("Empleos");
		By SerChoucairLinkLocator = By.linkText("¿Qué es ser Choucair?");
		By ConvocatoriaslinkLocator = By.linkText("Convocatorias");
		By PreparseLinkLocator = By.linkText("Prepararse para aplicar");
		
		public ModuloEmpleo(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}
		
		public void Navegar() throws InterruptedException {
			click(EmpleoLinkLocator);
			Thread.sleep(2000);
		}
		
		public boolean isSerChoucairDisplayed() {
			return isDisplayed(SerChoucairLinkLocator);
		
		}
		
		public boolean isConvocatoriasDisplayed() {
			return isDisplayed(ConvocatoriaslinkLocator);
		}
		
		public boolean isPreparseDisplayed() {
			return isDisplayed(PreparseLinkLocator);
		}
		
		

}
