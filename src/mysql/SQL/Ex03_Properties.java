package mysql.SQL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Properties;

public class Ex03_Properties {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("/Workspace/mysql.properties");
			Properties props = new Properties();
			props.load(is);
			is.close();
			
			String host = props.getProperty("host");
			String user = props.getProperty("user");
			String password = props.getProperty("password");
			String database = props.getProperty("database");
			String port = props.getProperty("port", "3306");
			String connStr = "jdbc:mysql://"+ host + ": " +port+ "/"+database;
			System.out.println(connStr);
//			conn = DriverManager.getConnection(connStrr, user, password);
//			conn = DriverManager.getConnection(
//			        "jdbc:mysql://localhost:3306/world",
//			        "root", "paul1202!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}