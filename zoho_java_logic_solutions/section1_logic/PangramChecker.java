// A string is a pangram if it contains all 26 letters.

public class PangramChecker {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog".toLowerCase();
        boolean[] present = new boolean[26];
        for (char c : str.toCharArray())
            if (Character.isLetter(c)) present[c - 'a'] = true;
        for (boolean b : present) {
            if (!b) {
                System.out.println("Not Pangram");
                return;
            }
        }
        System.out.println("Pangram");
    }
}