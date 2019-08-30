package cl.consalud.qc.mobile.android.pages;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.relevantcodes.extentreports.ExtentTest;
import cl.consalud.qc.mobile.android.helpers.MobilePage;
import cl.consalud.qc.mobile.android.helpers.Helper;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class MiContrato extends MobilePage {

	private By ingresoSalud;
	private By seleccionarPdf;
	private By ingresoCartilla;
	private By volverMiContrato;
	private By coberturaOdo;
	private By coberturaSalud;
	
public MiContrato (AndroidDriver<AndroidElement> driver, ExtentTest test, Boolean TAKE_SS, int seconds) {
	super(driver, test, TAKE_SS, seconds);
	
	this.ingresoSalud = By.xpath("//*[@text='eye']");
	this.seleccionarPdf = By.xpath("//*[@id='icon' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Lector de PDF de Drive']]]");
	this.ingresoCartilla = By.xpath("(//android.widget.Image)[2]");
	this.volverMiContrato = By.xpath("//*[@contentDescription='Navegar hacia arriba']");
	this.coberturaOdo = By.xpath("//*[@text='eye']");
	this.coberturaSalud = By.xpath("(//android.widget.Image)[2]");
	}

public void miContrato (String subDir) {
	
	//Ingreso a Plan de Salud
	driver.findElement(ingresoSalud).click();
	Helper.waitSeconds(7);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Mi Contrato", subDir, "Contrato 01_APPC-01");
	Helper.waitSeconds(2);
			
	//Seleccionar PDF
	driver.findElement(seleccionarPdf).click();
	Helper.waitSeconds(7);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Mi Contrato", subDir, "Contrato 02_APPC-02");
	Helper.waitSeconds(2);
	
	//Ingreso a Cartilla
	driver.findElement(ingresoCartilla).click();
	Helper.waitSeconds(7);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Mi Contrato", subDir, "Contrato 03_APPC-03");
	Helper.waitSeconds(2);
	
		
	//Seleccionar PDF
	driver.findElement(seleccionarPdf).click();
	Helper.waitSeconds(7);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Mi Contrato", subDir, "Contrato 04_APPC-04");
	Helper.waitSeconds(2);
		
		
	//Volver a Mi Contrato
	driver.findElement(volverMiContrato).click();
	Helper.waitSeconds(7);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Mi Contrato", subDir, "Contrato 05_APPC-05");
	Helper.waitSeconds(2);
			
	}

public void misComplementos (String subDir) {
	
	//Instrucciòn para deslizar pantalla hacia abajo		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	HashMap<String, String> scrollObject = new HashMap<String, String>();
	scrollObject.put("direction", "down");
	js.executeScript("mobile: scroll", scrollObject);
	Helper.waitSeconds(7);
		
	//Pinchar para ingresar a PFD Cobertura Odontologica
	driver.findElement(coberturaOdo).click();
	Helper.waitSeconds(7);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Mis Coberturas", subDir, "Cobertura 01_APPC-01");
	Helper.waitSeconds(2);

	//Seleccionar PDF
	driver.findElement(seleccionarPdf).click();
	Helper.waitSeconds(7);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Visualizar PDF Mis Coberturas", subDir, "Cobertura 02_APPC-02");
	Helper.waitSeconds(2);
			
			
	//Volver a Mi Contrato
	driver.findElement(volverMiContrato).click();
	Helper.waitSeconds(7);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para volver a Mi Contrato", subDir, "Cobertura 03_APPC-03");
	Helper.waitSeconds(2);
				
	//Pinchar para ingresar a PFD Cobertura Odontologica
		driver.findElement(coberturaSalud).click();
		Helper.waitSeconds(7);
		Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Mis Coberturas", subDir, "Cobertura 01_APPC-01");
		Helper.waitSeconds(2);

		//Seleccionar PDF
		driver.findElement(seleccionarPdf).click();
		Helper.waitSeconds(7);
		Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Visualizar PDF Mis Coberturas", subDir, "Cobertura 02_APPC-02");
		Helper.waitSeconds(2);
				
				
		//Volver a Mi Contrato
		driver.findElement(volverMiContrato).click();
		Helper.waitSeconds(7);
		Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para volver a Mi Contrato", subDir, "Cobertura 03_APPC-03");
		Helper.waitSeconds(2);
		
		//Instrucciòn para deslizar pantalla hacia abajo		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject2 = new HashMap<String, String>();
		scrollObject2.put("direction", "up");
		js.executeScript("mobile: scroll", scrollObject);
	
	}
}
