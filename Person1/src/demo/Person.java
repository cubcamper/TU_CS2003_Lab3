/*
 *  @author george-patterson
 *  @since 2017-09-14
 *  
 *  - combined three different display methods into one method that take a parameter and displays what is requested
 *  - wrote the medicare() method
 *  - re-factored to  
 */


package demo;

public class Person {
	static int current_year = 2017;							//data members of person
	private String name;
	private int birthdate;
	private int age;
	
	//constructor
	public Person(String name, int bdate){
		this.name = name;								//set a specific Person's data members to what they are
		this.birthdate = bdate;
		this.age = current_year - birthdate;
	}

	
	public void reset_birthday(int year){						//reset's Person's birthday
		birthdate = year;
	}
	

	
	public void  medicare() {									//displays medicare status based on age
		if (age >= 65){
			System.out.println("\nI'm a senior citizen");
		}
		else{
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");
		}
	}
	
	public void display(char q) {						   //user wants to display something
		if (q == 'c') {									   //user wants age
			System.out.printf("I am %d years old ",age);
			medicare();
		}
		else if (q == 'b') {									//user wants birthdate
			System.out.printf("I was born in %d. ",birthdate);
		}
		else if (q == 'a') {									//user wants name
			System.out.println("This is " + name);
		}
		else {													//user wants data that Person does not have
			System.out.println("I cannot display that!");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person John = new Person("John",1957);
		char[] alpha = {'a','b','c'};
		int i=0;
		while (i<alpha.length) {
			John.display(alpha[i]);				//prints all three things
			i++;
		}
		
		
	}

}
