import java.util.Scanner;

public class grade_calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int count = scanner.nextInt();
        int[] marks = new int[count];
        float[] percentages = new float[count];
        String[] grades = new String[count];
        float totalMarks = 0;
        float percentage;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            calculateGradeAndPercentage(marks[i], i, percentages, grades);
            totalMarks += marks[i];
        }

        percentage = totalMarks / count;

        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        int a = count;

        System.out.println("       "+"Marks"+"  "+"Got"+"   "+"Grade"+"  "+"Percent");

        while (count != 0) {
            int i = 1;
            System.out.println("Sub"+i+"    "+"100"+"   "+marks[i-1]+"    "+percentages[i-1]+"%"+"     "+grades[i-1]);
            i++;
            count--;
        }

        System.out.println("Total"+"   "+(int)a*100+"  "+totalMarks+"  "+percentage+"%"+"     "+grade);
        System.out.println("    ");

        scanner.close();
    }

    public static void calculateGradeAndPercentage(int marks, int subjectIndex, float[] percentages, String[] grades) {
        float percentage = (float) marks;
        String grade;

        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        percentages[subjectIndex] = percentage;
        grades[subjectIndex] = grade;
    }
} 
