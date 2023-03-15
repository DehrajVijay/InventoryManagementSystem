package orderImplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import databaseconnectivity.ConnectionProvider;

/**
 * public class which consists of methods for maximum price,minimum price,
 * maximum quantity, minimum quantity and total articles.
 * 
 * @author Vijay Dehraj.
 *
 */
public class MaxAndMin {
	/**
	 * static method which finds the highest price of a product. Query used: select
	 * MAX(price) from table_name.
	 * 
	 * @param tableName
	 */
	public static void maxPrice(String tableName) {
		try {
			Connection con = ConnectionProvider.getConnection();
			// Statement stmt = con.createStatement()

			PreparedStatement ps = con.prepareStatement("select MAX(price) from  " + tableName);
			// ResultSet has the power to store junk of data in tabular structure.
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

	/**
	 * static method which finds the lowest price of a product. Query used: select
	 * MIN(price) from table_name.
	 * 
	 * @param tableName
	 */
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

	/**
	 * static method which finds the maximum quantity of a product. Query used:
	 * select MAX(quanity) from table_name.
	 * 
	 * @param tableName
	 */
	public static void maxQuant(String tableName) {
		try {
			Connection con = ConnectionProvider.getConnection();
			// Statement stmt = con.createStatement()

			PreparedStatement ps = con.prepareStatement("select MAX(quantity) from  " + tableName);

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

	/**
	 * static method which finds the minimum quantity of a product. Query used:
	 * select MIN(quanity) from table_name.
	 * 
	 * @param tableName
	 */
	public static void minQuant(String tableName) {
		try {
			Connection con = ConnectionProvider.getConnection();
			// Statement stmt = con.createStatement()

			PreparedStatement ps = con.prepareStatement("select MIN(quantity) from  " + tableName);

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

	/**
	 * static method which finds the total quantity of a product. Query used: select
	 * SUM(quanity) from table_name.
	 * 
	 * @param tableName
	 */
	public static void sum(String tableName) {
		try {
			Connection con = ConnectionProvider.getConnection();
			// Statement stmt = con.createStatement()

			PreparedStatement ps = con.prepareStatement("select SUM(quantity) from  " + tableName);

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
