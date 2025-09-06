def is_balanced(s):
    stack = []
    match = {')': '(', '}': '{', ']': '['}
    for c in s:
        if c in match.values(): stack.append(c)
        elif not stack or match[c] != stack.pop(): return False
    return not stack

print("Balanced" if is_balanced("{[()]}") else "Not Balanced")