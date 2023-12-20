class FileLoggerFactory(LoggerFactory):

    def create_logger(self):
        return FileLogger()
