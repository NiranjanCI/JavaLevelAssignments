// Program to check various number properties using static methods in NumberChecker utility class

class level3b {
    // Static method to count digits in a number
    public static int countDigits(int number) {
        int count = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }
    
    // Static method to store digits in an array
    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digitsArray = new int[count];
        int temp = Math.abs(number);
        
        for (int i = count - 1; i >= 0; i--) {
            digitsArray[i] = temp % 10;
            temp /= 10;
        }
        return digitsArray;
    }
    
    // Static method to check if a number is a duck number (has non-zero digit)
    public static boolean isDuckNumber(int number) {
        int[] digitsArray = getDigitsArray(number);
        for (int i = 0; i < digitsArray.length; i++) {
            if (digitsArray[i] == 0) {
                return true;
            }
        }
        return false;
    }
    
    // Static method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digitsArray = getDigitsArray(number);
        int digitCount = digitsArray.length;
        int sum = 0;
        
        for (int i = 0; i < digitsArray.length; i++) {
            sum += Math.pow(digitsArray[i], digitCount);
        }
        
        return sum == number;
    }
    
    // Static method to check if a number is a prime number
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Static method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }
        
        int sumOfDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }
        
        return sumOfDivisors == number;
    }
    
    // Static method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int squareOfNumber = number * number;
        int[] digitsArray = getDigitsArray(squareOfNumber);
        int sum = 0;
        
        for (int i = 0; i < digitsArray.length; i++) {
            sum += digitsArray[i];
        }
        
        return sum == number;
    }
    
    public static void main(String[] args) {
        // Test number
        int testNumber = 153;
        
        // Display test number
        System.out.println("Testing number: " + testNumber);
        System.out.println();
        
        // Check if Duck Number
        boolean duckNumberResult = isDuckNumber(testNumber);
        System.out.println("Is " + testNumber + " a Duck Number? " + duckNumberResult);
        
        // Check if Armstrong Number
        boolean armstrongNumberResult = isArmstrongNumber(testNumber);
        System.out.println("Is " + testNumber + " an Armstrong Number? " + armstrongNumberResult);
        
        // Check if Prime Number
        boolean primeNumberResult = isPrimeNumber(testNumber);
        System.out.println("Is " + testNumber + " a Prime Number? " + primeNumberResult);
        
        // Check if Perfect Number
        boolean perfectNumberResult = isPerfectNumber(testNumber);
        System.out.println("Is " + testNumber + " a Perfect Number? " + perfectNumberResult);
        
        // Check if Neon Number
        boolean neonNumberResult = isNeonNumber(testNumber);
        System.out.println("Is " + testNumber + " a Neon Number? " + neonNumberResult);
        
        System.out.println("\n--- Testing Different Numbers ---\n");
        
        // Test perfect number
        int perfectNumber = 6;
        System.out.println("Is " + perfectNumber + " a Perfect Number? " + isPerfectNumber(perfectNumber));
        
        // Test prime number
        int primeNumber = 17;
        System.out.println("Is " + primeNumber + " a Prime Number? " + isPrimeNumber(primeNumber));
        
        // Test neon number
        int neonNumber = 9;
        System.out.println("Is " + neonNumber + " a Neon Number? " + isNeonNumber(neonNumber));
    }
}
