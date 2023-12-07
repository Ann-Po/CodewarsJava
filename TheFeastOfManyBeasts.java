package CodewarsJava;

public class TheFeastOfManyBeasts {

    public static boolean feast(String beast, String dish) {
        boolean result = false;

        if (beast.charAt(0) == dish.charAt(0) &&
                beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1)) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(feast("Anni", "Aleksei"));
    }

}
