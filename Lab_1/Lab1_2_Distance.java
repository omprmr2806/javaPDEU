import java.util.*;

class Distance {
    private int feet;
    private int inches;

    public Distance() {
        this(0, 0);
    }

    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
        normalize();
    }

    private void normalize() {
        if (inches >= 12) {
            feet += inches / 12;
            inches %= 12;
        }
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public void setInches(int inches) {
        this.inches = inches;
        normalize();
    }

    public int getFeet() {
        return feet;
    }

    public int getInches() {
        return inches;
    }

    @Override
    public String toString() {
        return feet + " feet " + inches + " inches";
    }
}

public class Lab1_2_DistanceDemo {
    public static void main(String[] args) {
        Distance d = new Distance();

        d.setFeet(5);
        d.setInches(8);

        System.out.println("Distance = " + d);
        System.out.println("Feet = " + d.getFeet());
        System.out.println("Inches = " + d.getInches());
    }
}
