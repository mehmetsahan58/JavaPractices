package BooleanExpressions;

import java.util.Scanner;

public class CanVote {


    public static void main (String args[]) {

        Scanner input = new Scanner (System.in);

        System.out.println ("Enter your age: ");

        int age = input.nextInt();

        Boolean oldEnoughToVote = age >= 18;

        System.out.println ("Old enough to vote in US: " + oldEnoughToVote);

        System.out.println ("Old enough to vote in US: " + (age >= 18));

    }
}
