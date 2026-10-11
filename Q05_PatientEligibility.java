class Patient {
    private String name;
    private int age;

    Patient(String n, int a) {
        name = n;
        age = a;
    }

    void classify() {
        if (age >= 60)
            System.out.println(name + " is eligible for senior-citizen benefits.");
        else
            System.out.println(name + " is not eligible for senior-citizen benefits.");
    }
}

public class Q05_PatientEligibility {
    public static void main(String[] args) {
        new Patient("Ravi", 65).classify();
    }
}
