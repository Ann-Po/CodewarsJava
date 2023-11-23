package CodewarsJava;

public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }

    public static void main (String[] args) {
        System.out.println(findSmallestInt(new int[]{78, 56, 232, 12, 11, 43}));
    }
}
