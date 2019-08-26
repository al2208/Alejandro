package cl.consalud.qc.mobile.android.pages;

import org.openqa.selenium.By;
import com.relevantcodes.extentreports.ExtentTest;
import cl.consalud.qc.mobile.android.helpers.MobilePage;
import cl.consalud.qc.mobile.android.helpers.Helper;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Home extends MobilePage {

	private By excedentes;
	private By abrirPdf;
	private By volverHome;
	private By notificaciones;
	private By volverNotificaciones;
	private By bolsaCompra;
	private By volverBolsaCompra;
	private By misSolicitudes;
	private By misSolicitudesFinalizadas;
	private By reembolso;
	private By volverDeReembolso;
	private By certificados;
	private By volverDeCertificados;
	private By bonos;
	private By volverDeBonos;
	private By teOrientamos;
	private By volverHomeDos;
	
	
public Home (AndroidDriver<AndroidElement> driver, ExtentTest test, Boolean TAKE_SS, int seconds) {
	super(driver, test, TAKE_SS, seconds);
	
	this.excedentes = By.xpath("//*[@text='excedentes Ver planilla']");
	this.abrirPdf = By.xpath("//*[@id='icon' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Lector de PDF de Drive']]]");
	this.volverHome = By.xpath("//*[@contentDescription='Navegar hacia arriba']");
	this.notificaciones = By.xpath("//*[@text='alarm']");
	this.volverNotificaciones = By.xpath("//*[@text='arrow back']");
	this.bolsaCompra = By.xpath("//*[@text='bag']");
	this.volverBolsaCompra = By.xpath("//*[@text='arrow back']");
	this.misSolicitudes = By.xpath("//*[@text='Mis solicitudes']");
	this.misSolicitudesFinalizadas = By.xpath("//*[@text='Mis solicitudes finalizadas']");
	this.reembolso = By.xpath("//*[@text='Reembolso']");
	this.volverDeReembolso = By.xpath("//*[@text='arrow back']");
	this.certificados = By.xpath("//*[@text='Certificados']");
	this.volverDeCertificados = By.xpath("//*[@text='arrow back']");
	this.bonos = By.xpath("//*[@text='Bonos']");
	this.volverDeBonos = By.xpath("//*[@text='arrow back']");
	this.teOrientamos = By.xpath("//*[@text='Te orientamos']");
	this.volverHomeDos = By.xpath("//*[@text='arrow back']");
	
	
	}

public void homeExcedentes (String subDir) {
	
	
	//Ingresar a sección de Excedentes
	driver.findElement(excedentes).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Sección Excedentes", subDir, "Exced 1_APPC-01");
	Helper.waitSeconds(2);
	
	//Selleccionar forma de abrir documento y Visualizar 
	driver.findElement(abrirPdf).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Seleccionar y visualizar PDF", subDir, "Exced 2_APPC-02");
	Helper.waitSeconds(2);
	
	//Volver a Home de APP Consalud
	driver.findElement(volverHome).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Volver a Home APP", subDir, "Exced 3_APPC-03");
	Helper.waitSeconds(2);
	
	}

public void homeNotificaciones (String subDir) {
	
	driver.findElement(notificaciones).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	Helper.waitSeconds(2);
	
	driver.findElement(volverNotificaciones).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	Helper.waitSeconds(2);
	
	
	}

public void homeBolsaCompra (String subDir) {
	
	driver.findElement(bolsaCompra).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	Helper.waitSeconds(2);
	
	driver.findElement(volverBolsaCompra).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	Helper.waitSeconds(2);
	
	}

public void homeSolicitudes (String subDir) {
	
	driver.findElement(misSolicitudes).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	Helper.waitSeconds(2);
	
	}

public void homeSolFinalizadas (String subDir) {
	
	driver.findElement(misSolicitudesFinalizadas).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	Helper.waitSeconds(2);
	
	}

public void homeReembolso (String subDir) {
	
	driver.findElement(reembolso).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	Helper.waitSeconds(2);
	
	driver.findElement(volverDeReembolso).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	Helper.waitSeconds(2);
	
	}

public void homeCertificados (String subDir) {
	
	driver.findElement(certificados).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	Helper.waitSeconds(2);
	
	driver.findElement(volverDeCertificados).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	Helper.waitSeconds(2);
	
	}

public void homeBonos (String subDir) {
	
	driver.findElement(bonos).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	Helper.waitSeconds(2);
	
	driver.findElement(volverDeBonos).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	Helper.waitSeconds(2);
	
	}

public void homeTeOrientamos (String subDir) {
	
	driver.findElement(teOrientamos).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	Helper.waitSeconds(2);
	
	driver.findElement(volverHomeDos).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	Helper.waitSeconds(2);
	
	}


}
