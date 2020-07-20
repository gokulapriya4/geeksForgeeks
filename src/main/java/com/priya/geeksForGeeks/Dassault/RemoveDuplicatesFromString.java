package main.java.com.priya.geeksForGeeks.Dassault;

//https://www.geeksforgeeks.org/remove-duplicates-from-a-given-string/
public class RemoveDuplicatesFromString {

    public static String removeDuplicates(String s) {
        char[] arr = new char[255];
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (arr[sb.charAt(i)] != 0) {
                sb.deleteCharAt(i);
                i--;
            } else {
                arr[sb.charAt(i)]++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks"; //geksfor
        System.out.println(removeDuplicates(s));
    }
}
