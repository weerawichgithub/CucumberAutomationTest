package Driver;

import pages.*;


public class PageInitializer extends Driver {

	public static commonPage cmp;
	public static homePage hmp;
	public static myAccountPage map;

	public static void initialize() {
		hmp = new homePage();
		cmp = new commonPage();
		map = new myAccountPage();
	}
}
