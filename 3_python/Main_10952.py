import sys

while 1 : 
    A,B = map(int,sys.stdin.readline().split())
    if A==0 & B==0 : break
    print(A+B)