import java.util.*;

public class Lab2_3_InbuiltClasses {
    // Static method example
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Instance method example
    void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        System.out.println("=== System class ===");

        int[] source = {10, 20, 30, 40, 50};
        int[] destination = new int[5];

        System.arraycopy(source, 0, destination, 0, source.length);
        System.out.println("Copied array: " + Arrays.toString(destination));
        System.out.println("Current time millis: " + System.currentTimeMillis());

        System.out.println("\n=== Math class ===");
        double x = -25.7;

        System.out.println("sqrt(25) = " + Math.sqrt(25));
        System.out.println("abs(-25.7) = " + Math.abs(x));
        System.out.println("min(10, 20) = " + Math.min(10, 20));
        System.out.println("max(10, 20) = " + Math.max(10, 20));
        System.out.println("round(25.7) = " + Math.round(25.7));

        int random0To10 = (int) (Math.random() * 11);
        int random0To100 = (int) (Math.random() * 101);

        System.out.println("Random 0 to 10 = " + random0To10);
        System.out.println("Random 0 to 100 = " + random0To100);

        System.out.println("\n=== String class ===");
        String s = "Hello Java";

        System.out.println("length() = " + s.length());
        System.out.println("charAt(1) = " + s.charAt(1));
        System.out.println("substring(6) = " + s.substring(6));
        System.out.println("equals() = " + s.equals("Hello Java"));
        System.out.println("equalsIgnoreCase() = " + s.equalsIgnoreCase("hello java"));
        System.out.println("compareTo() = " + s.compareTo("Hello"));
        System.out.println("contains(\"Java\") = " + s.contains("Java"));
        System.out.println("indexOf(\"Java\") = " + s.indexOf("Java"));

        System.out.println("\n=== Integer class ===");
        Integer number = 100;

        System.out.println("parseInt(\"123\") = " + Integer.parseInt("123"));
        System.out.println("valueOf(\"123\") = " + Integer.valueOf("123"));
        System.out.println("decode(\"0xFF\") = " + Integer.decode("0xFF"));
        System.out.println("intValue() = " + number.intValue());
        System.out.println("byteValue() = " + number.byteValue());
        System.out.println("toString() = " + number.toString());

        System.out.println("\n=== Static vs Instance method ===");
        staticMethod();

        Lab2_3_InbuiltClasses obj = new Lab2_3_InbuiltClasses();
        obj.instanceMethod();
    }
}
