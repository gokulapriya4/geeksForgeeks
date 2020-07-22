package main.java.com.priya.geeksForGeeks.Dassault;

import java.util.LinkedList;
import java.util.Queue;

public class OperatorPreceedence {

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = ++x * y--;

        System.out.println(z);
        System.out.println("1 + 2 = " + 1 + 2);
        System.out.println("1 + 2 = " + 1 * 2);
        System.out.println(2 + 3 + "5");
        Queue<String> que = new LinkedList<>();
    }

}
