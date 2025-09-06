def permute(s, ans=""):
    if not s:
        print(ans)
        return
    for i in range(len(s)):
        permute(s[:i] + s[i+1:], ans + s[i])

permute("abc")