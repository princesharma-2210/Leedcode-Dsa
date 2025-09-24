class python:
    a= 10
    b= 'ram'
    def funct(self):
        print(f"hey {self.b},score-> {self.a}")

    @staticmethod
    def method(name):
        print(f"hey john {name}")
    
bla=python()
bla.method()
bla.funct()