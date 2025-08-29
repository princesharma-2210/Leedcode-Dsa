class Employee:
    language= "pyhton"
    salary= 1000000

    def __init__(self,name,language,salary):# dunder method which is automatically called
        self.name= name
        self.language= language
        self.salary= salary
        print("I am a contructor")

    def getInfo(self):
        print(f"print something.. {self.language} and {self.salary}")

    @staticmethod
    def greet():
        print("jai shree ram")

prince= Employee("prince","javascript","4000000")
# by default it define
# Employee.getInfo(prince) so use self in function
#prince.salary= 2000000  #instance valance created
# Employee.getInfo(prince)
prince.getInfo()
prince.greet()
print(prince.language,prince.salary)