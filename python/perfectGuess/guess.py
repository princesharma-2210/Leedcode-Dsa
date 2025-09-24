import random
n= random.randint(0,100)
a=-1
guess_no=1
while(a!=n):
    a= int(input('Guess the number: '))
    if(a>n):
        print("Lower number pls")
    else:
        print("higher number pls")
    guess_no+=1
print(f"you have guessed the number {n} in {guess_no} attempts")