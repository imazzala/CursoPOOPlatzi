from car import Car
from account import Account
from uberX import UberX

if __name__ == "__main__":
    print("Hello World")

    car = Car("AMS123", Account("Andres Herrera", "AND789"))
    print(vars(car))
    print(vars(car.driver))
    