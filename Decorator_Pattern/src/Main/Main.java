package Main;

import Model.InfoNotifier;
import Model.Notifier;
import Service.FacebookDecorator;
import Service.WhatsAppDecorator;

public class Main {

	public static void main(String[] args) {
		
		InfoNotifier notf = new FacebookDecorator(new WhatsAppDecorator(new Notifier("Soumalya Dhar")));

		
		InfoNotifier ifn = new Notifier("John");
		ifn.sendmsg("Rejection Mail");
		System.out.println("--------------------------------------------");
		notf.sendmsg("Checking Messege");
		
		System.out.println("--------------------------------------------");
		
		InfoNotifier notfbyWp = new WhatsAppDecorator(new Notifier("Cena"));
		notfbyWp.sendmsg("WhatsApp Messege check");

	}

}
