class LoggerFactory(ABC):

    @abstractmethod
    def create_logger(self):
        pass
