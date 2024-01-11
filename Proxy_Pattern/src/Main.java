
public class Main {

	public static void main(String[] args) {
		
		ProxyInternet pi = new ProxyInternet();
		pi.bannedsites("Youtube");
		pi.connectTo("Youtube");

	}

}
