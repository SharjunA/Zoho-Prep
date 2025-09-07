arr = [5, 1, 4, 2, 8]

for i in range(len(arr)):
    swapped = False
    for j in range(0, len(arr)-i-1):
        if arr[j] > arr[j+1]:
            arr[j], arr[j+1] = arr[j+1], arr[j]
            swapped = True
    if not swapped:
        break
    
print(arr)