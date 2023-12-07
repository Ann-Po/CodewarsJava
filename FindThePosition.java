package CodewarsJava;
/*
When provided with a letter, return its position in the alphabet.
Input :: "a"
Ouput :: "Position of alphabet: 1"
 */

public class FindThePosition {

    public static String position(char alphabet)
    {
        int yourCharInt = (int)alphabet - (int)'a' + 1;
        return "Position of alphabet: " + yourCharInt;
    }


    public static void main(String[] args) {
        System.out.println(position('b'));
    }
}
