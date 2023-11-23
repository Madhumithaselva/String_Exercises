package se.lexicon;

public class StringLength {
    public static void main(String[] args) {
        String str="Java";
        int strLength=str.length();
        System.out.println("Length of the given string(Java) is "+strLength);

        //Code to find the index value from a string
        str="Long example sentence";
       // strLength=str.length();
        System.out.println("New string is :"+str);
        System.out.println("Character at index position 6 in new string is :"+str.charAt(6));
    }
}