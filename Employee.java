package inheritancedemo;

public class Employee {

	 String name;
	    double baseSalary;

	    public Employee(String name, double baseSalary) {
	        this.name = name;
	        this.baseSalary = baseSalary;
	    }

	    public double calculateSalary() {
	        return baseSalary;
	    }
	}

	// Subclass Manager
	class Manager extends Employee {
	    double bonus;

	    public Manager(String name, double baseSalary, double bonus) {
	        super(name, baseSalary);
	        this.bonus = bonus;
	    }

	    @Override
	    public double calculateSalary() {
	        // Manager's salary calculation includes base salary and bonus
	        return baseSalary + bonus;
	    }
	}

	// Subclass Programmer
	class Programmer extends Employee {
	    int linesOfCodeWrittern;
	    double payPerLine;

	    public Programmer(String name, double baseSalary, int linesOfCodeWritten, double payPerLine) {
	        super(name, baseSalary);
	        this.linesOfCodeWrittern = linesOfCodeWritten;
	        this.payPerLine = payPerLine;
	    }

	    @Override
	    public double calculateSalary() {
	        // Programmer's salary calculation is based on lines of code written
	        return baseSalary + (linesOfCodeWrittern * payPerLine);
	    }
	}

	public class Employee2{
	    public static void main(String[] args) {
	        // Creating instances of Manager and Programmer
	        Manager manager = new Manager("John Doe",80000, 10000);
	        Programmer programmer = new Programmer("Jane Smith", 50000, 40000, 20);

	        // Calculating and printing salaries
	        System.out.println("Manager's salary: $" + manager.calculateSalary());
	        System.out.println("Programmer's salary: $" + programmer.calculateSalary());
	    }
	}
