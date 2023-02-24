package orderImplementations;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import databaseconnectivity.ConnectionProvider;

public class ShowData {
	public static void showdata(String tableName) {
		try {
			Connection con = ConnectionProvider.getConnection();
			

			PreparedStatement ps = con.prepareStatement("select * from " + tableName);

			ResultSet rs = ps.executeQuery();
			System.out.printf("-----------------------------------------------------------------------------------------------%n");
			System.out.printf("Product ID\t\t|\tProdcut Name\t\t|\tPrice In Rs.\t|\n");
			System.out.printf("-------------------------------------------------------------------------------------------------%n");
			while (rs.next()) {
				
				  System.out.printf("\t%-14s\t\t%-14s\t\t\t%-14s\t\t\t\t%n", rs.getInt(1),
				  rs.getString(2), rs.getInt(3) + " ₹-/");
				 
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
// method for the currency conversion for region other than INDIA.
	public static void Currency(String tableName) {
		try {
			Connection con = ConnectionProvider.getConnection();
			// Statement stmt = con.createStatement()

			PreparedStatement ps = con.prepareStatement("select * from " + tableName);

			ResultSet rs = ps.executeQuery();
			System.out.printf(
					"-----------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
			System.out
					.printf("Procuts Name\t|\tPrice In Rs.\t|\t US(Dollar)\t|\tFRANCE(Euro)\t|\tUK(Pound)|\n");
			System.out.printf(
					"-----------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
			while (rs.next()) {
				// converting the currency according to countries US,FRANCE,UK etc.
				System.out.printf("\t%-14s\t\t%-10s\t\t\t%-10s\t\t\t%-11s\t\t\t\t%-6s\t\t\t\t\t%n", rs.getString(2),
						rs.getInt(3) + " ₹", "$ " + (rs.getInt(3) / 82), "€ " + rs.getInt(3) / 80,
						"£ " + rs.getInt(3) / 99);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
