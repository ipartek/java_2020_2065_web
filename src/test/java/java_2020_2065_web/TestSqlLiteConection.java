package java_2020_2065_web;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import com.ipartek.formacion.modelo.PerroDAOSqlite;
import com.ipartek.formacion.pojo.Perro;

public class TestSqlLiteConection {

	@Test
	public void test() throws SQLException {
		
	    String PATH = "ddbb/perrera.db";
		Connection conn = DriverManager.getConnection("jdbc:sqlite:" + PATH);
		assertNotNull(conn);
		
		
		ArrayList<Perro> perros = PerroDAOSqlite.getInstance().listar();
		assertNotNull(perros);
		
	}

}
