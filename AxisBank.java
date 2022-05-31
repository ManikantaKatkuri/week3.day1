package week3.day1;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("deposit amount override");
	}
	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		//deposit method override
		    bank.deposit();
			bank.fixed();
			bank.saving();

	}

}
