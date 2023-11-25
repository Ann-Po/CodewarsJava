package CodewarsJava;


/*
The code provided is supposed replace all the dots . in the specified String str with dashes -
But it's not working properly.
Task
Fix the bug so we can all go home early.
Notes
String str will never be null.
 */

public class ReplaceDots {
    public static String replaceDots(String str) {
        return str.replace(".", "-");
    }

    public static void main(String[] args) {
        System.out.println(replaceDots("one.two.three"));
    }
}
