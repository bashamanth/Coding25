package org.example.crackingcodinginterview.arraysstrings;

public class OneAway {

    public static void main(String[] args) {
        System.out.println(OneAway.oneAway("thast","fast"));
    }

    private static boolean oneAway(String s1, String s2) {
        if(s1.length()==s2.length()){
            return checkOneReplaceAway(s1,s2);
        } else if (s1.length()+1==s2.length()) {
            return checkOneInsertAway(s2,s1);
        }
        else if (s1.length()==s2.length()+1){
            return checkOneInsertAway(s1,s2);
        }
        return false;
    }

    private static boolean checkOneInsertAway(String s1, String s2) {
        char[] string1Char = s1.toCharArray();
        char[] string2Char = s2.toCharArray();
        int string1Pointer = 0, string2Pointer = 0;
        boolean oneInsertAway = false;

        while (string1Pointer < string1Char.length && string2Pointer<string2Char.length) {
            if(string1Char[string1Pointer]==string2Char[string2Pointer]){
                string1Pointer++;
                string2Pointer++;
            }
            else{
                if(oneInsertAway){
                    return false;
                }
                oneInsertAway= true;
                string1Pointer++;
            }
        }
        return true;
    }

    private static boolean checkOneReplaceAway(String s1, String s2) {
        char[] string1Char = s1.toCharArray();
        char[] string2Char = s2.toCharArray();
        int string1Pointer = 0, string2Pointer = 0;
        boolean oneReplaceAway = false;

        for (int i = 0; i < string1Char.length; i++) {
            if(string1Char[i]!=string2Char[i]){
                if(oneReplaceAway)
                    return false;
                oneReplaceAway=true;

            }
        }
        return true;
    }

}
