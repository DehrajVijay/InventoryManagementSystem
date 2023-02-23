package orderImplementations;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;

import databaseconnectivity.ConnectionProvider;

public class SearchData {
	public static void searchdata(String tableName, String item) {
		try {
			Connection con = ConnectionProvider.getConnection();
			// Statement stmt = con.createStatement()

			PreparedStatement ps = con.prepareStatement("select * from " + tableName + " where name = ?");
			ps.setString(1, item);

			ResultSet rs = ps.executeQuery();
			System.out.println("\n--------------------------------------------------------");
			System.out.println("Procuts Name\t\t|\t\tStock");
			System.out.println("----------------------------------------------------------");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t\t\t\t\t\t" + rs.getInt(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}