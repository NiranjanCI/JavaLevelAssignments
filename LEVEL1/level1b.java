// Program to calculate average marks in PCM

class level1b {
    public static void main(String[] args) {

        String studentName = "Sam";
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;

        int totalMarks = mathsMarks + physicsMarks + chemistryMarks;
        double averageMarks = totalMarks / 3.0;

        System.out.println(studentName + "'s average mark in PCM is " + averageMarks);
    }
}