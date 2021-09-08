from car import Car

class UberBlack(Car):
    typerCarAccepted = []
    seatsMaterial    = []

    def __init__(self, licence, driver, typeCarAccepted, seatsMaterial):
        super().__init__(licence, driver)
        self.typerCarAccepted = typeCarAccepted
        self.seatsMaterial = seatsMaterial