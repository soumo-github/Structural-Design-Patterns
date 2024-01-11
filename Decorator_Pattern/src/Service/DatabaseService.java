package Service;

public class DatabaseService {
	
	public String getMailFromuserName(String userName) {
		
		return userName + "@Mail";
		
	}
	
	public String getPhoneFromuserName(String userName) {
		
		return userName + "@Phone";
		
	}
	
	public String getFBNameFromuserName(String userName) {
		
		return userName + "@Facebook";
		
	}
}
