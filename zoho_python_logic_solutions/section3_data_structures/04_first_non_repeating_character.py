from collections import OrderedDict

def first_non_repeating(s):
    counts = OrderedDict()
    for ch in s:
        counts[ch] = counts.get(ch, 0) + 1
    for ch in counts:
        if counts[ch] == 1:
            return ch
    return None

print("First non-repeating:", first_non_repeating("swiss"))