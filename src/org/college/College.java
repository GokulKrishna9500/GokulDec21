package org.college;

public class College {
	
	private void collegeName() {
		// TODO Auto-generated method stub
		System.out.println("Vel Tech");
	}
	
	private void collegeCode() {
		// TODO Auto-generated method stub
		System.out.println("5493");
	}
	
	private void collegeRank() {
		// TODO Auto-generated method stub
		System.out.println("7th Rank");
	}
	
	public static void main(String[] args) {
		
		College c = new College();
		
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		
		Student s = new Student();
		
		s.studentName();
		s.studentId();
		s.studentDept();
		
		DeptName d = new DeptName();
		
		d.deptName();
		
		Hostel h = new Hostel();
		
		h.hostelName();
	}
}
