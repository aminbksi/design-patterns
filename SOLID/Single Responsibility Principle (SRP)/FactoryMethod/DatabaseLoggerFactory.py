class DatabaseLoggerFactory(LoggerFactory):

    def create_logger(self):
        return DatabaseLogger()