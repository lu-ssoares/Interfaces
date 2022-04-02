package model.service;

public class BrazilTaxService {
	
	public double tax(double amount) {
		
		if(amount >= 0) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
	}
}
