/*
 * This program calculates the cost of a yearly auto service visit
 *  using method overloading, allowing different combinations of service
 *  charges, including oil changes, tire rotations, and discounts.
 *  The main method tests each overloaded version twice,
 *  demonstrating how different parameters affect the total cost.
 */

public class AutoService {

    // Standard service charge
    public static double yearlyService() {
        return 100.00; // Base price for standard service
    }

    // Service with oil change fee
    public static double yearlyService(double oilChangeFee) {
        return 100.00 + oilChangeFee;
    }

    // Service with oil change and tire rotation fee
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        return 100.00 + oilChangeFee + tireRotationFee;
    }

    // Service with oil change, tire rotation, and a discount coupon
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double coupon) {
        return (100.00 + oilChangeFee + tireRotationFee) - coupon;
    }

    public static void main(String[] args) {
        // Test each method twice
        System.out.println("Test 1 - Standard Service: $" + yearlyService());
        System.out.println("Test 2 - Standard Service: $" + yearlyService());

        System.out.println("Test 1 - Service with Oil Change: $" + yearlyService(30.00));
        System.out.println("Test 2 - Service with Oil Change: $" + yearlyService(25.00));

        System.out.println("Test 1 - Service with Oil Change & Tire Rotation: $" + yearlyService(30.00, 20.00));
        System.out.println("Test 2 - Service with Oil Change & Tire Rotation: $" + yearlyService(25.00, 15.00));

        System.out.println("Test 1 - Full Service with Coupon: $" + yearlyService(30.00, 20.00, 10.00));
        System.out.println("Test 2 - Full Service with Coupon: $" + yearlyService(25.00, 15.00, 5.00));
    }
}
