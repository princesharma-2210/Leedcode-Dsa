from functools import reduce

l= [1,2,3,4,5,15]

# square= lambda x: x*x
# sqList= list(map(square,l))

# print(sqList)

# using filter
# def divisible(n):
#     if(n%5==0):
#         return True
#     return False

# f= list(filter(divisible,l))
# print(f)

# greater number in list  
def greater(a,b):
    if(a>b):
        return a
    return b

print(reduce(greater,l))