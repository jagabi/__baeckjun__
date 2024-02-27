arr = []
for i in range (30) :
    arr.append(i+1)
for i in range (28) :
    N = int(input())
    arr.remove(N)
print(arr[0],arr[1])