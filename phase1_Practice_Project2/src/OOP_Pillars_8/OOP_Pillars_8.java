package OOP_Pillars_8;

class student {
	int rollno;  //variables
	String name;

	student(int rollno, String name) { //constructor
		this.rollno = rollno;
		this.name = name;
	}

	void study() {  //method
		System.out.println("students are studying.. ");
	}
}

public class OOP_Pillars_8 {
	public static void main(String[] args) {
		student s = new student(12, "ravi");   //first object create 
		System.out.println(" rollno :" + s.rollno);
		System.out.println(" name :" + s.name);

		student s1 = new student(13, "kavi");  //second object create
		System.out.println(" rollno :" + s1.rollno);
		System.out.println(" name :" + s1.name);

		s.study();  //method calling by using first object
	}

}
