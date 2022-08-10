import java.util.Scanner;

public class as2_main {
	
	static Scanner ip2 = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		OperationToProduct otp = new OperationToProduct(); // create new OperationToProduct Object
		boolean condition = true; // condition to stop loop menu
		
		do {
			System.out.println("+-------Choose your option (0->10):-------+");
			System.out.println("|  (1)  Load data from file and display.  |");
			System.out.println("|  (2)  Input & add to the end.           |");
			System.out.println("|  (3)  Display data.                     |");			
			System.out.println("|  (4)  Save product list to file.        |");
			System.out.println("|  (5)  Search by ID.                     |");
			System.out.println("|  (6)  Delete by ID.                     |");
			System.out.println("|  (7)  Sort by ID.                       |");
			System.out.println("|  (8)  Convert to Binary.                |");
			System.out.println("|  (9)  Load to stack and display.        |");
			System.out.println("|  (10) Load to queue and display.        |");
			System.out.println("|  (0)  Exit menu.                        |");
			System.out.println("+-----------------------------------------+\n");

			int option = ip2.nextInt(); //get option from user
			switch (option) {
			case 1:
				otp.readFile();
				condition = true;
				break;
			case 2:
				otp.createProduct();
				condition = true;
				break;				
			case 3:
				otp.show();
				condition = true;
				break;
			case 4:
				otp.writeFile();
				condition = true;
				break;
			case 5:
				otp.searchProduct();
				condition = true;
				break;
			case 6:
				otp.removeProduct();
				condition = true;
				break;
			case 7:
				otp.sortProduct();
				condition = true;
				break;
			case 8:
				otp.showBinary();
				condition = true;
				break;	
			case 9:
				otp.readStack();
				condition = true;
				break;	
			case 10:
				otp.readQueue();
				condition = true;
				break;	
			case 0:
				System.out.println("Goodbye, Have a nice day");
				condition = false;
				break;				
			default:
				System.out.println("**Invalid choice. Try again.**");
			}

			
		} while (condition);
		

	}


}
