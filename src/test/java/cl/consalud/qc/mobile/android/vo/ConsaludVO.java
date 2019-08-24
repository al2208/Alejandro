package cl.consalud.qc.mobile.android.vo;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import cl.consalud.qc.mobile.android.helpers.Helper;
// Usuario y Pass para ingresar a App Consalud
public class ConsaludVO {
	private String user;
	private String pass;
	
	
public ConsaludVO(String rutaExcel, String hoja) {

		XSSFSheet sheet = Helper.obtenerPaginaExcel(rutaExcel, hoja);

		this.user = Helper.obtenerCelda(sheet, 1, "B").getStringCellValue();
		this.pass = Helper.obtenerCelda(sheet, 2, "B").getStringCellValue();
		
	}

public String getUser() {
	return user;
	}

public String getPass() {
	return pass;
	}
@Override
public String toString() {
	return "pruebaVO [user=" + user + ", pass=" + pass + "]";
}
}
