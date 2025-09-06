def is_safe(board, row, col, n):
    for i in range(row):
        if board[i][col] == 'Q': return False
    for i,j in zip(range(row-1,-1,-1), range(col-1,-1,-1)):
        if board[i][j] == 'Q': return False
    for i,j in zip(range(row-1,-1,-1), range(col+1,n)):
        if board[i][j] == 'Q': return False
    return True

def solve(board, row, n):
    global count
    if row == n:
        count += 1
        return
    for col in range(n):
        if is_safe(board, row, col, n):
            board[row][col] = 'Q'
            solve(board, row+1, n)
            board[row][col] = '.'

n = 4
board = [['.']*n for _ in range(n)]
count = 0
solve(board, 0, n)
print("Total solutions:", count)