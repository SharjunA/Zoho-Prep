public class JosephusProblem {
    static int josephus(int n, int k) {
        if (n == 1) return 0;
        return (josephus(n - 1, k) + k) % n;
    }
    public static void main(String[] args) {
        int n = 7, k = 3;
        System.out.println("Survivor: " + (josephus(n, k) + 1));
    }
}