public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};

        // Create an array to store the frequencies of elements
        int[] frequencies = new int[array.length];

        // Calculate the frequencies of elements
        for (int i = 0; i < array.length; i++) {
            if (frequencies[i] == -1) {
                continue;  // Skip already processed elements
            }

            int count = 1;  // Set the frequency to 1 initially
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    // Mark the repeating element by setting its frequency to -1
                    frequencies[j] = -1;
                }
            }

            // Print the result
            System.out.println(array[i] + " appeared " + count + " times.");
        }
    }
}
