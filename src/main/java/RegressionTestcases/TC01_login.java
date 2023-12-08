package RegressionTestcases;

import Allpages.Login;

public class TC01_login extends Login{

	public static void main(String[] args) {
		Browserlauch();
		Enter_Email("manvi15.challagundla@gmail.com");
		Enter_password("M@nvitha15");
		button_click();
		//Browserclose();

	}

}
