
public class Product {
	private String bcode;
	private String title;
	private Integer quantity;
	private double price;
	
/**
 * Constructor method to initialize a product
 * 
 * @param bcode
 * @param title
 * @param quantity
 * @param price
 */
	public Product(String bcode, String title, Integer quantity, double price) { 
		this.bcode = bcode;
		this.title = title;
		this.quantity = quantity;
		this.price = price;
	}
/**
 * 
 * Getter & Setter
 */
	public String getBcode() {
		return bcode;
	}

	public void setBcode(String bcode) {
		this.bcode = bcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
/**
 * display Product	
 */
	 public String printProduct() { //display onto screen
		 return ("| "+bcode+"  |    "+ title+"  |    "+quantity+"     |  "+price+"  |\n"); 
	 }
	 public String inputProduct() { //display on data.txt
		 return (bcode+" "+ title+" "+quantity+" "+price+"\n"); 
	 }

}
