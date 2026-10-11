class Medicine {
    private String name;
    private double price;

    Medicine(String n, double p) {
        name = n;
        price = p;
    }

    void display() {
        System.out.println("Medicine: " + name);
        System.out.printf("Price: %.2f%n", price);
    }
}

public class Q02_Medicine {
    public static void main(String[] args) {
        new Medicine("Paracetamol", 25.50).display();
    }
}
