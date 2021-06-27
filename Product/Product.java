public class Product {

	private String productCode;

	private String productName;

	private String categoryCode;

	private double price;

	public Product() {
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode= productCode;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName =productName ;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price =price ;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode =categoryCode ;
	}


}