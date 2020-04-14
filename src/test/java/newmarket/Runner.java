package newmarket;

public class Runner {
	
	int x = 20; // instance variable can be used by creating a object of that class
	private int y = 200; // Instance variable can be access by creating a instance of that class. But it should not be static. Satic can not be accessed
	static Regpage reg; // can not be use in a class instance
	

	public static void main(String[] args) {
		
		
		
		reg = new Regpage();
		
		reg.openbrowser();  //Overriding of a method
		reg.logotest();
		reg.exportdb();
		reg.exportexcel();
		
		Runner run = new Runner();
		run.x = 30; // access instance variable
		run.y = 100;// access instance variable
		
      System.out.println(run.x + run.y);
      
				
			
		}
		

	}
			// Constructor = It can not return any value. It is used for initialize a value in attribute/ variable/property

			// Encapsulation
			// Inheritance
			//Polymorphism
			//abstraction
			//interface
			//access modifiers
			//Garbage collector
			//overloading and overriding
			//

