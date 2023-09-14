/*
 * Write a program to find the number of vowels in the given String using exception
handling.
 */


package assignment_no_11;

public class count_of_vowels_by_using_try_and_catch_block {

	public static void main(String[] args) {
	    try {
            String inputString = "Hello, World!"; 
            int vowelCount = 0;

            for (int i = 0; i < inputString.length(); i++) {
                char ch = inputString.charAt(i);
                if (isVowel(ch)) {
                    vowelCount++;
                }
            }

            System.out.println("Number of vowels in the string: " + vowelCount);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); 
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
