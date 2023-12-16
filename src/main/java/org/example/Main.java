package org.example;

import static org.example.QuickSorts.*;

public class Main {
// Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int N = arr.length;

        quickSortDutchFlag(arr, 0, N - 1);
        System.out.println("Sorted array:");
        printArr(arr);
    }
}