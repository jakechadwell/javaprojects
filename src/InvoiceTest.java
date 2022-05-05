
public class InvoiceTest {

	public static void main(String[] args) {

		Invoice testInvoice = new Invoice("1", "Chainsaw", 3, 60.0);
		System.out.println(Invoice.getInvoiceAmount(testInvoice));
		
	}

}
