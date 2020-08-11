package application.model;

public class Cart {

	private static final long serialVersionUID = 1L;

	int cart_id;
	String product_name;
	int user_id;

	public Cart() {
	}

	public Cart(int cart_id, String product_name,  int user_id) {
		this.cart_id = cart_id;
		this.product_name = product_name;


		this.user_id = user_id;
	}

	public Cart(String product_name,  int user_id) {
		this.product_name = product_name;

		
		this.user_id = user_id;
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

}
