package Service;

import Model.Invoice;
import Model.Payment;
import Model.Products;
import Model.SendNotification;

public class OrderFacade {
	
	private Products prd;
	private Payment pay;
	private Invoice inv;
	private SendNotification sn;
	
	public OrderFacade() {
		prd = new Products();
		pay = new Payment();
		inv = new Invoice();
		sn = new SendNotification();
	}
	
	public void createOrder() {
		String pr = prd.setProduct("Bike");
		pay.makePayment();
		sn.sendNotification();
		inv.generateInvoice(pr);
	}
	
}
