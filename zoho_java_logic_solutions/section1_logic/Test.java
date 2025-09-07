import java.util.Scanner;

public class Test {

    public static int isFunction(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;
        for (int num : arr) totalSum += num;

        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];

            if (leftSum == totalSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter a string: ");
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};

        System.out.println(isFunction(arr));
    }
}
