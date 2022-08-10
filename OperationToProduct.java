import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class OperationToProduct {
	//create field
	private static Product product;
	private static myList list = new myList(product);
	private static myQueue queue = new myQueue(product);
	private static myStack stack = new myStack(product);
	static Scanner ip = new Scanner(System.in);
	//get path of data file
	static String path = "D:\\desktop\\Data\\DEV\\Java\\Funix\\CSD201x_02-A_VN_DN_Assignment 2_congntFX15905@funix.edu.vn\\src\\data.txt";
/**
 * Create constructor
 */
	public OperationToProduct() {
	}
	
//CREATE FUNTION FOR PROGRAM-------------------------------------------------------------------------

	
//FUNCTION: Type and add a product to the end of the linked list
	public void createProduct() {
		String check;
		//Get information of product from user
		do {
		System.out.println("Type product information");
		System.out.print("-->ID: ");
		String id = ip.next();
		System.out.print("-->Product: ");
		String title = ip.next();
		System.out.print("-->Quantity: ");
		int sl = ip.nextInt();
		System.out.print("-->Price: ");
		double price = ip.nextDouble();
		//add data to linked list
		product = new Product(id, title, sl, price);
		list.insertEndNode(product);
		
		// ask user want type more
		System.out.println("Do you want type more");
		check = ip.next();
		}while(check.equalsIgnoreCase("c")||check.equalsIgnoreCase("co")||check.equalsIgnoreCase("y")||check.equalsIgnoreCase("yes"));
		
		
	}

//FUNCTION: Display information of products in a linked list
	public void show() {
//		System.out.print("| ID | Title | Quantity | Price |\n-------------------------------------\n");
		System.out.println(list.printList());
	}
	
//FUNCTION:	Save a linked list of products to a data.txt file
	public void writeFile() {
		String tde = "";
		try {
			//open write function
			FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);
			
				bw.write(tde+list.inputList());//write to data file
			// close write function
			bw.close();
			fw.close();
		} catch (Exception e) {
		}
		System.out.println("Add successfully !");
	}

//FUNCTION: Read the data from the file and save into a linked list and display onto the screen
	public myList readFile() {

		// Read data from data.txt
		try {
			//open read function
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
//			String item = list.printList() + "\n";
			String item="| ID | Title | Quantity | Price |\n-------------------------------------\n";
			while(true) {
				item = br.readLine(); // read a line from data.txt
				if(item==null) {
					break;
				}
				//get data from data file
			String txt[] = item.split("\\s");//create array to get each line data
			//get element
			String code = txt[0];
			String sp = txt[1];
			int sl = Integer.parseInt(txt[2]);
			double gia = Double.parseDouble(txt[3]);
			list.insertEndNode(new Product(code,sp,sl,gia));// insert information of each product to linked list
			}
			System.out.println(list.printList());
		} catch (Exception e) {
		}
		System.out.println("Successfully !\n");
		return list;
	}

//FUNCTION: Search product information by ID
	public void searchProduct() {
		System.out.print("Type ID to search: ");
		String id = ip.next();
		list.searchList(id);

	}
	
	
//FUNCTION: Remove products from the linked list by ID
	public void removeProduct() {
		System.out.print("Type product ID to remove: ");
		String typeid = ip.next();
		list.delete(typeid);
		System.out.println("Deleted !");
	}
	
	
//FUNCTION:	Sort products in a linked list by ID
	public void sortProduct() {
		list.sortList();
	}
	
		
//FUNCTION:	Show the number of products (in base 10) of the first element in the Linked List to binary by recursion.	
	public void showBinary() {
		System.out.print("Quantity binary of first Node ("+list.quantity()+") is: ");
		list.convertBinary(list.quantity());
		System.out.println();
	}	
	
	
//FUNCTION:	Read data from file containing products and save to stack. Display the products in the stack.
	public myStack readStack() {
		// Read data from data.txt
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String itemq="| ID | Title | Quantity | Price |\n-------------------------------------\n";
			while(true) {
				itemq = br.readLine(); // read a line from data.txt
				if(itemq==null) {
					break;
				}
			String txt[] = itemq.split("\\s");// create array to get data from file
			//get element
			String code = txt[0];
			String sp = txt[1];
			int sl = Integer.parseInt(txt[2]);
			double gia = Double.parseDouble(txt[3]);
			stack.push(new Product(code,sp,sl,gia));// add data to stack list
			}
//			System.out.println(stack.show());
			System.out.println(stack.show());
		} catch (Exception e) {
		}
		System.out.println("Successfully !\n");
		return stack;
	}
	
	
//FUNCTION:	Read data from the file containing the products stored in the queue. Display the products in the queue.
public myQueue readQueue() {
	
	// Read data from data.txt
			try {
				FileReader fr = new FileReader(path);
				BufferedReader br = new BufferedReader(fr);
				String itemq="| ID | Title | Quantity | Price |\n-------------------------------------\n";
				while(true) {
					itemq = br.readLine(); // read a line from data.txt
					if(itemq==null) {
						break;
					}
				String txt[] = itemq.split("\\s");//create array to get data from file
				//get element
				String code = txt[0];
				String sp = txt[1];
				int sl = Integer.parseInt(txt[2]);
				double gia = Double.parseDouble(txt[3]);
				queue.push(new Product(code,sp,sl,gia));//add data to stack list
				}
				System.out.println(queue.show());
			} catch (Exception e) {
			}
			System.out.println("Successfully !\n");
			return queue;
	}
	


	

}
