class Q11Person {
    protected String name;

    Q11Person(String n) {
        name = n;
    }

    void showPerson() {
        System.out.println("Name: " + name);
    }
}

class Q11Employee extends Q11Person {
    protected int id;

    Q11Employee(String n, int i) {
        super(n);
        id = i;
    }

    void showEmployee() {
        showPerson();
        System.out.println("Employee ID: " + id);
    }
}

class Q11Manager extends Q11Employee {
    private String department;

    Q11Manager(String n, int i, String d) {
        super(n, i);
        department = d;
    }

    void display() {
        showEmployee();
        System.out.println("Department: " + department);
    }
}

public class Q11_MultilevelHospitalStaff {
    public static void main(String[] args) {
        new Q11Manager("Amit", 301, "Operations").display();
    }
}
