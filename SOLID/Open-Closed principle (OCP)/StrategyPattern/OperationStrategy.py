class OperationStrategy(ABC):
    @abstractmethod
    def execute(self, a, b):
        pass
