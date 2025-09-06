def count_all(s):
    v = c = d = sp = 0
    for ch in s:
        if ch.isdigit(): d += 1
        elif ch.isspace(): sp += 1
        elif ch.lower() in 'aeiou': v += 1
        elif ch.isalpha(): c += 1
    print(f"Vowels: {v}\nConsonants: {c}\nDigits: {d}\nSpaces: {sp}")

count_all("Hello World 123")