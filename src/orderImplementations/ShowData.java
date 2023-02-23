package orderImplementations;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import databaseconnectivity.ConnectionProvider;

public class ShowData {
	public static void showdata(String tableName) {
		try {
			Connection con = ConnectionProvider.getConnection();
			// Statement stmt = con.createStatement()

			PreparedStatement ps = con.prepareStatement("select * from " + tableName);

			ResultSet rs = ps.executeQuery();
			System.out.printf(
					"---------------------------------------------------------------%n");
			System.out.printf("Procuts Name\t\t|\tPrice In Rs.\t|\n");
			System.out.printf(
					"--------------------------------------------------------------%n");
			while (rs.next()) {
				System.out.printf("\t%-14s\t\t%-10s\t\t\t%n", rs.getString(1), rs.getInt(2)+" ₹-/");

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void Currency(String tableName) {
		try {
			Connection con = ConnectionProvider.getConnection();
			// Statement stmt = con.createStatement()

			PreparedStatement ps = con.prepareStatement("select * from " + tableName);

			ResultSet rs = ps.executeQuery();
			System.out.printf(
					"-----------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
			System.out
					.printf("Procuts Name\t\t|\tPrice In Rs.\t\t|\t US(Dollar)\t\t|\tFRANCE(Euro)\t\t|\tUK(Pound)|\n");
			System.out.printf(
					"-----------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
			while (rs.next()) {
				System.out.printf("\t%-14s\t\t%-10s\t\t\t%-12s\t\t\t%-14s\t\t\t\t%-14s\t\t\t\t\t%n", rs.getString(1),
						rs.getInt(2) + " ₹", "$ " + (rs.getInt(2) / 82), "€ " + rs.getInt(2) / 80,
						"£ " + rs.getInt(2) / 99);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
