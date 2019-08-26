package cl.consalud.qc.mobile.android.tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cl.consalud.qc.mobile.android.pages.Home;
import cl.consalud.qc.mobile.android.pages.LoginConsalud;
import cl.consalud.qc.mobile.android.pages.MenuConsalud;
import cl.consalud.qc.mobile.android.vo.ConsaludVO;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;



public class ConsaludTest {
	private AndroidDriver<AndroidElement> driver;
	private ExtentReports extent;
	private ExtentTest test;
	private String SUBDIR;
	private static Boolean TAKE_SS = true;
	private static int WAIT = 10;

@Parameters({ "suite" })
@BeforeSuite
public void configExtentReports(String suite) {
		// ExtentReports config
	this.SUBDIR = suite + "\\";
	this.extent = new ExtentReports("ExtentReports/" + suite + ".html", true);
	this.extent.addSystemInfo("Host Name", "Isapre Consalud");
	this.extent.addSystemInfo("Enviroment", "Automation Testing");
	this.extent.addSystemInfo("User Name", "Alejandro Ascencio");

	File conf = new File("src/test/resources/extentReports/extent-config.xml");
	this.extent.loadConfig(conf);

	}

@Parameters({ "device", "application", "app_package", "app_activity", "url_server" })
@BeforeMethod
public void configSelenium(String device, String application, String app_package, String app_activity,
	String url_server) throws MalformedURLException {

		// Configuracion del dispositivo.
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);

		// Configuracion de la app.
		// para una apk o una app ya instalada.
	if (!application.equals("none")) {
		File app = new File("src/test/resources/apks/" + application);
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	} else {
		cap.setCapability("appPackage", app_package);
		cap.setCapability("appActivity", app_activity);
			// Esta capability permite no resetear la configuracion que ya tengamos de la
			// app.
		cap.setCapability("noReset", "true");
	}

		// Creamos el driver del servidor appium.
	driver = new AndroidDriver<>(new URL(url_server), cap);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	 
@Test
@Parameters ({"ruta_excel", "hoja"})
public void loginConsalud(String ruta_excel, String hoja) {
	String subDir = SUBDIR + Thread.currentThread().getStackTrace()[1].getMethodName();

		// Configuracion de reporte.
	test = extent.startTest("Reporte Ingreso APP Consalud", "Login APP CONSALUD");
	test.log(LogStatus.INFO, "Inicio Login en Consalud.-");

	System.out.println("Prueba de Ingreso Correcto a Consalud");
	ConsaludVO param = new ConsaludVO (ruta_excel, hoja);
	LoginConsalud login = new LoginConsalud (driver, test, TAKE_SS, WAIT);
	login.ingresar(param.getUser(), param.getPass(),  subDir);
	//login.assertLoginCorrecto();	
	}
@Test
public void homeExcedentes () {
	String subDir = SUBDIR + Thread.currentThread().getStackTrace()[1].getMethodName();
	
	// Configuracion de reporte.
	test = extent.startTest("Reporte Excedentes", "Prueba 01");
	test.log(LogStatus.INFO, "Ingreso Home-Excedentes.-");
	
	System.out.println("Prueba de Ingreso Correcto a Home-Excdentes");
	Home excedent = new Home (driver, test, TAKE_SS, WAIT);
	excedent.homeExcedentes(subDir);
	}

@Test
public void homeNotificaciones () {
	String subDir = SUBDIR + Thread.currentThread().getStackTrace()[1].getMethodName();
	
	// Configuracion de reporte.
	test = extent.startTest("Reporte Notoficaciones", "Prueba 01");
	test.log(LogStatus.INFO, "Ingreso Home-Notificaciones.-");
	
	System.out.println("Prueba de Ingreso Correcto a Home-Notificaciones");
	Home notas = new Home (driver, test, TAKE_SS, WAIT);
	notas.homeNotificaciones(subDir);
	}
	
@Test
public void homeBolsaCompra () {
	String subDir = SUBDIR + Thread.currentThread().getStackTrace()[1].getMethodName();
		
	// Configuracion de reporte.
	test = extent.startTest("Reporte Bolsa Compra", "Prueba 01");
	test.log(LogStatus.INFO, "Ingreso Home-BolsaCompra.-");
		
	System.out.println("Prueba de Ingreso Correcto a Home-BolsaCompra");
	Home compra = new Home (driver, test, TAKE_SS, WAIT);
	compra.homeBolsaCompra(subDir);	
	
	}

@Test
public void homeSolicitudes () {
	String subDir = SUBDIR + Thread.currentThread().getStackTrace()[1].getMethodName();
		
	// Configuracion de reporte.
	test = extent.startTest("Reporte Solicitudes", "Prueba 01");
	test.log(LogStatus.INFO, "Ingreso Home-Solicitudes.-");
		
	System.out.println("Prueba de Ingreso Correcto a Home-Solicitudes");
	Home solicitud = new Home (driver, test, TAKE_SS, WAIT);
	solicitud.homeSolicitudes(subDir);	
	
	}

@Test
public void homeSolFinalizadas () {
	String subDir = SUBDIR + Thread.currentThread().getStackTrace()[1].getMethodName();
		
	// Configuracion de reporte.
	test = extent.startTest("Reporte Solicitudes Finalizadas", "Prueba 01");
	test.log(LogStatus.INFO, "Ingreso Home-Solicitudes Finalizadas.-");
		
	System.out.println("Prueba de Ingreso Correcto a Home-Solicitudes Finalizadas");
	Home solfinal = new Home (driver, test, TAKE_SS, WAIT);
	solfinal.homeSolFinalizadas(subDir);	
	
	}

@Test
public void homeReembolso () {
	String subDir = SUBDIR + Thread.currentThread().getStackTrace()[1].getMethodName();
		
	// Configuracion de reporte.
	test = extent.startTest("Reporte Reembolso", "Prueba 01");
	test.log(LogStatus.INFO, "Ingreso Home-Reembolso.-");
		
	System.out.println("Prueba de Ingreso Correcto a Home-Reembolso");
	Home reem = new Home (driver, test, TAKE_SS, WAIT);
	reem.homeReembolso(subDir);	
	
	}

@Test
public void homeCertificados () {
	String subDir = SUBDIR + Thread.currentThread().getStackTrace()[1].getMethodName();
		
	// Configuracion de reporte.
	test = extent.startTest("Reporte Certificados", "Prueba 01");
	test.log(LogStatus.INFO, "Ingreso Home-Certificados.-");
		
	System.out.println("Prueba de Ingreso Correcto a Home-Certificados");
	Home doc = new Home (driver, test, TAKE_SS, WAIT);
	doc.homeCertificados(subDir);	
	
	}

@Test
public void homeBonos () {
	String subDir = SUBDIR + Thread.currentThread().getStackTrace()[1].getMethodName();
		
	// Configuracion de reporte.
	test = extent.startTest("Reporte Bonos", "Prueba 01");
	test.log(LogStatus.INFO, "Ingreso Home-Bonos.-");
		
	System.out.println("Prueba de Ingreso Correcto a Home-Bonos");
	Home bono = new Home (driver, test, TAKE_SS, WAIT);
	bono.homeBonos(subDir);	
	
	}

@Test
public void homeTeOrientamos () {
	String subDir = SUBDIR + Thread.currentThread().getStackTrace()[1].getMethodName();
		
	// Configuracion de reporte.
	test = extent.startTest("Reporte Te Orientamos", "Prueba 01");
	test.log(LogStatus.INFO, "Ingreso Home-Te Orientamos.-");
		
	System.out.println("Prueba de Ingreso Correcto a Home-Te Orientamos");
	Home orientar = new Home (driver, test, TAKE_SS, WAIT);
	orientar.homeTeOrientamos(subDir);	
	
	}

@Test
public void homeMenu () {
	String subDir = SUBDIR + Thread.currentThread().getStackTrace()[1].getMethodName();
	
	// Configuracion de reporte.
	test = extent.startTest("Reporte Ingreso Menu Lateral");
	test.log(LogStatus.INFO, "Ingreso Home-Menu Lateral.-");
	
	System.out.println("Prueba de Ingreso correcto a Menú Lateral de App Consalud");
	MenuConsalud menu = new MenuConsalud (driver, test, TAKE_SS, WAIT);
	menu.homeMenu(subDir);	
	
	}

@AfterMethod
public void afterMethod(ITestResult result) {
	if (result.getStatus() == ITestResult.FAILURE) {
		test.log(LogStatus.FAIL, "Test failed.- <br>" + result.getThrowable());
	} else if (result.getStatus() == ITestResult.SKIP) {
		test.log(LogStatus.SKIP, "Test skipped.- <br>" + result.getThrowable());
	} else {
		test.log(LogStatus.PASS, "Test passed.-");
	}
	//driver.closeApp();
	extent.endTest(test);
	}

@AfterSuite
public void closeExtentReports() {
	extent.flush();
	}
}


	 