class Pharmacy {
    static String name = "Care Pharmacy";
    static String location = "Roorkee";

    void display() {
        System.out.println(name + " - " + location);
    }
}

public class Q03_Pharmacy {
    public static void main(String[] args) {
        Pharmacy a = new Pharmacy(), b = new Pharmacy();
        a.display();
        Pharmacy.name = "Health Plus Pharmacy";
        b.display();
    }
}
