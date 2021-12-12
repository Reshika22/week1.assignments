package org.system;

public class AxisBank extends BankInfo{

	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.deposit();

	}
	@Override
	public void deposit() {
		
		System.out.println("Your Axis Bank deposit account reached its minimum balance");
		//super.deposit();
	}

}
