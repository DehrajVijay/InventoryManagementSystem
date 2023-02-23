package orderImplementations;

public class ShowAllCategory {

	public enum showCategory {
		LAPTOPS, HEADPHONES, WATCHES

	}

	public static void print() {

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		for (showCategory cat : showCategory.values()) {
			System.out.print(cat + "\t\t|\t\t");
		}
		System.out.println(
				"\n--------------------------------------------------------------------------------------------------------------");
		System.out.println("\n");
		System.out.println("Press 1 for Laptops");
		System.out.println("Press 2 for Headphones");
		System.out.println("Press 3 Watches");
		System.out.println("Press 4 If the Category/Product is not listed.");
	
	}
}
