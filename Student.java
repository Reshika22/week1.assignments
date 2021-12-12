package org.student;
import org.department.Department;


public class Student extends Department{

	public static void main(String[] args) {
		Student stu = new Student();
		stu.studentName();
		stu.studentId();
		stu.studentDept();
		stu.deptName();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		System.out.println("----------------******************-----------------------");
		stu.getInfo(18);
		stu.getInfo(18, "Reshika");
		stu.getInfo("abc@gmail.com", 7869023456l);



	}
	public void studentName() {

		System.out.println("Student Name is Reshika");

	}
	public void studentDept() {
		System.out.println("Student Dept is IT dept");


	}
	public void studentId() {
		System.out.println("Student ID is 12345");

	}
	public void getInfo(int id) {

		System.out.println("Student ID : " + id);
	}
	public void getInfo(int id,String name) {

		System.out.println("Student ID : " + id + "  and Student Name : " + name);
	}
	public void getInfo(String email,long phonenum) {

		System.out.println("Student email : " + email + "  and Student Number : " + phonenum);
	}

}
