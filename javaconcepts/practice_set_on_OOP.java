package javaconcepts;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class practice_set_on_OOP {
    public static void main(String[] args) {

        // Problem 1
        Employee Joe = new Employee();
        Joe.setName("Joe Cullen");
        Joe.salary = 233;
        System.out.println(Joe.getSalary());
        System.out.println(Joe.getName());


    }
}
