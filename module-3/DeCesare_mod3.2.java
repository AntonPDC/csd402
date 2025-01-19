class PatternDisplay {
    public static void main(String[] args) {
        int rows = 7; // Total number of rows
        int maxWidth = 0;

        // Calculate the width of the widest row for proper alignment of the @ symbols
        for (int i = 1; i <= rows; i++) {
            maxWidth += 3; // Each number takes 3 spaces, and there are 2^i numbers in the widest row
        }
        maxWidth *= 2; // Account for both left and right sides of the pyramid

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   "); // Three spaces for alignment
            }

            // Print the left side of the pyramid
            int value = 1;
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-3d", value);
                value *= 2; // Multiply value by 2
            }

            // Print the right side of the pyramid
            value /= 2; // Reset to the last value printed on the left side
            for (int j = i - 1; j >= 1; j--) {
                value /= 2; // Divide value by 2
                System.out.printf("%-3d", value);
            }

            // Calculate spaces to align the @ symbol
            int totalChars = (rows - i) * 3 + i * 3 * 2 - 1; // Total characters used in the row
            for (int k = totalChars; k < maxWidth; k++) {
                System.out.print(" "); // Add extra spaces
            }

            // Print the @ symbol
            System.out.println(" @");
        }
    }
}
