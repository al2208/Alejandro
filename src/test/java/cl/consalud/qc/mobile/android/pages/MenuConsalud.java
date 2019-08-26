package cl.consalud.qc.mobile.android.pages;

import org.openqa.selenium.By;
import com.relevantcodes.extentreports.ExtentTest;
import cl.consalud.qc.mobile.android.helpers.MobilePage;
import cl.consalud.qc.mobile.android.helpers.Helper;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MenuConsalud extends MobilePage {

	
	private By ingresoMenu;
	

public MenuConsalud (AndroidDriver<AndroidElement> driver, ExtentTest test, Boolean TAKE_SS, int seconds) {
	super(driver, test, TAKE_SS, seconds);
	
	this.ingresoMenu = By.xpath("//*[@text='menu']");
}

public void homeMenu (String subDir) {
	
	driver.findElement(ingresoMenu).click();
	Helper.addEvidence(TAKE_SS, driver, test, "AUTOTRELLO: Ingresar Descripcion", subDir, "Paso 31_AUTT-031");
	Helper.waitSeconds(2);
}

}