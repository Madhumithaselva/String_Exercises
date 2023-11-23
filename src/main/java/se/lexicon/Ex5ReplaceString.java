package se.lexicon;

public class Ex5ReplaceString {
    public static void main(String[] args){
        String string="Java is the worst programming language";
        System.out.println("Before Replacement:\n"+string);
        string=string.replace("worst","best");
        System.out.println("After Replacement:\n"+string);
    }
}
