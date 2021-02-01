package bean;

public class Product {
	private int id;
	private String name;
	private int price;
	private String store_date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStore_date() {
		return store_date;
	}
	public void setStore_date(String store_date) {
		this.store_date = store_date;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", store_date=" + store_date + "]";
	}
	
}
