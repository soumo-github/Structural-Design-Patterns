package Service;

import Model.InfoNotifier;

public class WhatsAppDecorator extends NotificationDecorator{
	
	public WhatsAppDecorator(InfoNotifier wrapped) {
		super(wrapped);
	}
	
	public void send(String msg) {
		super.sendmsg(msg);
		String phoneNo = databaseService.getPhoneFromuserName(getUserName());
		System.out.println("Sending " + msg + " on WhatsApp to " + phoneNo);
	}
}
