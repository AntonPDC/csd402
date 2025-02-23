/*
 * Anton DeCesare mod 10.2
 * These Java programs models a company's divisions using inheritance and abstraction. The Division class serves as an abstract superclass,
 *  while InternationalDivision and DomesticDivision extend it to represent global and local branches. The UseDivision class creates and
 * displays two international and two domestic divisions, demonstrating polymorphism through the overridden display() method.
 *
 */




// Subclass representing an international division
public class InternationalDivision extends Division {
    private String country;
    private String language;

    // Constructor requiring all fields
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    // Overridden method to display division details
    @Override
    public void display() {
        System.out.println("International Division: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println("-------------------------");
    }
}
