// Topic: Switch Statements + Nested Case
// Date: 04 Mar 2026

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // ── Lecture Code ──────────────────────────────────
        
        // Basic switch
        System.out.print("Enter a fruit: ");
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.print("King of fruits.");
                break;
    
            case "Apple":
                System.out.print("A sweet red fruit.");
                break;
            case "Orange":
                System.out.print("Round fruit.");
                break;
            case "Grapes":
                System.out.print("Small fruit.");
                break;
            default:
                System.out.print("Please enter a valid fruit.");
                break;
        }
        
        // Enhanced Switch
        System.out.print("\nEnter a number to get the day of it: ");
        int num = in.nextInt();
        switch (num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        // Switch with fall-through
        System.out.print("Enter a day to know whether it's weekend or weekday: ");
        String day = in.next();
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
        }

        
        // Nested Switch
        System.out.print("Enter empId and Department: ");
        int empId = in.nextInt();
        String deparment = in.next();
        
        switch (empId) {
            case 1:
                System.out.println("Aman Singh Bhojak");
                break;
            case 2:
                System.out.println("Amit Badana");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch (deparment) {
                    case "IT":
                        System.out.println("IT department.");
                        break;
                    case "Management":
                        System.out.println("Management Department.");
                        break;
                    default:
                        System.out.println("No department entered.");
                        break;
                    }
                    break;
            default:
                System.out.println("Enter correct empId");
                break;
        }

        in.close();
    }
}