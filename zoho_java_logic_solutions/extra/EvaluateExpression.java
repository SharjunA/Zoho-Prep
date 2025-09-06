public class EvaluateExpression {
    public static int evaluate(String expr) {
        int n = (expr.length() + 1) / 2;  // Number of digits
        String digits = expr.substring(0, n);
        String operators = expr.substring(n);

        int result = digits.charAt(0) - '0';  // Convert char to int

        for (int i = 1; i < n; i++) {
            int num = digits.charAt(i) - '0';  // Convert char to int
            char op = operators.charAt(i - 1);

            switch (op) {
                case '+' -> result += num;
                case '-' -> result -= num;
                case '*' -> result *= num;
                case '/' -> result /= num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String expr = "12345*+-+";
        int result = evaluate(expr);
        System.out.println(result);  // Output: 6
    }
}
