N = int(input())
arr = list(map(float,input().split()))
m = max(arr)

for i in range(len(arr)) :
   if arr[i] < m : arr[i] = ((arr[i]/m)*100)
   else : arr[i] = 100

sum = 0

for i in range(len(arr)) : sum += arr[i]

avg = sum/len(arr)

print(avg)