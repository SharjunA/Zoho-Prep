mat = [[1,2,3],[4,5,6],[7,8,9]]
for i in range(len(mat)):
    row = mat[i] if i % 2 == 0 else mat[i][::-1]
    print(*row, end=' ')