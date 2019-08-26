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
	

public MenuConsalud (AndroidDriver<AndroidElement> driver, ExtentTest test, Boolean TAKE_SS, int seconds) {
	super(driver, test, TAKE_SS, seconds);
	
	this.ingresoMenu = By.xpath("//*[@text='menu']");
	this.volverHome = By.xpath("//*[@text='arrow back']");
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

}