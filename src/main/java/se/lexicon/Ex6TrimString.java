package se.lexicon;

public class Ex6TrimString {
    public static void main(String[] args){
        String string="\tJ\ta\tv\ta\t";
        System.out.println("Before Trimming: "+string);
        string=string.trim();
        System.out.println("After trimming : "+string);
    }
}
