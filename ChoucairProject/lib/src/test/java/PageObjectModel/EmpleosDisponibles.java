package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmpleosDisponibles extends Principal {
	
	By ConvocatoriaslinkLocator = By.linkText("Convocatorias");
	By SearchKeywordLocator = By.id("search_keywords");
	By searchlocation = By.id("search_location");
	By SearchJobLocator	= By.className("search_submit");
	By SearchMessageJob= By.cssSelector(".showing_jobs > span");
	By NoJobsMessage = By.className("no_job_listings_found");
	By LocationMessage = By.className("location");
		
	public EmpleosDisponibles(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub

	}
		
	public void IngresarEmpleo() throws InterruptedException {
		sendKeys("Analista de pruebas móviles",SearchKeywordLocator);
		click(SearchJobLocator);
		Thread.sleep(4000);

	}
		
	public void NoExisteEmpleo() throws InterruptedException {
		sendKeys("Medico",SearchKeywordLocator);
		click(SearchJobLocator);
		Thread.sleep(4000);
	}
		
	public void LocationEmpleo() throws InterruptedException  {
		sendKeys("Lima",searchlocation);
		click(SearchJobLocator);
		Thread.sleep(4000);
	}
		
	public String SearchMessageJob() {
		return getText(SearchMessageJob);
	}
		
	public String NoJobsMessage() {
		return getText(NoJobsMessage);
	}
		
	public String EmpleoMessage() {
		return getText(LocationMessage);
	}

}
