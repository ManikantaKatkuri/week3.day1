package week3.day1.org.system;

public class Desktop extends Computer {

	public void desktopType()
	{
		System.out.println("Desktop Type");
	}
	//main method
	public static void main(String[] args) {
		// obj creation for child class
		Desktop desk = new Desktop();
		desk.computerName();
		desk.desktopType();

	}

}
