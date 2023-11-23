package se.lexicon;

public class Ex8StringArray {
    public static void main(String[] args){
        String string="Oil and water";
        System.out.println("Original string:"+string);
         //Create a string array
        String[] strArray=string.split(" ");

        System.out.println("Words:");
        for (String string1:strArray){
            System.out.println(string1);
        }

    }
}
