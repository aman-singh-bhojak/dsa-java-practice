// Topic: Conditionals and Loops + Calculator
// Date: 03 Feb 2026

import java.util.Scanner;

public class ConditionalsAndLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ── Lecture Code ──────────────────────────────────


        //1.CaseCheck
        System.out.print("Enter a character: ");
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }


        // 2.Largest
        System.out.println("Enter three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // int max = a;
        // if (b > max) {
        //     max = b;
        // }
        // if (c > max) {
        //     max = c;
        // }

        // int max = 0;
        // if (a > b) {
        //     max = a;
        // } else {
        //     max = b;
        // }

        // if (c > max) {
        //     max = c;
        // }

        int max = Math.max(c, Math.max(a, b));
        System.out.println("Largest number is: " + max);


        // 3.Reverse
        System.out.println("Reversing of number");
        int num = 123456;
        System.out.println("Before reversal: " + num);
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }

        System.out.println("Reversal of num: " + ans);

        // 4.CountNums
        System.out.println("Counting of number");
        int number = 45535;
        System.out.println("Given number: " + number);

        int counting = 0;
        while (number > 0) {
            int rem = number % 10;
            if (rem == 5) {
                counting++;
            }
            number = number / 10; // n /= 10
        }

        System.out.println("The total count of 5 is: " + counting);


        // ── Assignment ────────────────────────────────────

        // 1️.Fibonacci Series
        System.out.print("Enter n for Fibonacci: ");
        int nen = in.nextInt();
        int one = 0, two = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < nen; i++) {
            System.out.print(one + " ");
            int next = one + two;
            one = two;
            two = next;
        }

        // 2️.Factors of a number
        System.out.print("\n\nEnter number to find factors: ");
        int numerial = in.nextInt();
        System.out.print("Factors: ");
        for (int i = 1; i <= numerial; i++) {
            if (numerial % i == 0) {
                System.out.print(i + " ");
            }
        }

        // 3️.Sum till user enters 0
        int sum = 0;
        int input;
        System.out.println("\n\nEnter numbers to sum (0 to stop): ");
        while ((input = in.nextInt()) != 0) {
            sum += input;
        }
        System.out.println("Total Sum: " + sum);

        // 4️.Largest number till user enters 0
        int maximum = Integer.MIN_VALUE;
        System.out.println("\nEnter numbers to find largest (0 to stop): ");
        while ((input = in.nextInt()) != 0) {
            if (input > maximum) {
                max = input;
            }
        }
        System.out.println("Largest Number: " + maximum);

        // 5️.Armstrong Number
        System.out.print("\nEnter number to check Armstrong: ");
        int arm = in.nextInt();
        int temp = arm;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = arm;
        int armSum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            armSum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (armSum == arm) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong");
        }

        // 6️.Palindrome Number
        System.out.print("\nEnter number to check Palindrome: ");
        int pal = in.nextInt();
        int original = pal;
        int reverse = 0;

        while (pal > 0) {
            reverse = reverse * 10 + pal % 10;
            pal /= 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome");
        }

        // 7️.HCF and LCM
        System.out.print("\nEnter two numbers: ");
        int x = in.nextInt();
        int y = in.nextInt();

        int hcf = 1;

        for (int i = 1; i <= Math.min(x, y); i++) {
            if (x % i == 0 && y % i == 0) {
                hcf = i;
            }
        }

        int lcm = (x * y) / hcf;

        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);


        in.close();
    }
}
