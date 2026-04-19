// Program to generate five 4-digit random numbers and find their average, minimum, and maximum values
class level2c {
    // Method to generate array of 4-digit random numbers given the size as parameter
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return randomNumbers;
    }
    
    // Method to find average, min and max value of an array
    public double[] findAverageMinMax(int[] numbers) {
        // Initialize variables
        double averageValue = 0;
        int minimumValue = numbers[0];
        int maximumValue = numbers[0];
        double sumOfNumbers = 0;
        
        // Calculate sum, min, and max
        for (int i = 0; i < numbers.length; i++) {
            sumOfNumbers += numbers[i];
            minimumValue = Math.min(minimumValue, numbers[i]);
            maximumValue = Math.max(maximumValue, numbers[i]);
        }
        
        // Calculate average
        averageValue = sumOfNumbers / numbers.length;
        
        // Return array with average, min, max
        double[] results = {averageValue, minimumValue, maximumValue};
        return results;
    }
    
    public static void main(String[] args) {
        // Declare variable for size of random numbers
        int sizeOfRandomNumbers = 5;
        
        // Create object of level2c class
        level2c randomNumberAnalyzer = new level2c();
        
        // Generate array of 5 4-digit random numbers
        int[] randomNumbers = randomNumberAnalyzer.generate4DigitRandomArray(sizeOfRandomNumbers);
        
        // Display the generated random numbers
        System.out.println("Generated 5 random 4-digit numbers:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
        
        // Find average, min, and max
        double[] results = randomNumberAnalyzer.findAverageMinMax(randomNumbers);
        
        // Extract values from results array
        double averageValue = results[0];
        int minimumValue = (int) results[1];
        int maximumValue = (int) results[2];
        
        // Display results
        System.out.println("\nAverage of the numbers: " + averageValue);
        System.out.println("Minimum value: " + minimumValue);
        System.out.println("Maximum value: " + maximumValue);
    }
}
