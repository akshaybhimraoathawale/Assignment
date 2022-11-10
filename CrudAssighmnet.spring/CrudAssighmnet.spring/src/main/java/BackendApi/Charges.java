package BackendApi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Charges {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	@Column(name = "GST")
	private Float gst;
	
	@Column(name = "Delivery_Charges")
	private Float deliveryCharge;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public Float getGst() {
		return gst;
	}

	public void setGst(Float gst) {
		this.gst = gst;
	}

	public Float getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(Float deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}

	public Charges(int cid, Float gst, Float deliveryCharge) {
		super();
		this.cid = cid;
		this.gst = gst;
		this.deliveryCharge = deliveryCharge;
	}

	public Charges() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Charges [cid=" + cid + ", gst=" + gst + ", deliveryCharge=" + deliveryCharge + "]";
	}
	
	

	

	

}
