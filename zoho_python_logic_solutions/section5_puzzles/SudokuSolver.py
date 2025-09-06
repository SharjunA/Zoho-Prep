N = 9
def isSafe(grid, row, col, num):
    for x in range(N):
        if grid[row][x] == num or grid[x][col] == num or grid[row-row%3+x//3][col-col%3+x%3] == num:
            return False
    return True

def solveSudoku(grid, row, col):
    if row == N - 1 and col == N: return True
    if col == N: row, col = row+1, 0
    if grid[row][col] != 0: return solveSudoku(grid, row, col+1)
    for num in range(1, N+1):
        if isSafe(grid, row, col, num):
            grid[row][col] = num
            if solveSudoku(grid, row, col+1): return True
            grid[row][col] = 0
    return False

grid = [[0]*9 for _ in range(9)] # Add test grid here
print("Solved!" if solveSudoku(grid,0,0) else "No solution")