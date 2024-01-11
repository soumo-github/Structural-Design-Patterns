package Service;

import Model.InfoNotifier;

public class FacebookDecorator extends NotificationDecorator{

	public FacebookDecorator(InfoNotifier wrapped) {
		super(wrapped);
	}
	
	public void sendMsg(String msg) {
		super.sendmsg(msg);
		String fbName = databaseService.getFBNameFromuserName(getUserName());
		System.out.println("Sending " + msg + " on Facebook to " + fbName);
	}
}
