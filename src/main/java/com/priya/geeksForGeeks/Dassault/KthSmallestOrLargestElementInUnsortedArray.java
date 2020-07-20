package main.java.com.priya.geeksForGeeks.Dassault;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestOrLargestElementInUnsortedArray {

    public static int KthSmallest(int[] arr, int k) {
        int temp;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[arr.length - k];
    }

    public static int KthLargest(int[] arr, int k) {
        int temp;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[arr.length - k];
    }

    public static int KthLargestLearning(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        int desiredIndex = arr.length - k + 1;
        for (int i = 0; i < arr.length; i++) {
            priorityQueue.add(arr[i]);
            if (i >= desiredIndex) {
                priorityQueue.poll();
            }
        }
        return priorityQueue.poll();

    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 2, 4, 5, 5, 5, 6};
        int k = 4;
        System.out.println(KthSmallest(arr, k));
        System.out.println(KthLargest(arr, k));
        System.out.println(KthLargestLearning(arr, k));
    }
}

