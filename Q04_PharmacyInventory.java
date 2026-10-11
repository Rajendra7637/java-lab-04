class MedicineStock {
    String name;
    int quantity;

    MedicineStock(String n, int q) {
        name = n;
        quantity = q;
    }

    void display() {
        System.out.println(name + " - Quantity: " + quantity);
    }
}

class Inventory {
    private MedicineStock[] stock = { new MedicineStock("Paracetamol", 50), new MedicineStock("Cetirizine", 30),
            new MedicineStock("Antacid", 20) };

    void displayInventory() {
        for (MedicineStock m : stock)
            m.display();
    }
}

public class Q04_PharmacyInventory {
    public static void main(String[] args) {
        new Inventory().displayInventory();
    }
}
