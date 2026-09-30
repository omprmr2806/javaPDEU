class Distance {
    private int feet;
    private int inches;

    // Default constructor uses this() to call the two-argument constructor.
    public Distance() {
        this(5, 5);
    }

    // One-argument constructor: feet = given value, inches = 5.
    public Distance(int feet) {
        this(feet, 5);
    }

    // Two-argument constructor.
    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Copy constructor.
    public Distance(Distance other) {
        this(other.feet, other.inches);
    }

    public void display() {
        System.out.println(feet + " feet " + inches + " inches");
    }
}

public class Lab2_1_DistanceConstructors {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance(10);
        Distance d3 = new Distance(d2);

        System.out.print("Default constructor: ");
        d1.display();

        System.out.print("One-argument constructor: ");
        d2.display();

        System.out.print("Copy constructor: ");
        d3.display();
    }
}
