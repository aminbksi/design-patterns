class DatabaseLogger(Logger):
    @abstractmethod
    def log(self):
        pass
