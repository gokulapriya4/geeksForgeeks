package main.java.com.priya.geeksForGeeks.Dassault;

//https://www.geeksforgeeks.org/maximum-difference-between-two-elements/#:~:text=Given%20an%20array%20arr%5B%5D,is%20between%2010%20and%202.
public class MaxDifference {

    public void maxDifference(int[] arr) {
        int maxDiff = arr[1] - arr[0];
        int minElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - minElement > maxDiff)
                maxDiff = arr[i] - minElement;
            if (arr[i] < minElement)
                minElement = arr[i];
        }

        System.out.println(maxDiff);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 1, 6, 4, 8};
        MaxDifference obj = new MaxDifference();
        obj.maxDifference(arr);
    }
}
