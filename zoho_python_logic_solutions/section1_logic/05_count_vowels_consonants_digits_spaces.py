from collections import Counter

def count_all(s):
    c = Counter()

    for ch in s:
        if ch.isdigit():
            c['digits'] += 1
        elif ch.isspace():
            c['spaces'] += 1
        elif ch.lower() in 'aeiouAEIOU':
            c['vowels'] += 1
        elif ch.isalpha():
            c['consonants'] += 1

    print(f"Vowels: {c['vowels']}")
    print(f"Consonants: {c['consonants']}")
    print(f"Digits: {c['digits']}")
    print(f"Spaces: {c['spaces']}")

# Example
count_all("Hello World 123")
