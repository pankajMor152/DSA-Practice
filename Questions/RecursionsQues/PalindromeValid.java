package RecursionsQues;

//  A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
//  and removing all non-alphanumeric characters, it reads the same forward and backward.
//  Alphanumeric characters include letters and numbers.
//  Given a string s, return true if it is a palindrome, or false otherwise.

public class PalindromeValid {
    public static void main(String[] args){
        System.out.println(isPalindrome("0P"));
    }
    public static boolean isPalindrome(String s) {
        String newStr = "";
        String revStr = "";
        int length = s.length();
        int index = 0;
        newStr = getAlphaString(s, newStr, length, index);
        int newStrLength = newStr.length()-1;
        revStr = getReverseString(newStr, revStr, newStrLength);
        if(newStr.equals(revStr)){
            return true;
        }
        return false;


    }
    private static String getAlphaString(String s, String newStr, int length, int index){
        if(index == length){
            return newStr;
        }
        char temp = s.charAt(index);
        if(Character.isLetter(temp)){
            newStr += Character.toString(temp).toLowerCase();
        }
        index++;
        newStr = getAlphaString(s, newStr, length, index);
        return newStr;
    }
    private static String getReverseString(String newStr, String revStr, int length){
        if(length < 0){
            return revStr;
        }
        revStr += newStr.charAt(length);
        length--;
        revStr = getReverseString(newStr, revStr, length);
        return revStr;
    }

}
