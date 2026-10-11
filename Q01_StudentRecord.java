class Student {
    private String name;
    private int rollNumber;

    Student(String n, int r) {
        name = n;
        rollNumber = r;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNumber);
    }
}

public class Q01_StudentRecord {
    public static void main(String[] args) {
        Student s = new Student("Aman", 101);
        s.display();
    }
}
