class Q09Employee {
    protected String name;
    protected int id;

    Q09Employee(String n, int i) {
        name = n;
        id = i;
    }

    void displayEmployee() {
        System.out.println("Name: " + name + "; ID: " + id);
    }
}

class Pharmacist extends Q09Employee {
    private String qualification;

    Pharmacist(String n, int i, String q) {
        super(n, i);
        qualification = q;
    }

    void display() {
        displayEmployee();
        System.out.println("Qualification: " + qualification);
    }
}

public class Q09_EmployeePharmacist {
    public static void main(String[] args) {
        new Pharmacist("Neha", 202, "B.Pharm").display();
    }
}
