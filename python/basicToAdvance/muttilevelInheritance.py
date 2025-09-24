class Animal:
    pass
class Pets(Animal):
    pass


class Dog(Pets):
    @staticmethod
    def Bark():
        print("bow bow!")

d= Dog()
d.Bark()