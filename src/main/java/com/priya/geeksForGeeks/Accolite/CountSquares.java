package main.java.com.priya.geeksForGeeks.Accolite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/count-squares/0
public class CountSquares {

    public static int countSquares(int n) {
        int i;
        for (i = 1; i < n; i++) {
            if (i * i >= n) {
                break;
            }
        }
        return i - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfInput = scanner.nextInt();
        List<Integer> inputs = new ArrayList<>();
        for (int i = 0; i < noOfInput; i++) {
            System.out.println("Input");
            int read = scanner.nextInt();
            inputs.add(read);
        }
        inputs.stream().forEach(ele -> System.out.println(countSquares(ele)));
    }
}
