package BooleanExpressions;

import java.util.Scanner;

public class RangeGrade {

    public static void main (String args []) {

        Scanner input = new Scanner (System.in);

        System.out.println ("Enter your grade in number");

        int grade = input.nextInt();

        boolean gotA = grade >= 90;


        System.out.println ("Your grade is A: " + gotA);




    }
}
