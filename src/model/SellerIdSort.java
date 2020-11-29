package model;

import java.util.Comparator;

public class SellerIdSort implements Comparator<Seller>{


	@Override
	public int compare(Seller o1, Seller o2) {
		
		return o1.getCedula() - o2.getCedula();
	}
}
