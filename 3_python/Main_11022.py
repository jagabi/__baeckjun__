import sys

N = int(sys.stdin.readline())

for i in range (N) :
    A,B = map(int, sys.stdin.readline().split())
    print("Case #",end = "")
    print(i+1,end = "")
    print(":",A,"+",B,"=",A+B)