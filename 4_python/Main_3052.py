arr = []
for i in range(10) :
    n = int(input())
    arr.append(n%42)


sum = 0

for i in range (42) :
    if arr.count(i) != 0 :
        sum = sum + 1

print(sum)