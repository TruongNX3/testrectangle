import java.util.Scanner;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getprimeter() {
        return (width + height) * 2;
    }
}

class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your  rectangle width: ");
        double width = sc.nextDouble();
        System.out.println("enter your rectangle height: ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Area retrangle is: " + rectangle.getArea());
    }
}
