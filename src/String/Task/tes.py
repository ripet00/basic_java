string1 = input("Enter the string : ")
length = len(string1)
for i in range (length):
    for j in range(length-i-1):
        print(" ", end=" ")
    for j in range(i+1):
        print(string1[j], end=" ")
    print()