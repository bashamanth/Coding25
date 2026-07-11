package org.example.leetcode.strings;

public class ValidPalindrome125 {

    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));


    }

    private static boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;
        char[] stringChar = s.toCharArray();

        while (i < j) {

            if (!Character.isLetterOrDigit(stringChar[i] )) {
                i++;
            } else if(!Character.isLetterOrDigit(stringChar[j])) {
                j--;
            }
            else{ if (Character.toLowerCase(stringChar[i]) != Character.toLowerCase(stringChar[j])) {
                return false;
            }
                i++;
                j--;
            }

        }
        return true;

    }
}
