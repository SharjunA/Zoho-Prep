from collections import Counter

def print_repeated(s):
    counts = Counter(s)

    for i in counts:
        if counts[i] > 1:
            print(i)
    
print_repeated("programming")