package entity;

public class Product {
	
	private int productID;
	private String name;
	private String image;
	private double price;
	private String title;
	private String description;
	private int cID;

	public Product(int productID, String name, String image, double price, String title, String description, int cID) {
		super();
		this.productID = productID;
		this.name = name;
		this.image = image;
		this.price = price;
		this.title = title;
		this.description = description;
		this.cID = cID;
	}



	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getcID() {
		return cID;
	}

	public void setcID(int cID) {
		this.cID = cID;
	}

	public String toString() {
		return "Product [productID=" + productID + ", name=" + name + ", image=" + image + ", price=" + price
				+ ", title=" + title + ", description=" + description + ", cID=" + cID + "]";
	}

}
