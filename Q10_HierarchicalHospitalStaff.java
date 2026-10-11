class Q10Employee {
    protected String name;

    Q10Employee(String n) {
        name = n;
    }

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Q10Doctor extends Q10Employee {
    private String specialty;

    Q10Doctor(String n, String s) {
        super(n);
        specialty = s;
    }

    void display() {
        displayName();
        System.out.println("Specialty: " + specialty);
    }
}

class Q10Pharmacist extends Q10Employee {
    private String qualification;

    Q10Pharmacist(String n, String q) {
        super(n);
        qualification = q;
    }

    void display() {
        displayName();
        System.out.println("Qualification: " + qualification);
    }
}

public class Q10_HierarchicalHospitalStaff {
    public static void main(String[] args) {
        new Q10Doctor("Dr Mehta", "Cardiology").display();
        new Q10Pharmacist("Neha", "B.Pharm").display();
    }
}
