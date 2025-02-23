/*
 * Anton DeCesare mod 10.2
 * These Java programs models a company's divisions using inheritance and abstraction. The Division class serves as an abstract superclass,
 *  while InternationalDivision and DomesticDivision extend it to represent global and local branches. The UseDivision class creates and
 * displays two international and two domestic divisions, demonstrating polymorphism through the overridden display() method.
 *
 */


public class UseDivision {
    public static void main(String[] args) {
        // Creating two instances of InternationalDivision
        InternationalDivision intDiv1 = new InternationalDivision("Global Tech", 1001, "Germany", "German");
        InternationalDivision intDiv2 = new InternationalDivision("Asia Market", 1002, "Japan", "Japanese");

        // Creating two instances of DomesticDivision
        DomesticDivision domDiv1 = new DomesticDivision("West Coast Operations", 2001, "California");
        DomesticDivision domDiv2 = new DomesticDivision("East Coast Operations", 2002, "New York");

        // Displaying division details
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
