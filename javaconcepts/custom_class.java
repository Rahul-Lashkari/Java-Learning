package javaconcepts;

class Employee1{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }

    public int getSalary(){
        return salary;
    }
}

public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 Sasha = new Employee1();   // Instantiating a new Employee Object
        Employee1 Nicole = new Employee1();  // Instantiating a new Employee Object

        // Setting Attributes for Sasha
        Sasha.id = 11;
        Sasha.salary = 20;
        Sasha.name = "Sasha";

            // Setting Attributes for Nicole
        Nicole.id = 12;
        Nicole.salary = 18;
        Nicole.name = "Nicole";

        // Printing the Attributes~~
        Sasha.printDetails();
        Nicole.printDetails();
        int salary = Sasha.getSalary();
        System.out.println(salary);

    }
}
