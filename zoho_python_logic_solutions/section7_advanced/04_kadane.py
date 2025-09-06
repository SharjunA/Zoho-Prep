def max_subarray(a):
    cur = max_so_far = a[0]
    for x in a[1:]:
        cur = max(x, cur + x)
        max_so_far = max(max_so_far, cur)
    return max_so_far
print(max_subarray([-2,1,-3,4,-1,2,1,-5,4]))
