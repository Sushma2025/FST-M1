numbers = list (input ("Enter sequence: ").split(","))
sum = 0

for number in numbers:
    sum += int(number)

print(sum)