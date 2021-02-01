package bean;
import java.io.Serializable;
public class Pproduct implements Serializable{
  //private static final long serialVersionUID=1L;
	private int id;
	private String name;
	private int price;
	public Pproduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pproduct(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
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
	@Override
	public String toString() {
		return "Pproduct [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

}
