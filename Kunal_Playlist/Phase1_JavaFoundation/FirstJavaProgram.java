// Topic: First Java Program - I/O, Debugging, Datatypes
// Date: 03 Feb 2026

import java.util.Scanner;

public class FirstJavaProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ── Lecture Code ──────────────────────────────────
        System.out.println("Hello, World!");

        // Datatypes
        int age = 20;
        double price = 99.99;
        char grade = 'A';
        boolean isJavaFun = true;
        System.out.println(age + " " + price + " " + grade + " " + isJavaFun);



        System.out.print("Please enter some input: ");
        int rollno = in.nextInt();
        System.out.println("Your roll number is " + rollno);

        String name = in.next();
        System.out.println(name);

        float marks = in.nextFloat();
        System.out.println(marks);


        System.out.print("Please enter temp in C: ");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);


        // Type casting
        byte bt = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * bt) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * bt) + " " + (i / c) + " " + (d * s));
        System.out.println(result);


        // ── Assignment ────────────────────────────────────


        // Q.1
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        if(num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");

        }


        // Q.2
        System.out.print("Enter your name: ");
        String person = in.next();
        System.out.println("Good morning! " + person);


        // Q.3
        System.out.print("Enter Principal: ");
        double p = in.nextDouble();
        System.out.print("Enter Time: ");
        double t = in.nextDouble();
        System.out.print("Enter Rate: ");
        double r = in.nextDouble();
        double si = (p * t * r) / 100;
        System.out.println("Simple Interest = " + si);


        // Q.4
        System.out.print("Enter first number: ");
        System.out.print("Enter second number: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = in.next().charAt(0);

        if (op == '+'){
            System.out.println("Result = " + (a + b));
        } else if (op == '-'){
            System.out.println("Result = " + (a - b));
        } else if (op == '*'){
            System.out.println("Result = " + (a * b));
        } else if (op == '/'){
            System.out.println("Result = " + (a / b));
        } else {
            System.out.println("Invalid operator");
        }

        // Q.5
        System.out.print("Enter first number: ");
        int x = in.nextInt();
        System.out.print("Enter second number: ");
        int y = in.nextInt();
        if (x > y){
            System.out.println("Largest = " + x);
        } else {
            System.out.println("Largest = " + y);
        }


        // Q.6
        System.out.print("Enter amount in Rupees: ");
        double rupees = in.nextDouble();
        double usd = rupees / 83.0;  // Approx conversion rate
        System.out.println("USD = " + usd);


        // Q.7
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int first = 0, second = 1;
        System.out.print("Fibonacci: ");
        for (int k = 0; k < n; k++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
                       
        
        // Q.8
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        String reversed = "";
        for (int h = str.length() - 1; h >= 0; h--) {
            reversed += str.charAt(h);
        }
        if (str.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }

        in.close();
    }
}