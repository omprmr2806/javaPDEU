class Vehicle {
    private int numberOfTyres;
    private String engineNo;
    private String bodyColor;
    private String RTOName;

    private static int count = 0;

    // Instance initialization block.
    {
        RTOName = "Ahmedabad";
        System.out.println("Till now the objects created are " + (count + 1));
    }

    public Vehicle(int numberOfTyres, String engineNo, String bodyColor) {
        this.numberOfTyres = numberOfTyres;
        this.engineNo = engineNo;
        this.bodyColor = bodyColor;
        count++;
    }

    public void setRTOName(String RTOName) {
        this.RTOName = RTOName;
    }

    public String getRTOName() {
        return RTOName;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numberOfTyres=" + numberOfTyres +
                ", engineNo='" + engineNo + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", RTOName='" + RTOName + '\'' +
                ", totalObjects=" + count +
                '}';
    }
}

public class Lab2_2_VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(4, "ENG101", "Red");
        Vehicle v2 = new Vehicle(4, "ENG102", "Blue");
        Vehicle v3 = new Vehicle(2, "ENG103", "Black");

        v2.setRTOName("Gandhinagar");
        v3.setRTOName("Vadodara");

        System.out.println("\n" + v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
