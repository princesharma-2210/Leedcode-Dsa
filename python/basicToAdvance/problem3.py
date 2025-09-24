n= int(input("Enter the number-> "))

table= [i*n for i in range(1,11)]
print(table)
with open('tableProblem.txt','a') as f:
    f.write(f"table of {n}: {str(table)}\n")