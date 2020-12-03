package ui;
import java.io.IOException;

import exception.MaximunAssignedClientsException;
import exception.SellerNoFoundException;

public class Main {
	public static void main(String arsg[]) throws IOException, ClassNotFoundException, SellerNoFoundException, MaximunAssignedClientsException {
		ProgressUI spsui = new ProgressUI();
		spsui.startProgress();
		Menu m;
		m = new Menu();
		m.startMenu();
		
	}
}
