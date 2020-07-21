package main.java.com.priya.geeksForGeeks.Dassault;

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/removing-last-element-from-arraylist-in-java/
public class RemoveLastElementFromArrayList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(12);
        list.add(13);
        list.add(15);

        System.out.println("Before Remove");
        list.stream().forEach(ele -> System.out.println(ele));
        list.remove(list.size() - 1);
        System.out.println("After Remove");
        list.stream().forEach(ele -> System.out.println(ele));
    }
}
