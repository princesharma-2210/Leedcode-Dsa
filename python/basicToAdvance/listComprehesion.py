myList= [1,23,4,5]
evenList = [value for index, value in enumerate(myList) if index % 2 == 0]
print(evenList)   