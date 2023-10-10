public class Solution {
    public static boolean isPrime(int num) {
        if(num == 1 || num == 0) {
            return false;
        }
        for (int i=2; i < num; i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main (String[] args) {
		System.out.println(Solution.isPrime(2));
        System.out.println(Solution.isPrime(0));
        System.out.println(Solution.isPrime(1));
        System.out.println(Solution.isPrime(31));

	}
}