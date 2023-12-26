package com.basics;

class employe {
	int id;
	String name;
	String role;
	int salary;
	
	employe(int id,String name){
		this.id=id;
		this.name=name;
	}
		employe(int id, String name, String role){
			this(id,name);	
			this.role=role;
	}
	
		employe(int id,String name,String role,int salary){
			this(id,name,role);
			this.salary=salary;
		}
	
}


public class constructor_4 {

	public static void main(String[] args) {
		employe e1=new employe(101,"shu");
		
		System.out.println("emp id "+e1.id);
		System.out.println("emp name "+e1.name);
		System.out.println("emp role "+e1.role);
		
		System.out.println("emp salary "+e1.salary);
		System.out.println("----------------------------- ");
		
		employe e2=new employe(101,"shu","IT",2014);
		
		System.out.println("emp id "+e2.id);
		System.out.println("emp name "+e2.name);
		System.out.println("emp role "+e2.role);
		
		System.out.println("emp salary "+e2.salary);
	}

}
