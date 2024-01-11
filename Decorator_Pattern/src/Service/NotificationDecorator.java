package Service;

import Model.InfoNotifier;

public abstract class NotificationDecorator implements InfoNotifier{
	
	private final InfoNotifier wrapped;
	protected final DatabaseService databaseService;
	
	NotificationDecorator(InfoNotifier wrapped){
		this.wrapped = wrapped;
		databaseService = new DatabaseService();
	}

	@Override
	public void sendmsg(String msg) {
		
		wrapped.sendmsg(msg);
		
	}

	@Override
	public String getUserName() {
	
		return wrapped.getUserName();
	}

}
