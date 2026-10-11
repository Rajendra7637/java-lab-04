import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    private final double length;
    private double width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    private final double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class Q14_ShapeHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rectangle length and width: ");
        Shape r = new Rectangle(sc.nextDouble(), sc.nextDouble());
        System.out.print("Enter circle radius: ");
        Shape c = new Circle(sc.nextDouble());
        System.out.printf("Rectangle area: %.2f%n", r.area());
        System.out.printf("Circle area: %.2f%n", c.area());
        sc.close();
    }
}
