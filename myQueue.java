
public class myQueue {
	Node headNode;
	Node tailNode;
	Product product;
	/**
	 * create constructor
	 */
	public myQueue() {
		headNode = tailNode = null;
	}
	public myQueue(Product product) {
		this.product = product;
	}
	
	/**
	 * check whether queue is empty
	 * @return
	 */
	public boolean isEmpty() {
		return (headNode == null) && (tailNode == null);
	}
	
	/**
	 * check whether queue is fully
	 * @return
	 */
	public boolean isFull() {
		return false;
	}
/**
 * Add one product to queue list
 * @param product
 * @return
 */
	public boolean push(Product product) {
		if (isFull()) { // check queue is full or not
			return false;
		}
		Node newNode = new Node(product);	// create new Node
		if (isEmpty()) { // check queue is empty or not
			tailNode = headNode = newNode; 
		} else {
			//get new node in tail
			tailNode.setNext(newNode); 
			tailNode = newNode;
		}
		return true;
	}
/**
 * remove one product out queue list
 * @return
 */
	public String pop() {
		if (isEmpty()) {
			return "Queue is empty";
		}
		String infor = headNode.toString();
		if (headNode == tailNode) {
			headNode = tailNode = null;
		} else {
			headNode = headNode.getNext();
		}

		return infor;
	}
/**
 * Display queue list onto screen
 * @return
 */
	public String show() {
		if(isEmpty()) {
			return("Queue is empty!");			
		}
		String s = "QUEUE:\n| ID | Title | Quantity | Price |\n-------------------------------------\n";
		Node curNode = this.headNode;
		while(curNode!=null) {
			s += curNode.printNode(); // add data into s String
			curNode = curNode.getNext();
		}
		return s;
	}

}
