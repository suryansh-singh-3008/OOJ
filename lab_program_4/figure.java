import java.util.Scanner;
abstract class Shape {
    int a, b;
    abstract double getArea();
}
class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        a = length;
        b = breadth;
    }
    double getArea() {
        return a * b;
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        a = base;
        b = height;
    }
    double getArea() {
        return 0.5 * a * b;
    }
}
class Circle extends Shape {
    Circle(int radius) {
        a = radius;
    }
    double getArea() {
        return Math.PI * a * a;
    }
}
public class figure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions of Rectangle(length & breadth):");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        Rectangle rect = new Rectangle(length, breadth);
        
        System.out.print("Enter dimensions of Triangle(base and height):");
        int base = sc.nextInt();
        int height = sc.nextInt();
        Triangle tri = new Triangle(base, height);
        
        System.out.print("Enter radius of Circle:");
        int radius = sc.nextInt();
        Circle cir = new Circle(radius);
        

        System.out.println("Area of Rectangle = " + rect.getArea());
        System.out.println("Area of Triangle = " + tri.getArea());
        System.out.println("Area of Circle = " + cir.getArea());
        
    }
}
