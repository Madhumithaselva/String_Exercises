package se.lexicon;

public class Ex3Substring {
    public static void main(String[] args){
        //Creating a string with a value
        String string="Ok this is not as long!";
        //finding the position of Index
        int position=string.indexOf('n');
        //Getting the substring using index
        String substr=string.substring(position,string.length()-1);
        System.out.println(substr);
    }
}
