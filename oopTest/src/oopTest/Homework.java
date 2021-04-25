package oopTest;

public class Homework {
	public Homework() {
		
	}

	public Homework(int id,String day,String homeworkName,String detail,String anotherHomework) {
		
		this.id = id;
		this.day = day;
		this.homeworkName = homeworkName;
		this.detail = detail;
		this.anotherHomework = anotherHomework;
		System.out.println("Ödevini geciktirme !!!!");
		
		
	}
	
	
	int id;
	String day;
	String homeworkName;
	String detail;
	String anotherHomework;

}
