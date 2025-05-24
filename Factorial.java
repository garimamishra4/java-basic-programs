public class Factorial {

    public static void main(String[] args) {
        int num = 5; // You can change this number to calculate the factorial of a different number
        long factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            return -1; // Factorial is not defined for negative numbers
        } else if (n == 0) {
            return 1; // Factorial of 0 is 1
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
