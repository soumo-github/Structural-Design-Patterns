import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
	
	private static final List<String> websites;
	private final Internet internet = new Chrome();
	
	static {
		websites = new ArrayList<>();
	}
	public void bannedsites(String name) {
		
		websites.add(name);
		
	}
	
	@Override
	public void connectTo(String host) {
		
		if(websites.contains(host)) {
			System.out.println("Banned Website");
			return;
		}
		
		internet.connectTo(host);
		
		
	}

}
