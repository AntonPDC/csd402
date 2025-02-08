import java.util.ArrayList;
import java.util.List;

public class DeCesare_mod_7_2 {

    public static void main(String[] args) {
        // Create multiple instances of Fan
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        Fan fan3 = new Fan(Fan.MEDIUM, false, 7, "green");

        // Create a collection of Fans
        List<Fan> fanCollection = new ArrayList<>();
        fanCollection.add(fan1);
        fanCollection.add(fan2);
        fanCollection.add(fan3);

        // Display all fans using a collection method
        System.out.println("Displaying all fans:");
        System.out.println(displayFans(fanCollection));
        System.out.println();

        // Display a single fan instance
        System.out.println("Displaying a single fan:\n");
        System.out.println(displayFan(fan1));
    }

    // Method to display a single fan using StringBuilder
    public static String displayFan(Fan fan) {
        StringBuilder sb = new StringBuilder();
        sb.append("Fan Details:\n");
        sb.append("On: ").append(fan.isOn() ? "Yes" : "No").append("\n");
        sb.append("Speed: ").append(fan.getSpeed()).append("\n");
        sb.append("Radius: ").append(fan.getRadius()).append("\n");
        sb.append("Color: ").append(fan.getColor()).append("\n");
        return sb.toString();
    }

    // Method to display a collection of fans using StringBuilder
    public static String displayFans(List<Fan> fans) {
        StringBuilder sb = new StringBuilder();
        for (Fan fan : fans) {
            sb.append("----------------------\n");
            sb.append(displayFan(fan)).append("\n");
        }
        sb.append("----------------------\n");
        return sb.toString();
    }

    // Fan Class
    public static class Fan {
        // Fan Speed Constants
        static final int STOPPED = 0;
        static final int SLOW = 1;
        static final int MEDIUM = 2;
        static final int FAST = 3;

        // Fan Fields
        private int speed;
        private boolean on;
        private double radius;
        private String color;

        // No-argument constructor (uses "this" reference)
        public Fan() {
            this.speed = STOPPED;
            this.on = false;
            this.radius = 6;
            this.color = "white";
        }

        // Constructor with arguments (uses "this" reference)
        public Fan(int speed, boolean on, double radius, String color) {
            this.setSpeed(speed);
            this.on = on;
            this.setRadius(radius);
            this.color = color;
        }

        // Getter and Setter for Speed
        public int getSpeed() {
            return this.speed;
        }

        public void setSpeed(int speed) {
            if (speed >= STOPPED && speed <= FAST) {
                this.speed = speed;
            }
        }

        // Methods to turn Fan on and off
        public void turnOn() {
            this.on = true;
        }

        public void turnOff() {
            this.on = false;
        }

        public boolean isOn() {
            return this.on;
        }

        // Getter and Setter for Radius
        public double getRadius() {
            return this.radius;
        }

        public void setRadius(double radius) {
            if (radius > 0) {
                this.radius = radius;
            }
        }

        // Getter and Setter for Color
        public String getColor() {
            return this.color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
}
