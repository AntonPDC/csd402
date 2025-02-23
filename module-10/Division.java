/*
 * Anton DeCesare mod 10.2
 * These Java programs models a company's divisions using inheritance and abstraction. The Division class serves as an abstract superclass,
 *  while InternationalDivision and DomesticDivision extend it to represent global and local branches. The UseDivision class creates and
 * displays two international and two domestic divisions, demonstrating polymorphism through the overridden display() method.
 *
 */


// Abstract class representing a company division
public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    // Constructor requiring division name and account number
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method to be implemented in subclasses
    public abstract void display();
}
