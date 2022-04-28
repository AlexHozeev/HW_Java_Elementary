package alex.homework9;

class FibonacciNumber {
    public static void main(String[] args)   //for example
     {
        int n = 19;
        System.out.println("Sum of Fibonacci numbers is : "+ calculateSum(n));
    }


    private static int calculateSum(int n) {
        if (n <= 0)
            return 0;
        int value[] = new int[n + 1];
        value[0] = 0;
        value[1] = 1;
        int sum = value[0] + value[1];
        for (int i = 2; i <= n; i++) {
            value[i] = value[i - 1] + value[i - 2];
            sum = value[i];
        }
        return sum;
    }
}

