package orderImplementations;

import java.util.Scanner;

public class ClassForCallin {
	public static void classforcall() {
		int choice, subcho;
		Scanner in = new Scanner(System.in);
		System.out.println("\n**MAIN CATEGORIES**\n");
		ShowAllCategory.print();
		// Taking input fro the main category
		choice = in.nextInt();
		switch (choice) {
	//---------------------------------------------LAPTOPS------------------------------------------------------------------------------------------------------
		case 1:
			System.out.println("Laptops.");
			ShowData.showdata("laptops");
			System.out.println(" Press 1 to see the price comparision in region other than India.");
			System.out.println(" Press 2 to see the Highest and lowest prices of Laptops.");
			System.out.println(" Press 3 to see the total Stock of Laptops.");
			System.out.println(" Press 4 to sort the products");
			// Taking Input for the sub options.
			subcho = in.nextInt();
			switch (subcho) {
			case 1:
				ShowData.Currency("laptops");
				break;
			case 2:// select Max(price) from tablename; and Min(price) from tablename;
				MaxAndMin.maxPrice("laptops");
				MaxAndMin.minPrice("laptops");
				break;
			case 3://select SUM(QUANTITY) from tablename;
				MaxAndMin.sum("laptops");
				MaxAndMin.maxQuant("laptops");
				MaxAndMin.minQuant("laptops");
				break;// case 3.
			case 4:
				System.out.println("Sort by Name press --> 1.\nSort by Price press -->2.");
				subcho = in.nextInt();
				switch (subcho) {
				case 1://select * from tablename ORDER BY name.
					Sorting.sortByName("laptops");
					break;
				case 2://select * from tablename ORDER BY price.
					Sorting.sortByPrice("laptops");
					break;
				default:
					System.out.println("Wrong Input!");
					break;// case 4 switch break.
				}
				break;// case 4 break
			default:
				System.out.println("Wrong Input!");
				break; // switch break of 1-2>
			}
			break;// case 1 break.
		
		//---------------------------------------------HEADPHONES------------------------------------------------------------------------------------------------------
		case 2:
			System.out.println("Headphones.");
			ShowData.showdata("Headphones");
			System.out.println(" Press 1 to see the price comparision in region other than India.");
			System.out.println(" Press 2 to see the Highest and lowest prices of Headphones.");
			System.out.println(" Press 3 to see the total Stock of Headphones.");
			System.out.println(" Press 4 to sort the products");
			// Taking Input for the sub options.
			subcho = in.nextInt();
			switch (subcho) {
			case 1:
				ShowData.Currency("Headphones");
				break;
			case 2:// select Max(price) from tablename; and Min(price) from tablename;
				MaxAndMin.maxPrice("Headphones");
				MaxAndMin.minPrice("Headphones");
				break;
			case 3://select SUM(QUANTITY) from tablename;
				MaxAndMin.sum("Headphones");
				MaxAndMin.maxQuant("Headphones");
				MaxAndMin.minQuant("Headphones");
				break;// case 3 break.
			case 4:
				System.out.println("Sort by Name press --> 1.\nSort by Price press -->2.");
				subcho = in.nextInt();
				switch (subcho) {
				case 1://select * from tablename ORDER BY name.
					Sorting.sortByName("Headphones");
					break;
				case 2://select * from tablename ORDER BY price..
					Sorting.sortByPrice("Headphones");
					break;
				default:
					System.out.println("Wrong Input!");
					break;// case 4 switch break.
				}
				break;// case 4 break.
			default:
				System.out.println("Wrong Input!");
				break;// switch break.
			}
			break;// case 2 break.
		
 //---------------------------------------------WATCHES------------------------------------------------------------------------------------------------------
		case 3:
			System.out.println("Watches.");
			ShowData.showdata("Watches");
			System.out.println(" Press 1 to see the price comparision in region other than India.");
			System.out.println(" Press 2 to see the Highest and lowest prices of Watches.");
			System.out.println(" Press 3 to see the total Stock of Watches.");
			System.out.println(" Press 4 to sort the products");
			// Taking Input for the sub options.
			subcho = in.nextInt();
			switch (subcho) {
			case 1:
				ShowData.Currency("Watches");
				break;
			case 2:// select Max(price) from tablename; and Min(price) from tablename;
				MaxAndMin.maxPrice("Watches");
				MaxAndMin.minPrice("Watches");
				break;
			case 3://select SUM(QUANTITY) from tablename;
				MaxAndMin.sum("Watches");
				MaxAndMin.maxQuant("Watches");
				MaxAndMin.minQuant("Watches");
				break;// case 3 break.
			case 4:
				System.out.println("Sort by Name press --> 1.\nSort by Price press -->2.");
				subcho = in.nextInt();
				switch (subcho) {
				case 1://select * from tablename ORDER BY name.
					Sorting.sortByName("Watches");
					break;
				case 2://select * from tablename ORDER BY price.
					Sorting.sortByPrice("Watches");
					break;
				default:
					System.out.println("Wrong Input!");
					break;
				}
				break;
			default:
				System.out.println("Wrong Input!");
				break;// switch break.
			}
			break;//
		case 4:// using insert into statement.
			RequiredCategories.addCategories();
			break;
		default:// main category default.
			System.out.println("Wrong Input!");

			break;// main category switch break
		}
	}
}
