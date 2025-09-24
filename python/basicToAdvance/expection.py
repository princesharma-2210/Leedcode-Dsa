# try:
#     a= int(input("Enter The Number: "))
#     print(a)
# except ValueError as v:
#     print("hlo")
#     print(v)
# except Exception as e:
#     print(e)

try:
    a= int(input("Enter first Number: "))
    b= int(input("Enter second number: "))
    if(b==0):
        raise ZeroDivisionError("b is divide by 0")
    print(a/b)

except Exception as e:
    print(e)

else:
    print("I am inside else")