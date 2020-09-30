n = int(input())
total = 0
while(n>0):
  remainder = int(n % 10)
  total += remainder
  n /= int(10)
print(total)