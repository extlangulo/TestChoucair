package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostularTrabajo extends Principal {
	
	By clicEmpleo = By.xpath("//*[@id='content']/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/ul/li/a/div[1]/h3");
	//By clicEmpleo = By.xpath("//h3[contains(text(),'Analista de pruebas móviles')]");
	By applyForJob = By.xpath("//*[@id=\'post-9855\']/div/div[2]/div[3]/input");
	By NombreCompleto = By.id("nombre-completo");
	By Correo = By.id("correo-electronico");
	By Celular = By.id("celular-o-telefono-de-contacto");
	By Estudios = By.id("que-estudios-formales-tienes-o-en-que-semestre-te-encuentras-actualmente");
	By TiempoExperiencia = By.id("que-tiempo-de-experiencia-certificada-tienes-en-pruebas-o-en-desarrollo-de-softwaresi-aplica");
	By Automatizador = By.id("conoces-de-automatizacion-de-pruebas-te-gustaria-aprendersi-aplica");
	By Salarial= By.id("cual-es-tu-aspiracion-salarial");
	By Disponibilidad = By.id("si-eres-seleccionado-que-disponibilidad-de-tiempo-para-ingresar-tendrias");
	By MensajeAdicional = By.id("mensaje-adicional");
	By ElegiCV = By.id("cv");
	By SedAplication = By.xpath("//*[@id=\'post-9855\']/div/div[2]/div[3]/div/form/p/input[1]");
	By Validacion = By.cssSelector("p[class=\"job-manager-message\"]");
	
	public PostularTrabajo(WebDriver driver) {
		super(driver);

	}	
	
	public void VerEmpleo() {
		click(clicEmpleo);
		
	}	
	
	public void Postulacion () throws InterruptedException {
		Scroll();
		Scroll();
		click(applyForJob);
		Thread.sleep(5000);
		sendKeys("Lorenzo Angulo",NombreCompleto);
		sendKeys("Lorenzo@gmail.com",Correo);
		sendKeys("98760013",Celular);
		sendKeys("Ing. Sistemas",Estudios);
		sendKeys("3 años",TiempoExperiencia);
		sendKeys("Si",Automatizador);
		sendKeys("3700",Salarial);
		sendKeys("SI",Disponibilidad);
		sendKeys("Pruebas",MensajeAdicional);
		UploadFile("C:\\Users\\soporteaplicaciones\\Desktop\\choucairtesting\\CV_Prueba.docx",ElegiCV);
		Thread.sleep(3000);
		Scroll();
		click(SedAplication);
		Thread.sleep(3000);
		
	}
	
	public String MensajeConfirmacion() {
		return getText(Validacion);
	}
	
}
