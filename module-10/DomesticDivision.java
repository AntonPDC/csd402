/*
 * Anton DeCesare mod 10.2
 * These Java programs models a company's divisions using inheritance and abstraction. The Division class serves as an abstract superclass,
 *  while InternationalDivision and DomesticDivision extend it to represent global and local branches. The UseDivision class creates and
 * displays two international and two domestic divisions, demonstrating polymorphism through the overridden display() method.
 *
 */




// Subclass representing a domestic division
public class DomesticDivision extends Division {
    private String state;

    // Constructor requiring all fields
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    // Overridden method to display division details
    @Override
    public void display() {
        System.out.println("Domestic Division: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println("-------------------------");
    }
}
