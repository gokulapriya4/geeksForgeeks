package main.java.com.priya.geeksForGeeks.Dassault;

import java.util.*;
import java.util.stream.Collectors;

//https://leetcode.com/problems/most-common-word/
public class MostCommonWord {

    class MapComparator implements Comparator<Map.Entry<String, Integer>> {

        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            return o1.getValue().compareTo(o2.getValue());
        }
    }

    public String mostCommonWord(String paragraph, String[] banned) {
        List<String> bannedList = Arrays.stream(banned).collect(Collectors.toList());

        paragraph = paragraph.toLowerCase().replaceAll("[^a-z0-9]", " ")
                .replaceAll(" +", " ");

        Map<String, Integer> collect = Arrays.stream(paragraph.split(" "))
                .filter(str -> !bannedList.contains(str))
                .collect(Collectors.toMap(str -> str, str -> 1, (oldVal, newVal) -> oldVal + 1));

        return Collections.max(new LinkedList<>(collect.entrySet()), Comparator.comparing(Map.Entry::getValue)).getKey();
    }

    public static void main(String[] args) {
        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned = {"a"};
        MostCommonWord obj = new MostCommonWord();
        System.out.println(obj.mostCommonWord(paragraph, banned));
    }
}
