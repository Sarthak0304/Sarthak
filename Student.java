package com.app.student;

public class Student {
	private String name, email, prn, course;
	double marks;
	public Student(String prn, String name, String email, String course, double marks) {
		super();
		this.name = name;
		this.email = email;
		this.prn = prn;
		this.course = course;
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPrn() {
		return prn;
	}
	
	public String getCourse() {
		return course;
	}
	
	public double getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student [\nname=" + name + ", \nemail=" + email + ", \nprn=" + prn + ", \ncourse=" + course + ", \nmarks=" + marks
				+ "\n]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((this.prn).equals(((Student)obj).prn));
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPrn(String prn) {
		this.prn = prn;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}	
}

