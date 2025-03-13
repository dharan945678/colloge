package org.colloge;

public class Student extends Colloge{
	
	public void studentName() {
		
		System.out.println("student name is dharan");
	}
	
	public void studentId() {
		
		System.out.println("student Id is 2k17me222");
	}
	
	public void studentDept() {
		
		System.out.println("student dept is Mechanical enginering");
	}
	
	public static void main(String[] args) {
		Student details=new Student();
		
		details.collogeCode();
		details.collogeName();
		details.collogeRank();
		details.studentName();
		details.studentId();
		details.studentDept();
		details.HostalName();
		details.dept();
		
		
		
	}
	

}
