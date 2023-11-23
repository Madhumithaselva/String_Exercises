package se.lexicon;

public class Ex7AppendingString {
    public static void main(String[] args){
        int number=20;
        String string=Integer.toString(number);
        System.out.println("Before appending:"+string);
        string=string+20;
        System.out.println("After appending:"+string);
    }
}
