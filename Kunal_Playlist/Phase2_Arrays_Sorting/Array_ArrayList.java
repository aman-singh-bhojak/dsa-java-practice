package Kunal_Playlist.Phase2_Arrays_Sorting;
// Topic: Arrays and ArrayList
// Date: 05-06 Mar 2026

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Array_ArrayList {

    // Lecture Methods:

    // 1.Passing function:
    static void change(int[] arr) {
        arr[0] = 99;
    }

    // 2.Swapping
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // 3.Reverse
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // 4.Maximum value:
    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        // ── Arrays ────────────────────────────────────────────────────────────────────────

        // 1. Syntax of array:
        // datatype[] variable_name = new datatype[size];

        // Declaration of array
        int rollno[];

        // Initialization of array
        rollno = new int[10];

        // 2. array of primitives (Creating a int array)

        int[] arr = new int[5];
        arr[0] = 332;
        arr[1] = 74;
        arr[2] = 13;
        arr[3] = 97867;
        arr[4] = 867;

        // this will print the fourth element
        System.out.print("Fourth element: ");
        System.out.println(arr[3]);

        int[] arr2 = new int[5];

        // input using for loops
        System.out.println("Enter integer values: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = in.nextInt();
        }

        // array of objects
        System.out.println("Enter Strings: ");
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println("String array: " + Arrays.toString(str));

        // modify the element of the array
        str[1] = "Aman";

        System.out.println("Array after changing second element: " + Arrays.toString(str));

        // 3. Passing args
        int[] nums = {0, 22, 44, 66, 88};
        System.out.print("Array before: ");
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.print("Array after: ");
        System.out.println(Arrays.toString(nums));


        // [332, 74, 13, 97867, 867], this is the array to is going to be reversed and the element are going to swap with each other 
        // 4. Swapping of array
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));

        // 5. Reversal of array
        reverse(arr);
        System.out.println("Reversal of array: " + Arrays.toString(arr));

        // 6.Maximum values:
        int[] n = {21,323,23,867,95,67};
        int maximum = max(n);
        System.out.println("The max element is: " + maximum);

        // 7. Multi-Array
        int[][] multiarr = new int[3][3];
        System.out.println(multiarr.length); // number of rows

        // Input
        for (int row = 0; row < multiarr.length; row++) {
            for (int col = 0; col < multiarr[row].length; col++) {
                multiarr[row][col] = in.nextInt();
            }
        }

        // Output
        for (int[] a : multiarr) {
            System.out.println(Arrays.toString(a));
        }



        // ── ArrayLists ────────────────────────────────────────────────────────────────────────

        //1. Code-I
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialize
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Adding elemets:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);

        // 2. Code-II
        ArrayList<Integer> capacity = new ArrayList<>(5);
        // input
        for (int i = 0; i < 5; i++) {
            capacity.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(capacity.get(i)); // passing index here, capacity[index] syntax will not work here
        }

        System.out.println(capacity);



        // ── Assignments ───────────────────────────────────────────────────────────────────
        // See Leetcode/01_Arrays/ for all assignment solutions

        in.close();
    }
}