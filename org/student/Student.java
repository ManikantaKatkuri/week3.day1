package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student Name");
	}
	public void studentDept() {
		System.out.println("Student Dept");
	}
	public void studentID () {
		System.out.println("Student ID");
	}
	public static void main(String[] args) {
		Student std = new Student();
		std.collegeCode();
		std.collegeName();
		std.collegeRank();
		std.deptName();
		std.studentName();
		std.studentDept();
		std.studentID();

	}

}
