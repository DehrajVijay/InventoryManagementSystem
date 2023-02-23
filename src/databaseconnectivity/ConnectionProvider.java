package databaseconnectivity;

import java.io.FileInputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionProvider {
	public static Connection con = null;

	public static Connection getConnection() {
		if (con == null) {
			Properties p = new Properties();
			FileInputStream fis = null;
			try {
				fis = new FileInputStream(
						"C:\\Users\\Vijay\\eclipse-workspace\\InventoryManagementSystem\\src\\databaseconnectivity\\DatabaseDetails.properties");
				p.load(fis);
				String driver = p.getProperty("driver");
				String url = p.getProperty("url");
				String username = p.getProperty("username");
				String password = p.getProperty("password");

				Class.forName(driver);

				// Drivermanager Class has an internal getConnection method.
				Connection con = DriverManager.getConnection(url, username, password);
				// System.out.println("Connection Established Successfully");
				return con;

			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return con;
	}
}
