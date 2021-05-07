package PageObjectModel;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagConvocatoria extends Principal {
	
	By ConvocatoriaslinkLocator = By.linkText("Convocatorias");
	By ObtenertextConvocatorias = By.tagName("h2");

	public TagConvocatoria(WebDriver driver) {
		super(driver);

	}
		
	public void navegarEnlace() throws InterruptedException {
		click(ConvocatoriaslinkLocator);
		Thread.sleep(2000);
	}
	
	public String ObtenertextConvocatorias() {
		List<WebElement> text = findElements(ObtenertextConvocatorias);
		return getText(text.get(1));
	}

}
