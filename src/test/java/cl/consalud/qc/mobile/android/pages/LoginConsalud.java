package cl.consalud.qc.mobile.android.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.relevantcodes.extentreports.ExtentTest;
import cl.consalud.qc.mobile.android.helpers.MobilePage;
import cl.consalud.qc.mobile.android.helpers.Helper;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class LoginConsalud extends MobilePage {
	
	private By usuario;
	private By password;
	private By ingresoConsalud;
	private By siguienteUno;
	private By siguienteDos;
	private By siguienteTres;
	private By siguienteCuatro;
	private By siguienteCinco;
	private By finalizar;
	
	
	
public LoginConsalud(AndroidDriver<AndroidElement> driver, ExtentTest test, Boolean TAKE_SS, int seconds) {
	super(driver, test, TAKE_SS, seconds);
	
	this.usuario = By.xpath("//*[@class='android.widget.EditText' and ./parent::*[@id='loginField']]");
	this.password = By.xpath("//*[@class='android.widget.EditText' and ./parent::*[@id='passwordField']]");
	this.ingresoConsalud = By.xpath("//*[@text='Ingresar']");
	this.siguienteUno = By.xpath("//*[@text='Siguiente']");
	this.siguienteDos = By.xpath("//*[@text='Siguiente']");
	this.siguienteTres = By.xpath("//*[@text='Siguiente']");
	this.siguienteCuatro = By.xpath("//*[@text='Siguiente']");
	this.siguienteCinco = By.xpath("//*[@text='Siguiente']");
	this.finalizar = By.xpath("//*[@text='Finalizar']");
	
	}
	
public void ingresar (String user, String pass, String subDir) {
	
	 Helper.waitSeconds(10);
	 
	 
	 driver.findElement(usuario).sendKeys(user);
	 Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	 Helper.waitSeconds(5);
	 
	 driver.findElement(password).sendKeys(pass);
	 Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	 Helper.waitSeconds(5);
	 
	 driver.findElement(ingresoConsalud).click();
	 Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	 Helper.waitSeconds(15);
	 
	 driver.findElement(siguienteUno).click();
	 Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	 Helper.waitSeconds(5);
	 
	 driver.findElement(siguienteDos).click();
	 Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	 Helper.waitSeconds(5);
	 
	 driver.findElement(siguienteTres).click();
	 Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	 Helper.waitSeconds(5);
	 
	 driver.findElement(siguienteCuatro).click();
	 Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	 Helper.waitSeconds(5);
	 
	 driver.findElement(siguienteCinco).click();
	 Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	 Helper.waitSeconds(5);
	 
	 driver.findElement(finalizar).click();
	 Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	 Helper.waitSeconds(5);
	}

//	//Validacion de Prueba Correcta de Inicio de Sesion
//public void assertLoginCorrecto() {
//		Assert.assertTrue(driver.findElement(omitir).getText().equalsIgnoreCase("Isapre Consalud"));
//	}
}
