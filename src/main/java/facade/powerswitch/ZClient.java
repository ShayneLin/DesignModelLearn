package facade.powerswitch;

public class ZClient {
	public static void main(String args[]) {
		GeneralSwitchFacade facade = new GeneralSwitchFacade();
		facade.on();
		System.out.println("----------------------------------");
		facade.off();
	}
}
