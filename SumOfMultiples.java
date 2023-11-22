/*Find the sum of all multiples of n below m

        Keep in Mind
        n and m are natural numbers (positive integers)
        m is excluded from the multiples
        Examples
        Kata.sumMul(2, 9)   ==> 2 + 4 + 6 + 8 = 20
        Kata.sumMul(3, 13)  ==> 3 + 6 + 9 + 12 = 30
        Kata.sumMul(4, 123) ==> 4 + 8 + 12 + ... = 1860
        Kata.sumMul(4, -7)  // throws IllegalArgumentException
*/


package CodewarsJava;

public class SumOfMultiples {
    public static long sumMul(int n, int m) {
        int result = 0;

        if (n <=0 || m <= 0) {
            throw new IllegalArgumentException();
        }
        
        for (int i = n; i < m; i += n) {
            result += i;
        }
        return result;
    }

    public static void main (String[] args) {
        System.out.println(sumMul(2, 9));
    }
}
