public class DeCesare_Mod_6_2 {

    public static void main(String[] args) {
        // Create a new instance of the class Fan called fan1
        Fan fan1 = new Fan();
        // Second instance of Fan
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        // Displaying initial state of both fans
        System.out.println(fan1);
        System.out.println(fan2);

        // Demonstrating functionality of Fan class methods
        fan1.setSpeed(Fan.MEDIUM);
        fan1.turnOn();
        fan1.setRadius(8);
        fan1.setColor("red");

        System.out.println("Updated fan1 state:");
        System.out.println(fan1);
    }

    public static class Fan {
        // Initializing four constant values
        static final int STOPPED = 0;
        static final int SLOW = 1;
        static final int MEDIUM = 2;
        static final int FAST = 3;

        // Fan fields
        private int speed;
        private boolean on;
        private double radius;
        private String color;

        // No-argument constructor with default values
        public Fan() {
            this.speed = STOPPED;
            this.on = false;
            this.radius = 6;
            this.color = "white";
        }

        // Constructor with arguments to initialize all fields
        public Fan(int speed, boolean on, double radius, String color) {
            setSpeed(speed);
            this.on = on;
            setRadius(radius);
            this.color = color;
        }

        // Getter and Setter for speed
        public int getSpeed() {
            return speed;
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
            return on;
        }

        // Getter and Setter for radius
        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            if (radius > 0) {
                this.radius = radius;
            }
        }

        // Getter and Setter for color
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        // Overriding toString() method to display fan details
        @Override
        public String toString() {
            return "Fan: " +
                   "\nOn: " + (on ? "Yes" : "No") +
                   ",\n Speed: " + speed +
                   ",\n Radius: " + radius +
                   ",\n Color: " + color;
        }
    }
}
