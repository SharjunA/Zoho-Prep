def evaluate_expression(expr):
    n = (len(expr) + 1) // 2  # number of digits
    digits = expr[:n]
    operators = expr[n:]

    result = int(digits[0])

    for i in range(1, n):
        num = int(digits[i])
        op = operators[i - 1]

        if op == '+':
            result += num
        elif op == '-':
            result -= num
        elif op == '*':
            result *= num
        elif op == '/':
            result = int(result / num)

    return result

# Test
print(evaluate_expression("12345*+-+"))  # Output: 6
