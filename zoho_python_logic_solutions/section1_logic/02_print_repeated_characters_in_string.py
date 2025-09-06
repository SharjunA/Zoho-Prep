from collections import Counter

def print_repeated(s):
    counts = Counter(s)
    print(counts)
    for i in counts:
        if counts[i] > 1:
            print(i)
    # for c in s:
    #     if counts[c] > 1:
    #         print(c)
    #         counts[c] = 0
    # print(counts)
    
print_repeated("programming")