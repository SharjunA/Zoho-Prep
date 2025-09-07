def add_digits(n):
    if n == 0:
        return 0
    return 1 + (n - 1) % 9
n = 987
print(add_digits(n)) 
