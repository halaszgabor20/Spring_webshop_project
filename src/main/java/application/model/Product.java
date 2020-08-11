package application.model;

public class Product {
	
	private static final long serialVersionUID = 1L;
	
	int product_id;
	String name;
	boolean is_active;
	int price;
	String category;
	String img;

	public Product(){}

	public Product(int product_id, String name, boolean is_active, int price, String category, String img) {
		this.product_id = product_id;
		this.name = name;
		this.is_active = is_active;
		this.price = price;
		this.category = category;
		this.img = img;
	};
	
	
	public Product(String name, boolean is_active, int price, String category, String img) {
		this.name = name;
		this.is_active = is_active;
		this.price = price;
		this.category = category;
		this.img = img;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	};
	
}
