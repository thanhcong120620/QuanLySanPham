
public class myList {
	private Node head;
	private Node tail;
	Product product;
/**
 * Create constructor
 * @param product
 */
	public myList(Product product) {
		this.product = product;
	}
/**
 * Insert new Product to tail linked list
 * @param product
 */
	public void insertEndNode(Product product) {
		Node newNode = new Node(product);

		// if linked list is empty
		if (this.head == null) {
			// get new node to head and tail
			this.head = newNode;
			this.tail = newNode;
		}

		// if linked list is not empty
		else if (this.tail != null) {
			//get new node to tail node
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
/**
 * Search product by ID
 * @param id
 */
	public void searchList(String id) {
		boolean condition = true;
		Node cur = this.head;
		while (cur != null) {
			if ((cur.product.getBcode()).equalsIgnoreCase(id)) {// compare input and data
				System.out.println("Your search: " + cur.printNode());//display information
				condition = false;
			}

			cur = cur.getNext(); // get next node

		}
		if (condition) {
			System.out.println("-1");//if not find will be return to
		}
	}
/**
 * Display linked list onto screen
 * @return
 */
	public String printList() {
		String result = "LINKED LIST:\n | ID | Title | Quantity | Price |\n-------------------------------------\n";
		Node current = this.head;
		while (current != null) {
			result += current.printNode();//add data in result String
			current = current.getNext();
		}
		return result;

	}
	/**
	 * Display linked list in data.txt
	 * @return
	 */
	public String inputList() {
		String input = "";
		Node current = this.head;
		while (current != null) {
			input += current.inputNode();//add data in result String
			current = current.getNext();
		}
		return input;
	}
	/**
	 * Delete product by typing id
	 * @return
	 */
	public void delete(String id) {
		// Store head node
		Node temp = head, prev = null;

		// If head node itself holds the key to be deleted
		if (temp != null && (temp.product.getBcode()).equalsIgnoreCase(id)) {
			head = temp.next; // Changed head
			return;
		}

		// Search for the key to be deleted, keep track of the previous node as we need to change temp.next
		while (temp != null && !(temp.product.getBcode()).equalsIgnoreCase(id)) {
			prev = temp;
			temp = temp.next;
		}

		// If key was not present in linked list
		if (temp == null)
			return;

		// Unlink the node from linked list
		prev.next = temp.next;

	}
/**
 * get quantity of product to convert to binary
 * @return
 */
	public int quantity() {
		Node cur = this.head;
		return cur.product.getQuantity();
	}
	/**
	 * Convert to binary method
	 * @return
	 */
	public void convertBinary(int a) {
		if (a != 0) {//base method
			convertBinary(a / 2);//Recursion
		}
		System.out.print(a % 2);
	}
	/**
	 * Sort list by ID
	 * @return
	 */
	public void sortList() {
		// Node current will point to head
		Node current = this.head, index = null;

		if (this.head == null) {// list is empty
			return;
		} else {
			while (current != null) {
				// Node index will point to node next to current
				index = current.next;
				while (index != null) {
					// If current node's bcode is greater than index's node bcode, swap the bcode between them
					if (current.product.getBcode().compareToIgnoreCase(index.product.getBcode()) > 0) {

						Product temp = current.product;
						current.product= index.product;
						index.product = temp;
					}

					index = index.next;
				}
				current = current.next;
			}
		}
	}
}
