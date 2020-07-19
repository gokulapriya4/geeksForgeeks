package main.java.com.priya.geeksForGeeks.Dassault;

//https://www.geeksforgeeks.org/longest-common-substring-dp-29/
public class LongestCommonSubstring {

    public int longestCommonSubstring(String s1, String s2) {
        int maxength = 0, start = 0;

        for (int i = 0; i < s1.length() + 1; i++) {
            String substring = s1.substring(start, i);
            if (s2.contains(substring)) {
                maxength = substring.length() > maxength ? substring.length() : maxength;
            } else {
                start = i - 1;
            }
        }
        return maxength;
    }

    public static void main(String[] args) {
        String s1 = "abcdxyz";
        String s2 = "xyzabcdxabcdxyz";

        LongestCommonSubstring obj = new LongestCommonSubstring();
        System.out.println(obj.longestCommonSubstring(s1, s2));
    }
}
