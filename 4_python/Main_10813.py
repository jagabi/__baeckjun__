N,M = map(int, input().split())
arr = []
for i in range(N) :
    arr.append(i+1)


for i in range(M) :
    A,B = map(int, input().split())
    x = arr[A-1]
    y = arr[B-1]

    arr[A-1] = y
    arr[B-1] = x

for i in range(len(arr)) :
    print(arr[i],end = " ")
    

