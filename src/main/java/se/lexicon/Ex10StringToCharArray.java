package se.lexicon;

public class Ex10StringToCharArray {
    public static void main(String[] args){
        String string="ThisShouldBeConverted";
        char[] charArray=string.toCharArray();
        System.out.println("Character array elements:");
        for (char ch:charArray) {
            System.out.println(ch);
            
        }


    }
}
