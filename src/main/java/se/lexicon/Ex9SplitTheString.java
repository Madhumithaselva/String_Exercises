package se.lexicon;

public class Ex9SplitTheString {
    public static void main(String[] args){
        String string="Carl,Susie,Fredrick,Bob,Erik";
        String[] strArray=string.split(",");
        System.out.println("Names:");
        for (String name:strArray) {
            System.out.println(name);

        }

    }
}
