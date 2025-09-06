def print_pattern(n):
    for i in range(1, n + 1):
        spaces = ' ' * (n - i)
        inc_seq = ''.join(str(j) for j in range(1, i + 1))
        dec_seq = ''.join(str(j) for j in range(i - 1, 0, -1))
        print(spaces + inc_seq + dec_seq)

print_pattern(4)