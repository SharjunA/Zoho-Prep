def is_pangram(s):
    s = s.lower()
    return all(chr(c) in s for c in range(ord('a'), ord('z')+1))
    #return len(set(filter(str.isalpha, s.lower()))) == 26

print("Pangram" if is_pangram("The quick brown fox jumps over the lazy dog") else "Not Pangram")

# A string is a pangram if it contains all 26 letters.