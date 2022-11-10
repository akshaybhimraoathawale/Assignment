package BackendApi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class ProductsModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	
	@Column(name = "Product_Name")
	private	String name;
	
	@Column(name = "Product_type")
	private	String type;
	
	@Column(name = "Product_Category")
	private	String category;
	
	@Column(name = "Product_Price")
	private	String price;

	@Column(name = "discount")
	private	String discount;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Product_charges",referencedColumnName = "pid")
	private List<Charges> charges;
	
	@Column(name = "final_Price")
	private	Float finalPrice;
	

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public Float getFinalPrice() {

		return finalPrice;
	}

	public void setFinalPrice(Float finalPrice) {
		this.finalPrice = finalPrice;
	}

	public List<Charges> getCharges() {
		return charges;
	}

	public void setCharges(List<Charges> charges) {
		this.charges = charges;
	}

	public ProductsModel(int pid, String name, String type, String category, String price, String discount,
			Float finalPrice, List<Charges> charges) {
		super();
		this.pid = pid;
		this.name = name;
		this.type = type;
		this.category = category;
		this.price = price;
		this.discount = discount;
		this.finalPrice = finalPrice;
		this.charges = charges;
	}

	public ProductsModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProductsModel [pid=" + pid + ", name=" + name + ", type=" + type + ", category=" + category + ", price="
				+ price + ", discount=" + discount + ", finalPrice=" + finalPrice + ", charges=" + charges + "]";
	}
	
	
	
	
	
	

}
