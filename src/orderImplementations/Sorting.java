package orderImplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import databaseconnectivity.ConnectionProvider;

public class Sorting {
	//method to sort the products by name
		public static void sortByName(String name) {
			try {
				Connection con = ConnectionProvider.getConnection();
				// Statement stmt = con.createStatement()

				PreparedStatement ps = con.prepareStatement("select * from " + name + " order by name" );
				//ps.setString(1, item);;

				ResultSet rs = ps.executeQuery();
				
				while (rs.next()) {
					System.out.printf("\t%-14s\t\t%-10s\t\t\t%n", rs.getString(2), rs.getInt(3)+" ₹-/");

				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		//method to sort the products by price
			public static void sortByPrice(String name) {
				try {
					Connection con = ConnectionProvider.getConnection();
					// Statement stmt = con.createStatement()

					PreparedStatement ps = con.prepareStatement("select * from " + name + " order by price" );
					//ps.setString(1, item);;

					ResultSet rs = ps.executeQuery();
					
					while (rs.next()) {
						System.out.printf("\t%-14s\t\t%-10s\t\t\t%n", rs.getString(2), rs.getInt(3)+" ₹-/");

					}
				} catch (Exception e) {
					System.out.println(e);
				}
		}
}
