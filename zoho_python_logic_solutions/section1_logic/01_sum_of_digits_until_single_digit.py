def sum_of_digits(n):
    while n >= 10:
        n = sum(map(int, str(n)))
    return n

print("Result:", sum_of_digits(9875))

# 9875 → 9+8+7+5=29 → 2+9=11 → 1+1=2