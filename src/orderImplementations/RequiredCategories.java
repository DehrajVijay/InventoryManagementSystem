package orderImplementations;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import databaseconnectivity.ConnectionProvider;

/**
 * pubic class to store the product details in the database.
 * 
 * @author Vijay Dehraj.
 *
 */
public class RequiredCategories {
	/**
	 * static method to insert the values in the oracle database.Query used: insert
	 * into table_name(NAME,QUANTITY),VALUES(from user).
	 * 
	 */
	public static void addCategories() {

		try {
			String category = null;
			int qty = 0;

			Scanner sc = new Scanner(System.in);

			System.out.println("Please enter Category/Product name.");
			category = sc.nextLine();
			System.out.println("Please enter quantity.");
			qty = sc.nextInt();

			System.out.println("Product and Quantity are added successfully!\n Thanks!! ");
			Connection con = ConnectionProvider.getConnection();
			

			PreparedStatement ps = con.prepareStatement(
					"insert into REQUIREMENTS " + "(NAME,QUANTITY)" + "VALUES ( ? " + "," + qty + ")");
			ps.setString(1, category);
			ResultSet rs = ps.executeQuery();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
