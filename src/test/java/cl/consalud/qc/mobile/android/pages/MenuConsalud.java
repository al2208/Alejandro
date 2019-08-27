package cl.consalud.qc.mobile.android.pages;

import org.openqa.selenium.By;
import com.relevantcodes.extentreports.ExtentTest;
import cl.consalud.qc.mobile.android.helpers.MobilePage;
import cl.consalud.qc.mobile.android.helpers.Helper;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MenuConsalud extends MobilePage {

	
	private By ingresoMenu;
	private By volverHome;
	private By ingresoMenuMiContrato;
	private By ingresoMenuMisBeneficios;
	private By ingresoMenuReembolso;
	private By ingresoMenuCertificados;
	private By ingresoMenuBonos;
	private By ingresoMenuTeOrientamos;
	

public MenuConsalud (AndroidDriver<AndroidElement> driver, ExtentTest test, Boolean TAKE_SS, int seconds) {
	super(driver, test, TAKE_SS, seconds);
	
	this.ingresoMenu = By.xpath("//*[@text='menu']");
	this.volverHome = By.xpath("//*[@text='arrow back']");
	this.ingresoMenuMiContrato = By.xpath("//*[@text='Mi Contrato']");
	this.ingresoMenuMisBeneficios = By.xpath("//*[@text='Mis Beneficios']");
	this.ingresoMenuReembolso = By.xpath("//*[@text='Reembolso']");
	this.ingresoMenuCertificados = By.xpath("//*[@text='Certificados']");
	this.ingresoMenuBonos = By.xpath("//*[@text='Bonos']");
	this.ingresoMenuTeOrientamos = By.xpath("//*[@text='Te Orientamos']");
	
	}

public void homeMenu (String subDir) {
	
	//Click para ingresara Menú Lateral de APP Consalud
	driver.findElement(ingresoMenu).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Menu Lateral", subDir, "Menu 01_APPC-01");
	Helper.waitSeconds(2);
	
	//Visualizar Menú Lateral y volver a Home
	driver.findElement(volverHome).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Visualizar contenido Menu Lateral", subDir, "Menu 02_APPC-02");
	Helper.waitSeconds(2);
	
	}

public void menuMiContrato (String subDir) {
	
	//Click para ingresara Menú Lateral de APP Consalud
	driver.findElement(ingresoMenu).click();
	Helper.waitSeconds(5);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Menu Lateral", subDir, "Contra 01_APPC-01");
	Helper.waitSeconds(2);
	
	//Visualizar Menu Mi Contrato
	driver.findElement(ingresoMenuMiContrato).click();
	Helper.waitSeconds(5);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Menu Mi Contrato", subDir, "Contra 02_APPC-02");
	Helper.waitSeconds(2);
	
	}

public void menuMisBeneficios (String subDir) {
	
	//Click para ingresara Menú Lateral de APP Consalud
	driver.findElement(ingresoMenu).click();
	Helper.waitSeconds(5);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Menu Lateral", subDir, "Benef 01_APPC-01");
	Helper.waitSeconds(2);
	
	//Visualizar Menu Mi Contrato
	driver.findElement(ingresoMenuMisBeneficios).click();
	Helper.waitSeconds(5);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Menu Mi Contrato", subDir, "Benef 02_APPC-02");
	Helper.waitSeconds(2);
	
	}

public void menuReembolso (String subDir) {
	
	//Click para ingresara Menú Lateral de APP Consalud
	driver.findElement(ingresoMenu).click();
	Helper.waitSeconds(5);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Menu Lateral", subDir, "Reem 01_APPC-01");
	Helper.waitSeconds(2);
	
	//Visualizar Menu Mi Contrato
	driver.findElement(ingresoMenuReembolso).click();
	Helper.waitSeconds(5);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Menu Reembolso", subDir, "Reem 02_APPC-02");
	Helper.waitSeconds(2);
	
	}

public void menuCertificados (String subDir) {
	
	//Click para ingresara Menú Lateral de APP Consalud
	driver.findElement(ingresoMenu).click();
	Helper.waitSeconds(5);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Menu Lateral", subDir, "Certi 01_APPC-01");
	Helper.waitSeconds(2);
	
	//Visualizar Menu Mi Contrato
	driver.findElement(ingresoMenuCertificados).click();
	Helper.waitSeconds(5);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Menu Certificados", subDir, "Certi 02_APPC-02");
	Helper.waitSeconds(2);
	
	}

public void menuBonos (String subDir) {
	
	//Click para ingresara Menú Lateral de APP Consalud
	driver.findElement(ingresoMenu).click();
	Helper.waitSeconds(5);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Menu Lateral", subDir, "Bono 01_APPC-01");
	Helper.waitSeconds(2);
	
	//Visualizar Menu Mi Contrato
	driver.findElement(ingresoMenuBonos).click();
	Helper.waitSeconds(5);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Menu Bonos", subDir, "Bono 02_APPC-02");
	Helper.waitSeconds(2);
	
	}

public void menuTeOrientamos (String subDir) {
	
	//Click para ingresara Menú Lateral de APP Consalud
	driver.findElement(ingresoMenu).click();
	Helper.waitSeconds(5);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Menu Lateral", subDir, "Orientar 01_APPC-01");
	Helper.waitSeconds(2);
	
	//Visualizar Menu Mi Contrato
	driver.findElement(ingresoMenuTeOrientamos).click();
	Helper.waitSeconds(5);
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOCONSALUD: Click para Ingresar a Menu Te Orientamos", subDir, "Orientar 02_APPC-02");
	Helper.waitSeconds(2);
	
	}

}