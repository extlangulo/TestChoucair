package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OptionsGenerCalidadSoftware extends Principal {
	
	By CursoLocator = By.linkText("Modelo de calidad de software");
	
	public OptionsGenerCalidadSoftware(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void ClicCurso() throws InterruptedException {
		click(CursoLocator);
		Thread.sleep(3000);
	}

}
