N,X = map(int,input().split())
n_list = list(map(int,input().split()))

for i in range(len(n_list)) :
    if n_list[i] < X :
        print(n_list[i],end=" ")