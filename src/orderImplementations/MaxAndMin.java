package orderImplementations;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import databaseconnectivity.ConnectionProvider;

public class MaxAndMin {
	public static void maxPrice(String tableName) {
		try {
			Connection con = ConnectionProvider.getConnection();
			// Statement stmt = con.createStatement()

			PreparedStatement ps = con.prepareStatement("select Max(price) from  " + tableName);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.printf("-----------------------------------------------------------%n");
				System.out.println("This highest price is : " + rs.getInt(1) + " ₹");
				System.out.printf("------------------------------------------------------------%n");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void minPrice(String tableName) {
		try {
			Connection con = ConnectionProvider.getConnection();
			// Statement stmt = con.createStatement()

			PreparedStatement ps = con.prepareStatement("select MIN(Price) from  " + tableName);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.printf("-----------------------------------------------------------%n");
				System.out.println("This lowest  price  is : " + rs.getInt(1) + " ₹");
				System.out.printf("------------------------------------------------------------%n");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void maxQuant(String tableName) {
		try {
			Connection con = ConnectionProvider.getConnection();
			// Statement stmt = con.createStatement()

			PreparedStatement ps = con.prepareStatement("select max(quantity) from  " + tableName);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.printf("-------------------------------------------------------------------------%n");
				System.out.println(" Maximum stock of product is : " + rs.getInt(1));
				System.out.printf("--------------------------------------------------------------------------%n");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void minQuant(String tableName) {
		try {
			Connection con = ConnectionProvider.getConnection();
			// Statement stmt = con.createStatement()

			PreparedStatement ps = con.prepareStatement("select min(quantity) from  " + tableName);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.printf("-------------------------------------------------------------------------%n");
				System.out.println(" Min stock of product is : " + rs.getInt(1));
				System.out.printf("--------------------------------------------------------------------------%n");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void sum(String tableName) {
		try {
			Connection con = ConnectionProvider.getConnection();
			// Statement stmt = con.createStatement()

			PreparedStatement ps = con.prepareStatement("select sum(quantity) from  " + tableName);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.printf("-------------------------------------------------------------------------%n");
				System.out.println(" Total number of  " + tableName + " is " + rs.getInt(1));
				System.out.printf("--------------------------------------------------------------------------%n");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
