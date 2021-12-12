package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() 
	{
		System.out.println("Desktop Size is 2.6 INCH ");

	}
	
	public static void main(String[] args) {
		
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopSize();
	}

}
