N,M = map(int,input().split())


arr = []

for i in range(N) :
    arr.append(i+1)

for i in range(M) :
    A,B = map(int,input().split())
    for j in range(int((B-A+1)/2)) :
        temp = arr[B-1-j]
        arr[B-1-j] = arr[A-1+j]
        arr[A-1+j] = temp

for i in range(len(arr)) :
    print(arr[i],end= " ")