package javaconcepts;

class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee() {
        id = 0;
        name = "Your-Name-Here";
    }

    public MyMainEmployee(String myName, int myId) {
        id = myId;
        name = myName;
    }

    public MyMainEmployee(String myName) {
        id = 1;
        name = myName;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class constructors {
    public static void main(String[] args) {
        //MyMainEmployee Sally = new MyMainEmployee("ProgrammingWithSally", 12);
        MyMainEmployee Sally = new MyMainEmployee();
//        Sally.setName("CodeWithSally");
//        Sally.setId(34);
        System.out.println(Sally.getId());
        System.out.println(Sally.getName());
    }
}
