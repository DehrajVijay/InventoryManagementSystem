package orderImplementations;

import java.util.Scanner;

public class ClassForCallin {
	public static void classforcall() {

		int choice, subcho;
		Scanner in = new Scanner(System.in);
		String restart = "Y";
		while (restart.equalsIgnoreCase("Y")) {
			System.out.println("**MAIN CATEGORIES**\n");
			ShowAllCategory.print();
			// Taking input fro the main category
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Laptops.");
				ShowData.showdata("laptops");
				System.out.println(" Press 1 to see the price comparision in region other than India.");
				System.out.println(" Press 2 to see the Highest and lowest prices of Laptops.");
				System.out.println(" Press 3 to see the total Stock of Laptops.");

// Taking Input for the sub options.
				subcho = in.nextInt();
				switch (subcho) {
				case 1:
					ShowData.Currency("Laptops");
					System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
					restart = in.next();
					if (restart.equalsIgnoreCase("Y")) {
						System.out.println("Plese Enter your choice");
					} else {
						System.out.println("Thanks! Good Day.");
					}
					break;
				case 2:
					MaxAndMin.maxPrice("Laptops");
					MaxAndMin.minPrice("Laptops");
					System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
					restart = in.next();
					if (restart.equalsIgnoreCase("Y")) {
						System.out.println("Plese Enter your choice");
					} else {
						System.out.println("Thanks! Good Day.");
					}
					break;
				case 3:
					MaxAndMin.sum("Laptops");
					System.out.println(
							"\nPress 1 to check stock of Lenovo.\nPress 2 to check stock of Dell.\nPress 3 to check stock of HP.\nPress 4 to check stock of Apple.\nPress 5 to check stock of Acer.\nPress 6 to see the Max and Min in stock.");
					subcho = in.nextInt();
					switch (subcho) {
					case 1:
						SearchData.searchdata("laptops", "Lenovo");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}

						break;

					case 2:
						SearchData.searchdata("laptops", "Dell");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}
						break;

					case 3:
						SearchData.searchdata("laptops", "HP");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}
						break;
					case 4:
						SearchData.searchdata("laptops", "Apple");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}
						break;
					case 5:
						SearchData.searchdata("laptops", "Acer");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}
						break;
					case 6:
						MaxAndMin.maxQuant("Laptops");
						MaxAndMin.minQuant("Laptops");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}
						break;
					default:
						System.out.println("Wrong Input!");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}

						break;// switch break of stock choices.
					}
					break;// case 3.
				default:
					System.out.println("Wrong Input!");
					System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
					restart = in.next();
					if (restart.equalsIgnoreCase("Y")) {
						System.out.println("Plese Enter your choice");
					} else {
						System.out.println("Thanks! Good Day.");
					}
					break; // switch break of 1-2>
				}
				break;// case 1 break.
			case 2:
				System.out.println("Headphones.");
				ShowData.showdata("Headphones");
				System.out.println(" Press 1 to see the price comparision in region other than India.");
				System.out.println(" Press 2 to see the Highest and lowest prices of Headphones.");
				System.out.println(" Press 3 to see the total Stock of Headphones.");

// Taking Input for the sub options.
				subcho = in.nextInt();
				switch (subcho) {
				case 1:
					ShowData.Currency("Headphones");
					System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
					restart = in.next();
					if (restart.equalsIgnoreCase("Y")) {
						System.out.println("Plese Enter your choice");
					} else {
						System.out.println("Thanks! Good Day.");
					}
					break;
				case 2:
					MaxAndMin.maxPrice("Headphones");
					MaxAndMin.minPrice("Headphones");
					System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
					restart = in.next();
					if (restart.equalsIgnoreCase("Y")) {
						System.out.println("Plese Enter your choice");
					} else {
						System.out.println("Thanks! Good Day.");
					}
					break;
				case 3:
					MaxAndMin.sum("Headphones");
					System.out.println(
							"\nPress 1 to check stock of Boat.\nPress 2 to check stock of OnePlus.\nPress 3 to check stock of Apple.\nPress 4 to check stock of Jbl.\nPress 5 to check stock of Noise.\nPress 6 to see the Max and Min in stock.");
					subcho = in.nextInt();
					switch (subcho) {
					case 1:
						SearchData.searchdata("Headphones", "Boat");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}
						break;

					case 2:
						SearchData.searchdata("Headphones", "OnePlus");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}
						break;

					case 3:
						SearchData.searchdata("Headphones", "Apple");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}
						break;
					case 4:
						SearchData.searchdata("Headphones", "Jbl");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}
						break;
					case 5:
						SearchData.searchdata("Headphones", "Noise");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}
						break;
					case 6:
						MaxAndMin.maxQuant("Headphones");
						MaxAndMin.minQuant("Headphones");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}
						break;
					default:

						System.out.println("Wrong Input!");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}
						break;
					}
					break;// case 3 break.
				default:
					System.out.println("Wrong Input!");
					System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
					restart = in.next();
					if (restart.equalsIgnoreCase("Y")) {
						System.out.println("Plese Enter your choice");
					} else {
						System.out.println("Thanks! Good Day.");
					}
					break;// switch break.
				}

				break;// case 2 break.
			case 3:
				System.out.println("Watches.");
				ShowData.showdata("Watches");
				System.out.println(" Press 1 to see the price comparision in region other than India.");
				System.out.println(" Press 2 to see the Highest and lowest prices of Watches.");
				System.out.println(" Press 3 to see the total Stock of Watches.");

// Taking Input for the sub options.
				subcho = in.nextInt();
				switch (subcho) {
				case 1:
					ShowData.Currency("Watches");
					System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
					restart = in.next();
					if (restart.equalsIgnoreCase("Y")) {
						System.out.println("Plese Enter your choice");
					} else {
						System.out.println("Thanks! Good Day.");
					}
					break;
				case 2:
					MaxAndMin.maxPrice("Watches");
					MaxAndMin.minPrice("Watches");
					System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
					restart = in.next();
					if (restart.equalsIgnoreCase("Y")) {
						System.out.println("Plese Enter your choice");
					} else {
						System.out.println("Thanks! Good Day.");
					}
					break;
				case 3:
					MaxAndMin.sum("Watches");
					System.out.println(
							"\nPress 1 to check stock of Fastrack.\nPress 2 to check stock of Titan.\nPress 3 to check stock of Rado.\nPress 4 to check stock of Apple.\nPress 5 to check stock of Casio.\nPress 6 to see the Max and Min in stock.");
					subcho = in.nextInt();
					switch (subcho) {
					case 1:
						SearchData.searchdata("Watches", "Fastrack");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}
						break;

					case 2:
						SearchData.searchdata("Watches", "Titan");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}
						break;

					case 3:
						SearchData.searchdata("Watches", "Rado");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}
						break;
					case 4:
						SearchData.searchdata("Watches", "Apple");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}
						break;
					case 5:
						SearchData.searchdata("Watches", "Casio");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}
						break;
					case 6:
						MaxAndMin.maxQuant("Watches");
						MaxAndMin.minQuant("Watches");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}
						break;
					default:

						System.out.println("Wrong Input!");
						System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
						restart = in.next();
						if (restart.equalsIgnoreCase("Y")) {
							System.out.println("Plese Enter your choice");
						} else {
							System.out.println("Thanks! Good Day.");
						}
						break;// switch break.
					}
					break;// case 3 break.
				default:
					System.out.println("Wrong Input!");
					System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
					restart = in.next();
					if (restart.equalsIgnoreCase("Y")) {
						System.out.println("Plese Enter your choice");
					} else {
						System.out.println("Thanks! Good Day.");
					}
					break;// switch break.
				}

				break;// case 3 break.
			case 4:
				RequiredCategories.addCategories();
				break;

			default:// main category default.
				System.out.println("Wrong Input!");
				System.out.println("Do you want to check other details?\nPress Y for yes or N for no");
				restart = in.next();
				if (restart.equalsIgnoreCase("Y")) {
					System.out.println("Plese Enter your choice");
				} else {
					System.out.println("Thanks! Good Day.");
				}

				break;// main category switch break
			}
			break; // main case 1 break;
		} // while loop closed.
		in.close();
	}
}
