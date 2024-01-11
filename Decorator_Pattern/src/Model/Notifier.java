package Model;

import Service.DatabaseService;

public class Notifier implements InfoNotifier{
	
	
	private final String userName;
	private final DatabaseService databaseService;
	
	public Notifier(String userName) {
		this.userName = userName;
		databaseService = new DatabaseService();
		
	}

	@Override
	public String getUserName() {
		
		return userName;
	}

	@Override
	public void sendmsg(String msg) {
		
		String mail = databaseService.getMailFromuserName(userName);
		System.out.println("Sending " + msg + " by Mail to " + mail);
		
	}

	
	  
}
