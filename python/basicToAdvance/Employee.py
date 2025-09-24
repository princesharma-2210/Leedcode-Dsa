class Employee:
    salary= 234
    increment= 20
    # def __init__
    def get_salary(self,salary):
        return salary

    @property
    def salaryAfterIncrement(self):
        return self.salary+ (self.salary*self.increment/100)
    
    @salaryAfterIncrement.setter
    def salaryAfterIncrement(self,salary):
        self.increment= ((salary/self.salary)-1)*100
e= Employee()
# print(e.get_salary(1000000))
e.salaryAfterIncrement= 300
print(e.salaryAfterIncrement)
print(e.increment)
