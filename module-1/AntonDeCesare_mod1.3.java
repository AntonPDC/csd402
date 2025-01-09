import java.util.Scanner;

class Main {
    public static void main(String[] args){
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter amount of water in kilograms: ");
            double water = myObj.nextDouble();
            System.out.println("Enter initial temperature in Celsius: ");
            double initialTemperature = myObj.nextDouble();
            System.out.println("Enter final temperature in Celsius: ");
            double finalTemperature = myObj.nextDouble();
            System.out.println((water * (initialTemperature + finalTemperature)) * 4184);
        }
        catch (Exception e) {
            System.out.println("There was an error " + e);
              }
            }
    }
