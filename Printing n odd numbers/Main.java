num = int(input())
temp = 1
for i in range(1,num+1):
  if(temp%2 != 0):
    print(temp)
    temp = temp + 1
  temp = temp + 1