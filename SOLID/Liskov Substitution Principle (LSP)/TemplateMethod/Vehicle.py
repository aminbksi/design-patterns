class Vehicle:
    def operateVehicle(self):
        self.startEngine()
        self.move()
        self.stopEngine()

    def startEngine(self):
        print("Starting engine")

    def move(self):
        print("Moving")

    def stopEngine(self):
        print("Stopping engine")
