def find_equilibrium_index(arr):
    total_sum = sum(arr)
    left_sum = 0

    for i, num in enumerate(arr): # i -> index, num -> value
        total_sum -= num  # Now total_sum is right sum
        if left_sum == total_sum:
            return i
        left_sum += num

    return -1  # No equilibrium index found

# Example:
arr = [-7, 1, 5, 2, -4, 3, 0]
print(find_equilibrium_index(arr))  # Output: 3 (index 3 is equilibrium)
