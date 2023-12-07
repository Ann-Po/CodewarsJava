package CodewarsJava;

/*
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
The output should be two capital letters with a dot separating them.
It should look like this:
Sam Harris => S.H
patrick feeney => P.F
 */

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String[] names = name.split(" ");
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }

/*
       public static String abbrevName(String name) {
        int index = name.indexOf(" ");
        String firstPart = name.substring(0, 1);
        String secondPart = name.substring(index+1, index+2);
        String result = firstPart + "." + secondPart;

        return result.toUpperCase();
  }
 */

    public static void main(String[] args) {
        System.out.print(abbrevName("John Smith"));
    }
}


