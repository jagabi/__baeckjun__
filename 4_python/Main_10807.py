import sys

N = int(sys.stdin.readline())


n_list = list(map(int,sys.stdin.readline().split()))

K = int(sys.stdin.readline())

print(n_list.count(K))