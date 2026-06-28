package Leetcode.Recursion;

public class _1342_NumberOfStepsToReduceToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    static int numberOfSteps(int num) {
        return count(num, 0);
    }

    static int count(int num, int steps) {
        if (num == 0) {
            return steps;
        }

        if (num % 2 == 0) {
            return count(num/2, steps+1);
        }
        return count(num-1, steps+1);
    }

}
