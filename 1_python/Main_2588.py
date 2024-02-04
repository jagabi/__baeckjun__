A=int(input())
B=[int(digit) for digit in str(input())]

print((A*B[-1]))
print((A*B[-2]))
print((A*B[-3]))
print((A*B[-1]) + 10*(A*B[-2]) + 100*(A*B[-3]))