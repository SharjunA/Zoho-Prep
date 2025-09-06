
public class CountVowelsConsonantsDigitsSpaces {
    public static void main(String[] args) {
        String str = "Hello World 123";
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) digits++;
            else if (Character.isWhitespace(ch)) spaces++;
            else if ("aeiouAEIOU".indexOf(ch) != -1) vowels++;
            else if (Character.isLetter(ch)) consonants++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}