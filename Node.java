/**
 * 
 * @author ADMIN
 *
 */
public class Node {
	Product product;
	Node next;

	Node(Product product) {
		this.product = product;
		this.next = null;//delete *****
	}

	/**
	 * Create constructor
	 * @param product
	 * @param next
	 */
	Node(Product product, Node next) {
		this.product = product;
		this.next = next;
	}
/**
 * Setter & Getter
 */

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	/**
	 * display Product	
	 */
	 public String printNode() { // display onto screen
		return product.printProduct();
	 }
	 public String inputNode() {// display onto data.txt
		return product.inputProduct();
	 }

}
