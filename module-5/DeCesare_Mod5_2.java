
import java.util.Arrays;


// The class DeCesare_Mod5_2 contains the main method to generate a 10x10 random table,
// find and print the location of the largest element in the table.


public class DeCesare_Mod5_2{
    public static void main(String[] args) {
        //Initialize table structure
        int [][] table = new int [10][10];
        //Nested for loops to iterate through each element in the table
        for( int row = 0; row < table.length; row++ ) {
            for( int column = 0; column < table[row].length; column++ ) {
                //Create matrix to hold random values between 0 and 99
                table[row][column] = (int) (Math.random() * 100);
            }
            //Print out the table
            System.out.println(Arrays.toString(table[row]));
        }
        // Print out the location of the largest element by calling calcLargest() on our table
        System.out.println("The location of the largest element in the table is " + Arrays.toString(locateLargest(table)));
        System.out.println("The location of the smallest element in the table is " + Arrays.toString(locateSmallest(table)));
    }


    // Method to calculate the largest element in the table
    public static int[] locateLargest (int[][] table){
            int [] result = new int [2];
            //Initialize "max" and start by checking the first element in the table
            int max = table[0][0];
            // Nested for loops to iterate over the elements
            for(int i = 0; i < table.length; i++){
                for(int j = 0; j < table[i].length; j++){
                    //Re-assign "max" to the larger number if applicable
                    if(table[i][j] > max){
                        max = table[i][j];
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
            return result;
        }
    // Overloading method for finding the largest element in the table
    public static double[] locateLargest (double[][] table){
            double [] result = new double [2];
            //Initialize "max" and start by checking the first element in the table
            double max = table[0][0];
            // Nested for loops to iterate over the elements
            for(int i = 0; i < table.length; i++){
                for(int j = 0; j < table[i].length; j++){
                    //Re-assign "max" to the larger number if applicable
                    if(table[i][j] > max){
                        max = table[i][j];
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
            return result;
        }

    // Method for calculating smallest element in the table
    public static int[] locateSmallest (int[][] table){
        int [] result = new int [2];
        //Initialize "min" and start by checking the first element in the table
        int min = table[0][0];
        // Nested for loops to iterate over the elements
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                //Re-assign "min" to the smaller number if applicable
                if(table[i][j] < min){
                    min = table[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
    //Overlaoding method for calculating smallest double value
    public static int[] locateSmallest (double[][] table){
        int [] result = new int [2];
        //Initialize "min" and start by checking the first element in the table
        double min = table[0][0];
        // Nested for loops to iterate over the elements
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                //Re-assign "min" to the smaller number if applicable
                if(table[i][j] < min){
                    min = table[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

}
