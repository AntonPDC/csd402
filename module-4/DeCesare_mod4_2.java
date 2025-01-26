
/*
 * Anton DeCesare Mod 4.2
 * This program takes arrays of different data types and calculates the average, while only calling "one" method.
 * The key to this is using overloading methods that are created to handle each data type as the prompt.
 */


public class DeCesare_mod4_2{
    public static void main(String[] args) {
        // Random "short" values
        short[] shortArray = {12345, 23456, 3276, 7890, 12034};
        // Random "int" values
        int[] numbers = {1,2,3,4,5,6,7,8};
        //Random "long" values
        long[] longArray = {987654321L, 123456789L, -2345678901L, 3456789012L, -9876543210L,
                    2345678901L, 7654321098L, 9876543212L, -1234567890L};
        // Random "double" values
        double[] doubleArray = {12.34, 56.78, 90.12, 34.56, 78.90, 21.43, 65.87};
        // Calling "average" method to calculate the average of each value in the array, and then display the array as well.
        System.out.println("Short Average: " + average(shortArray) + "\t| " + displayArray(shortArray)+  "\n");
        System.out.println("Integer Average: " + average(numbers) + "\t| " + displayArray(numbers)+  "\n");
        System.out.println("Long Average: " + average(longArray) + "\t| " +displayArray(longArray) +  "\n");
        System.out.println("Double Average: " + average(doubleArray) + "\t| " +displayArray(doubleArray) +  "\n");


    }
    // Calculates the average of an array of shorts
    public static short average(short[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (short)(sum / array.length);
    }

    // Calculates the average of an array of ints
    public static int average(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (int)sum / array.length;
    }

    // Calculates the average of an array of longs
    public static long average(long[] array){
        long sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }

    // Calculates the average of an array of doubles
    public static Double average(double[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }

    // Displays the shorts array as a STRING
    public static String displayArray(short[] array){
        String result = "[";
        for(int i = 0; i < array.length; i++){
            result += array[i];
            if(i < array.length - 1) result += ", ";
        }
        result += "]";
        return result;
    }


    // Displays the ints array as a STRING
    public static String displayArray(int[] array){
        String result = "{";
        for(int i = 0; i < array.length; i++){
            result += array[i];
            if(i < array.length - 1) result += ", ";
        }
        result += "}";
        return result;
    }


    // Displays the longs array as a STRING
    public static String displayArray(long[] array){
        String result = "{";
        for(int i = 0; i < array.length; i++){
            result += array[i];
            if(i < array.length - 1) result += ", ";
        }
        result += "}";
        return result;
    }


    // Displays the doubles array as a STRING
    public static String displayArray(double[] array){
        String result = "{";
        for(int i = 0; i < array.length; i++){
            result += array[i];
            if(i < array.length - 1) result += ", ";
        }
        result += "}";
        return result;
    }

}
