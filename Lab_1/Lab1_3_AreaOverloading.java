import java.util.*;

class AreaCalculator {
    // Circle: findArea(radius)
    double findArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle: findArea(length, breadth)
    double findArea(double length, double breadth) {
        return length * breadth;
    }

    // Triangle: findArea(base, height, isTriangle)
    double findArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}

public class Lab1_3_AreaOverloading {
    public static void main(String[] args) {
        AreaCalculator area = new AreaCalculator();

        System.out.println("Circle area = " + area.findArea(5.0));
        System.out.println("Rectangle area = " + area.findArea(10.0, 4.0));
        System.out.println("Triangle area = " + area.findArea(8.0, 5.0, true));
    }
}
