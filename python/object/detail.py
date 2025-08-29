class Calculator:
    def __init__(self,val):
        self.val= val
    def square(self):
        print(f"{self.val**2}")
    def cube(self):
        print(f"{self.val**3}")
    def squareRoot(self):
        print(f"{self.val**0.5}")
        

p= Calculator(10)
# p.val= 3
p.square()
p.cube()
p.squareRoot()