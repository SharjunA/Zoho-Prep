public class SumOfDigitsUntilSingleDigit {
    public static void main(String[] args) {
        int num = 9875;
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        System.out.println("Result: " + num);
    }
}