import java.util.Scanner;

public class Lab4A {
    public Lab4A() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score of your exam: ");
        float score = sc.nextFloat();
        if (score >= 97.5F) {
            System.out.println("Letter grade is: A+");
        } else if (score >= 94.5F) {
            System.out.println("Letter grade is: A");
        } else if (score >= 91.5F) {
            System.out.println("Letter grade is: A-");
        } else if (score >= 88.5F) {
            System.out.println("Letter grade is: B+");
        } else if (score >= 85.5F) {
            System.out.println("Letter grade is: B");
        } else if (score >= 82.5F) {
            System.out.println("Letter grade is: B-");
        } else if (score >= 79.5F) {
            System.out.println("Letter grade is: C+");
        } else if (score >= 76.5F) {
            System.out.println("Letter grade is: C");
        } else if (score >= 73.5F) {
            System.out.println("Letter grade is: C-");
        } else if (score >= 70.5F) {
            System.out.println("Letter grade is: D+");
        } else if (score >= 67.5F) {
            System.out.println("Letter grade is: D");
        } else if (score >= 64.5F) {
            System.out.println("Letter grade is: D-");
        } else {
            System.out.println("Letter grade is: F");
        }

    }
}


