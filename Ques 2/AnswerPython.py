#!/bin/python3

import sys
# d-day m-month n-n squares s-the integers
def solve(n, squares, d, m):
    result = int(0)
    if len(squares) == m:
        sum = int(0)
        for square in squares:
            sum += square
        if sum == d:
            result += 1
    else:   
        for index1 in range(0, len(squares)-m+1):
            sum = int(0)
            for index2 in range(index1, index1+m):
                sum += squares[index2]
            if sum == d:
                result += 1
    return result
    # Complete this function

n = int(input().strip())
s = list(map(int, input().strip().split(' ')))
d, m = input().strip().split(' ')
d, m = [int(d), int(m)]
result = solve(n, s, d, m)
print(result)
