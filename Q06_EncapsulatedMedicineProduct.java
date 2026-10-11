class MedicineProduct {
    private String name;
    private double price;
    private int quantity;

    MedicineProduct(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    void display() {
        System.out.println("Medicine: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

public class Q06_EncapsulatedMedicineProduct {
    public static void main(String[] args) {
        new MedicineProduct("Vitamin C", 120, 15).display();
    }
}
