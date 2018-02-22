#!/bin/python3

import sys

def getRecord(s):
    record_least = int(s[0])
    record_high = int(s[0])
    resulthigh = int(0)
    resultleast = int(0)
    result = []
    for score in s[1:len(s)]:
        if score > record_high:
            record_high = score
            resulthigh += 1
        elif score < record_least:
            record_least = score
            resultleast += 1
    result = [resulthigh, resultleast]
    return result
    # Complete this function

n = int(input().strip())
s = list(map(int, input().strip().split(' ')))
result = getRecord(s)
print (" ".join(map(str, result)))
