package week3.day1;

public class Students {

	//getStudentInfo by passing id argument alone
	public void getStudentInfo(int id)
	{
		System.out.println("student id: "+id);
	}

	//getStudentInfo by passing by id & name
	public void getStudentInfo(int id,String name)
	{
		System.out.println("student id: "+id);
		System.out.println("student name :"+name);
	}

	//getStudentInfo by passing by email and phoneNumber
	public void getStudentInfo(String email,long phoneNumber)
	{
		System.out.println("student email: "+email);
		System.out.println("student PhoneNumber :"+phoneNumber);
	}

	public static void main(String[] args) {
		Students std = new Students();
		std.getStudentInfo(5123);
		std.getStudentInfo(4125,"Mani");
		std.getStudentInfo("Manikanta@gmail.com",6547895146L);

	}

}
