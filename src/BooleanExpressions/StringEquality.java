package BooleanExpressions;

public class StringEquality {

    public static void main (String args[]) {

        String A = "hello";
        String B = new String ("hello");

        System.out.println ("A vs B");
        System.out.println();

        System.out.println ("If you use ==: " + (A == B));
        System.out.println ("if you use equals: " + (A.equals(B)));

        String C = "hello";
        System.out.println ("A vs C");
        System.out.println();

        System.out.println ("If you use == :" + (A == C));
        System.out.println ("If you use equals :" + (A.equals(C)));

    }
}

