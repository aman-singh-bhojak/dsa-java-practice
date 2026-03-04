// Topic: Functions and Methods
// Date: 04 Mar 2026


import java.util.Arrays;
import java.util.Scanner;

public class FunctionsAndMethods {

    // Lecture Methods:

    // 1. Sum Method
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1 and 2: ");
        int one = in.nextInt();
        int two = in.nextInt();
        int sum = one + two;
        System.out.println("The sum of the two numbers is: " + sum);
        in.close();
    }

    // 2. VarArgs
    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    
    // 3. Greetings
    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }


    static String greet() {
        String greeting = "how are you";
        return greeting;
    }

    // 4. Armstrong
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // ── Lecture Code ──────────────────────────────────

        // Code 1:
        sum();

        // Code 2:
        fun(1,2,3,4,5,6,7,8,9,10);
        demo(10,20,30,90);
        multiple(2, 3, "Vinod", "Sushmita", "dvytsbhusc");
        demo("Hello", "World", "Welcome", "to", "my", "program");

        // Code 3:
        String message = greet();
        System.out.println(message);

        System.out.print("Enter your name: ");
        String naam = in.next();
        String personalised = myGreet(naam);
        System.out.println(personalised);

        // Code 4:
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }



        // ── Assignment ────────────────────────────────────

        // Q1 - max and min of three numbers
        System.out.println("The maximum of the three numbers are: " + max(10, 20, 15));
        System.out.println("The minimum of the three numbers are: " + min(10, 20, 15));
        
        // Q2 - even or odd
        System.out.println("The entered number is: " + isEven(7));

        // Q3 - voting eligibility
        System.out.println("The person is " + canVote(17) + " to vote.");

        // Q4 - sum of two numbers
        System.out.println("The sum is: " + sum(5, 3));
        
        // Q5 - product of two numbers
        System.out.println("The product of the two number is: " + product(4, 6));
        
        // Q6 - circle area and circumference
        circleStats(7);
        
        // Q7 - prime check
        System.out.println("Is the given number prime: " + isPrime(13));
        
        // Q8 - grade
        System.out.println("The grade is: " + grade(85));
        
        // Q9 - factorial
        System.out.println("The factorial of the given number is: " + factorial(5));
        
        // Q10 - palindrome
        System.out.println("Is the given number palindrome: " + isPalindrome(121));
        
        // Q12 - pythagorean triplet
        System.out.println("Is the given triplet a pythagorean triplet: " + isPythagorean(3, 4, 5));
        
        // Q13 - primes between two numbers
        System.out.print("The prime numbers b/w the given two numbers are: ");
        primesBetween(10, 50);
        
        // Q14 - sum of first n natural numbers
        System.out.println("The sum of first n natural number is: " + sumNatural(10));
        
        
        in.close();
    }


    // Assignment Question Methods:
    
    static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
    
    // Q2
    static String isEven(int n) {
        return n % 2 == 0 ? "Even" : "Odd";
    }
    
    // Q3
    static String canVote(int age) {
        return age >= 18 ? "Eligible to vote" : "Not eligible";
    }
    
    // Q4
    static int sum(int a, int b) {
        return a + b;
    }
    
    // Q5
    static int product(int a, int b) {
        return a * b;
    }
    
    // Q6
    static void circleStats(double r) {
        System.out.println("Area: " + (Math.PI * r * r));
        System.out.println("Circumference: " + (2 * Math.PI * r));
    }
    
    // Q7
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
    
    // Q8
    static String grade(int marks) {
        if (marks >= 91)      return "AA";
        else if (marks >= 81) return "AB";
        else if (marks >= 71) return "BB";
        else if (marks >= 61) return "BC";
        else if (marks >= 51) return "CD";
        else if (marks >= 41) return "DD";
        else                  return "Fail";
    }
    
    // Q9
    static long factorial(int n) {
        if (n == 0) return 1;
        long result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }
    
    // Q10
    static boolean isPalindrome(int n) {
        int original = n, reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }
    
    // Q12
    static boolean isPythagorean(int a, int b, int c) {
        return (a*a + b*b == c*c) ||
               (a*a + c*c == b*b) ||
               (b*b + c*c == a*a);
    }
    
    // Q13
    static void primesBetween(int a, int b) {
        for (int i = a; i <= b; i++)
            if (isPrime(i)) System.out.print(i + " ");
        System.out.println();
    }
    
    // Q14
    static int sumNatural(int n) {
        return n * (n + 1) / 2;
    }

}