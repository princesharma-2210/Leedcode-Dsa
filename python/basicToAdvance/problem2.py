class Complex:
    def __init__(self,l,i):
        self.l= l
        self.i= i
    def __add__(self,c2):
        return Complex(self.l+c2.l,self.i+c2.i)
    
    def __mul__(self,c2):
        real_part= self.l*c2.l-self.i*c2.i
        imag_part= self.l*c2.i + self.i*c2.l
        return Complex(real_part,imag_part)

    def __str__(self):
        return f"{self.l} + {self.i}i"
    

a= Complex(1,3)
b= Complex(2,4)
print(a+b)
print(a*b)