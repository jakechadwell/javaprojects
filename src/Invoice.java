
public class Invoice {
	public String partNumber;
	public String partDescription;
	public int quantity;
	public double price;
	
	public Invoice(String partNum, String partDesc, int itemQuantity, double pricePerItem) {
		partNumber = partNum;
		partDescription = partDesc;
		quantity = itemQuantity;
		price = pricePerItem;
	}
	
	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static double getInvoiceAmount(Invoice invoice) {
		if(invoice.quantity<0) {
			invoice.setQuantity(0);
		}
		else if(invoice.price<0) {
			invoice.setPrice(0);;
		}
		return invoice.quantity*invoice.price;
	}
	
}
