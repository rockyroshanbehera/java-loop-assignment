Q1. Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'.


sol:  import java.util.Scanner;

public class SumOfPositiveInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive Integer= ");
        int n = sc.nextInt();
        int sum= n*(n+1)/2;
        System.out.println(sum);
    }
}



Q2. Write a Java program to print a multiplication table for a given number 'n'.

sol:

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter a number n = ");
        int n = sc.nextInt();

        for (int i=n; i<=(n*10); i+=n){
             System.out.println(i);
        }

    }
}


Q3. Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop.


sol:
import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num1= ");
        int num1 = sc.nextInt();
        System.out.println("Enter a num2= ");
        int num2 = sc.nextInt();
        int gcd=1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd=i;
            }
            }
        System.out.println("The GCD of num1 and num2 is" + gcd );
        }
    }

Q4. Write a Java program to check if a given string is a palindrome or not using a loop.


sol:
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String st= sc.next();
        int n=st.length();
        boolean x=true;
        for (int i=0;i<n;i++){
            if (st.charAt(i)==st.charAt(n-1-i)){
                x=true;
            }
            else {
                x=false;
                break;
            }
        }
        if (x==true) System.out.println("Its a palindrome");
        else System.out.println("Its not a palindrome");

    }
}

Q5. Write a Java program to generate and print the first 'n' terms of the Fibonacci series.

sol:
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number= ");
        int n = 10, firstTerm = 0, secondTerm = 1;
        int x = sc.nextInt();
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm);
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

    }}}
