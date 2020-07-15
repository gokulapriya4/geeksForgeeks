package main.java.com.priya.geeksForGeeks.Accolite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/longest-prefix-suffix/0
public class LongestPrefixSuffix {

    public static int longestPrefixAndSuffix(StringBuilder s) {
        int start = 1, end = s.length() - 1, result = 0;
        while (start <= s.length() - 1) {
            if (s.indexOf(s.substring(0, start), end) != -1) {
                result = start;
            }
            start++;
            end--;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "nmn";
        Scanner scanner = new Scanner(System.in);
        int noOfInput = scanner.nextInt();
        List<StringBuilder> inputs = new ArrayList<>();
        for (int i = 0; i < noOfInput; i++) {
            inputs.add(new StringBuilder(scanner.next()));
        }
        inputs.stream().forEach(ele -> System.out.println(longestPrefixAndSuffix(ele)));
        longestPrefixAndSuffix(new StringBuilder(s));
    }
}
