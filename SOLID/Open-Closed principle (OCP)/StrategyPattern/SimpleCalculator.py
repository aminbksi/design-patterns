class SimpleCalculator:
    def __init__(self, strategy):
        self.strategy = strategy

    def operation(self, a, b):
        return self.strategy.execute(a, b)
