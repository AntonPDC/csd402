class Main{
    public static void main(String[] args) {
        short[] shortArray = {12345, 23456, 3276, 7890, 12034}; // Random "short" values
        int[] numbers = {1,2,3,4,5,6,7,8}; // Random "int" values
        long[] longArray = {987654321L, 123456789L, -2345678901L, 3456789012L, -9876543210L,
                    2345678901L, 7654321098L, 9876543212L, -1234567890L}; //Random "long" values
        double[] doubleArray = {12.34, 56.78, 90.12, 34.56, 78.90, 21.43, 65.87}; // Random "double" values

        System.out.println("Short Average: " + average(shortArray) + "\t|\t" + displayArray(shortArray)+  "\n");
        System.out.println("Integer Average: " + average(numbers) + "\t|\t" + displayArray(numbers)+  "\n");
        System.out.println("Long Average: " + average(longArray) + "\t|\t" +displayArray(longArray) +  "\n");
        System.out.println("Double Average: " + average(doubleArray) + "\t|\t" +displayArray(doubleArray) +  "\n");


    }

    public static short average(short[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (short)(sum / array.length);
    }
    public static int average(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (int)sum / array.length;
    }

    public static long average(long[] array){
        long sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }

    public static Double average(double[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }

    public static String displayArray(short[] array){
        String result = "[";
        for(int i = 0; i < array.length; i++){
            result += array[i];
            if(i < array.length - 1) result += ", ";
        }
        result += "]";
        return result;
    }
    public static String displayArray(int[] array){
        String result = "[";
        for(int i = 0; i < array.length; i++){
            result += array[i];
            if(i < array.length - 1) result += ", ";
        }
        result += "]";
        return result;
    }
    public static String displayArray(long[] array){
        String result = "[";
        for(int i = 0; i < array.length; i++){
            result += array[i];
            if(i < array.length - 1) result += ", ";
        }
        result += "]";
        return result;
    }
    public static String displayArray(double[] array){
        String result = "[";
        for(int i = 0; i < array.length; i++){
            result += array[i];
            if(i < array.length - 1) result += ", ";
        }
        result += "]";
        return result;
    }

}
