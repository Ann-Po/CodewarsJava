package CodewarsJava;
/*
Create a function that will return a string that combines all of the letters of the three inputed strings in groups.
Taking the first letter of all of the inputs and grouping them next to each other.
Do this for every letter, see example below!
E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"
Note: You can expect all of the inputs to be the same length.
 */
public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        String result = "";
        for(int i = 0; i < one.length(); i++) {
            result += one.charAt(i);
            result += two.charAt(i);
            result += three.charAt(i);
        }
        return result;
    }



    public static void main(String[] args){
        System.out.println(tripleTrouble("aa", "bb", "cc"));
    }
}
