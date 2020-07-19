package main.java.com.priya.geeksForGeeks.Dassault;

//https://www.geeksforgeeks.org/check-if-a-string-has-all-characters-with-same-frequency-with-one-variation-allowed/
public class StringSameFrequencyCharacters {

    public boolean hasSameFrequencyCharsWithOneVariation(String s) {
        char[] charFreq = new char[26];
        int firstVal = 0, secondVal = 0;

        for (int i = 0; i < s.length(); i++) {
            charFreq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < charFreq.length; i++) {
            if (charFreq[i] != 0) {
                if (firstVal == 0 || firstVal == charFreq[i]) {
                    firstVal = charFreq[i];
                } else if (secondVal == 0 && firstVal != charFreq[i]) {
                    secondVal = charFreq[i];
                } else {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        StringSameFrequencyCharacters obj = new StringSameFrequencyCharacters();
        System.out.println(obj.hasSameFrequencyCharsWithOneVariation("abbcca"));
    }
}
