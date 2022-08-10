
public class myStack {
	// define variable
		Node topNode;
		Product product;

		// declare constructor
		public myStack() {
			this.topNode = null;
		}
		public myStack(Product product) {
			this.product = product;
		}
		// create push method
		public boolean push(Product product) {
			if (!isFull()) {
				// add a object into head of linked list
				Node newNode = new Node(product);
				newNode.setNext(topNode); //get next node to new node
				topNode = newNode;
				return true;
			}

			return false;
		}

		// create pop method
		public String pop() {
			if (isEmpty()) {
				return "Stack is empty";
			}
			String value = topNode.toString();
			topNode = topNode.getNext(); //stick again next node
			return value;
		}
		
		// display pop method
		public String show() {
			if (isEmpty()) {
				return("Stack is empty!");			
			}
			String s = "STACK:\n| ID | Title | Quantity | Price |\n-------------------------------------\n";
			Node cur = topNode;
			while (cur != null) {
				s+=cur.printNode(); // add data into s String
				cur = cur.getNext(); 
			}
			return s;
			
		}

		// create boolean empty
		public boolean isEmpty() {
			return topNode == null;
		}

		public boolean isFull() {
			return false;
		}

}
