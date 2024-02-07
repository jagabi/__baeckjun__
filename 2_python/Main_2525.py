hour,min = map(int,input().split())
work_min = int(input())

total_min = hour*60 + min + work_min

if total_min<1440 :
    print((total_min//60),(total_min%60))

else :
    print(((total_min-1440)//60),(total_min%60))