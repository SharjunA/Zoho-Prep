from collections import Counter
arr = [1,2,2,3,3,3,4]
freq = Counter(arr)
for k, v in freq.items():
    print(f"{k}: {v}")