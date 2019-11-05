package classObject;

public class EmpApp {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.id=1;
		emp1.name= "Ali";
		emp1.salary= 123.8;
		
		System.out.println(" Employee ID: " + emp1.id + " Employee Name: " + emp1.name + " Employee Salary: " + emp1.salary);
		
		Employee emp2 = new Employee();
		
		
		emp2.id=2;
		emp2.name= "Veli";
		emp2.salary= 153.8;
		
		System.out.println(" Employee ID: " + emp2.id + " Employee Name: " + emp2.name + " Employee Salary: " + emp2.salary);
		
		
		Employee emp3 = new Employee();
		
		
		emp3.id=7;
		emp3.name= "Ahmed";
		emp3.salary= 178.8;
		
		System.out.println(" Employee ID: " + emp3.id + " Employee Name: " + emp3.name + " Employee Salary: " + emp3.salary);
		
		
		
		
		
		Employee emp4 = new Employee(4, "Cuneyd", 2450.29);
		
		System.out.println(" Employee ID: " + emp4.id + " Employee Name: " + emp4.name + " Employee Salary: " + emp4.salary);
		

	}

}
