def factorial(n):
    return 1 if n <= 1 else n * factorial(n - 1)

print("Factorial of 5 is:", factorial(5))