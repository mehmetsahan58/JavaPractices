

    package BooleanExpressions;

import java.util.Scanner;

    public class NumbersOrder {

        public static void main (String args []) {

            Scanner input = new Scanner (System.in);

            System.out.println ("Enter two numbers: ");

            int num1 = input.nextInt();
            int num2 = input.nextInt();

            boolean moreThan = num1 > num2;

            boolean lessThan = num1 < num2;

            boolean equalTo = num1 == num2;

            System.out.println (num1 + " > " + num2 + " : " + (moreThan));
            System.out.println (num1 + " < " + num2 + " : " + (lessThan));
            System.out.println (num1 + " == " + num2 + " : " + (equalTo));

        }
    }


