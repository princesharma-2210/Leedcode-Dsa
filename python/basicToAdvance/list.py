# list= ['ram',2,3,10,3,3]
# list.remove(3) #phela index btayega
# print(list)

# take 7 input from user and append them into list
list=[]
for i in range(0,7):
    inp=input(f"Enter the {i+1} list item in list: ")
    list.append(inp)

print(list)