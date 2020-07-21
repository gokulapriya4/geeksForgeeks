package main.java.com.priya.geeksForGeeks.Dassault;

public class SortArrayInWave {

    public static void waveForm(int[] arr) {
        boolean upWave = true;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((upWave && arr[i] < arr[i + 1]) || (!upWave && arr[i] > arr[i + 1])) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            upWave = !upWave;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 5, 10, 7, 20};
        waveForm(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
