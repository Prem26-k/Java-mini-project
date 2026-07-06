package Anagram;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine().toLowerCase();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine().toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] count = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        boolean isAnagram = true;

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

        sc.close();
    }
}