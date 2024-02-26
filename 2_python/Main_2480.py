A,B,C = map(int,input().split())
max = max(A,B,C)


if A==B & B==C & C==A : print(10000+A*1000)
elif A==B & B!=C & C!=A : print(1000+A*100)
elif A!=B & B==C & C!=A : print(1000+B*100)
elif A!=B & B!=C & C==A : print(1000+C*100)
elif A!=B & B!=C & C!=A : print(100*max)