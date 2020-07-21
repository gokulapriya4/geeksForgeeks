package main.java.com.priya.geeksForGeeks.Dassault;

//https://leetcode.com/problems/rotate-string/
public class RotateString {

    public static boolean rotateString(String A, String B) {
        if (A.length() != B.length())
            return false;

        if (A.equals(B) && B.equals(""))
            return true;

        boolean found = false;
        for (int i = 0; i < A.length(); i++) {
            if ((A.substring(i + 1) + A.substring(0, i + 1)).equals(B)) {
                found = true;
                break;
            }
        }
        return found;
    }


    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cab";

        System.out.println(rotateString(s1, s2));
    }

}
