class StaffMember {
    private String name;
    private int id;

    StaffMember(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Staff: " + name + ", ID: " + id);
    }
}

class HospitalSystem {
    private StaffMember[] staff = { new StaffMember("Dr Sharma", 101), new StaffMember("Neha (Pharmacist)", 102),
            new StaffMember("Amit (Manager)", 103) };

    void run() {
        System.out.println("Hospital Staff System");
        for (StaffMember s : staff) {
            s.display();
            System.out.println("---------------");
        }
    }
}

public class Q15_FinalHospitalStaffSystem {
    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();
        system.run();
    }
}
