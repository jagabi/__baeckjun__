hour,min = map(int,input().split())

hour=hour
min=min-45

if min>=0 : 
    print(hour,min)
else : 
    hour=hour-1
    min=min+60
    if hour>=0 :
        print(hour,min)
    else :
        hour = hour + 24
        print(hour,min)