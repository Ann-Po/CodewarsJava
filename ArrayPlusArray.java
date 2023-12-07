package CodewarsJava;

public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int[] array1and2 = new int[arr1.length + arr2.length];
        int currentPosition = 0;

        for( int i = 0; i < arr1.length; i++) {
            array1and2[currentPosition] = arr1[i];
            currentPosition++;
        }

        for( int j = 0; j < arr2.length; j++) {
            array1and2[currentPosition] = arr2[j];
            currentPosition++;
        }
        int result = 0;
        for(int i = 0; i < array1and2.length; i++) {
            result += array1and2[i];
        }

        return result;

    }
}
