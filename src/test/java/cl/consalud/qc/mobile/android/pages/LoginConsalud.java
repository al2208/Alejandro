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
	 
	 //Ingreso de usuario a APP Consalud
	 driver.findElement(usuario).sendKeys(user);
	 Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingreso APP", subDir, "Paso 1_APPC-01");
	 Helper.waitSeconds(5);
	 
	 //Ingreso de Password a APP Consalud
	 driver.findElement(password).sendKeys(pass);
	 Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingreso Usuario", subDir, "Paso 2_APPC-02");
	 Helper.waitSeconds(5);
	 
	 //Primera Pantalla de Bienvenida
	 driver.findElement(ingresoConsalud).click();
	 Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Password", subDir, "Paso 3_APPC-03");
	 Helper.waitSeconds(15);
	 
	//Segunda Pantalla de Bienvenida
	 driver.findElement(siguienteUno).click();
	 Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingreso Correcto a APP Consalud", subDir, "Paso 4_APPC-04");
	 Helper.waitSeconds(5);
	 
	//Tercera Pantalla de Bienvenida
	 driver.findElement(siguienteDos).click();
	 Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingreso Pantalla Bienvenida_1", subDir, "Paso 5_APPC-05");
	 Helper.waitSeconds(5);
	 
	//Cuarta Pantalla de Bienvenida
	 driver.findElement(siguienteTres).click();
	 Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingreso Pantalla Bienvenida_2", subDir, "Paso 6_APPC-06");
	 Helper.waitSeconds(5);
	 
	//Quinta Pantalla de Bienvenida
	 driver.findElement(siguienteCuatro).click();
	 Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingreso Pantalla Bienvenida_3", subDir, "Paso 7_APPC-07");
	 Helper.waitSeconds(5);
	 
	 
	//Sexta Pantalla de Bienvenida
	 driver.findElement(siguienteCinco).click();
	 Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingreso Pantalla Bienvenida_4", subDir, "Paso 8_APPC-08");
	 Helper.waitSeconds(5);
	 
	 //Ingreso A Home de APP Consalud
	 driver.findElement(finalizar).click();
	 Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingreso Pantalla Final", subDir, "Paso 9_APPC-09");
	 Helper.waitSeconds(5);
	}

//	//Validacion de Prueba Correcta de Inicio de Sesion
//public void assertLoginCorrecto() {
//		Assert.assertTrue(driver.findElement(omitir).getText().equalsIgnoreCase("Isapre Consalud"));
//	}
}
