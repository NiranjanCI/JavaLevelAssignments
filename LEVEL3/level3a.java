// Program to find the shortest, tallest, and mean height of players in a football team

class level3a {
    // Method to find the sum of all elements in the array
    public int calculateSumOfHeights(int[] heights) {
        int sumOfHeights = 0;
        for (int i = 0; i < heights.length; i++) {
            sumOfHeights += heights[i];
        }
        return sumOfHeights;
    }
    
    // Method to find the mean height of the players
    public double calculateMeanHeight(int[] heights) {
        int sumOfHeights = calculateSumOfHeights(heights);
        double meanHeight = (double) sumOfHeights / heights.length;
        return meanHeight;
    }
    
    // Method to find the shortest height
    public int findShortestHeight(int[] heights) {
        int shortestHeight = heights[0];
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] < shortestHeight) {
                shortestHeight = heights[i];
            }
        }
        return shortestHeight;
    }
    
    // Method to find the tallest height
    public int findTallestHeight(int[] heights) {
        int tallestHeight = heights[0];
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
            }
        }
        return tallestHeight;
    }
    
    // Method to generate random heights in range 150 to 250 cms
    public int[] generateRandomHeights(int numberOfPlayers, int minimumHeight, int maximumHeight) {
        int[] heights = new int[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            heights[i] = (int) (Math.random() * (maximumHeight - minimumHeight + 1)) + minimumHeight;
        }
        return heights;
    }
    
    public static void main(String[] args) {
        // Declare variables
        int numberOfPlayers = 11;
        int minimumHeight = 150;
        int maximumHeight = 250;
        
        // Create object of level3a class
        level3a footballTeam = new level3a();
        
        // Generate random heights for 11 players
        int[] heights = footballTeam.generateRandomHeights(numberOfPlayers, minimumHeight, maximumHeight);
        
        // Display all player heights
        System.out.println("Heights of " + numberOfPlayers + " players (in cms):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + " ");
        }
        System.out.println();
        
        // Find and display shortest height
        int shortestHeight = footballTeam.findShortestHeight(heights);
        System.out.println("\nShortest height: " + shortestHeight + " cms");
        
        // Find and display tallest height
        int tallestHeight = footballTeam.findTallestHeight(heights);
        System.out.println("Tallest height: " + tallestHeight + " cms");
        
        // Find and display mean height
        double meanHeight = footballTeam.calculateMeanHeight(heights);
        System.out.println("Mean height: " + meanHeight + " cms");
    }
}
