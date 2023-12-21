
public interface LogHandler {
    void handleLogMessages(String message, int level);
    void setNextHandler(LogHandler nextHandler);
}

public class InfoLogHandler implements LogHandler {
    private LogHandler nextHandler;

    @Override
    public void handleLogMessages(String message, int level) {
        if (level == 1) {
            System.out.println("Info: " + message);
        } else {
            this.nextHandler.handleLogMessages(message, level);
        }
    }

    @Override
    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

public class WarningLogHandler implements LogHandler {
    private LogHandler nextHandler;

    @Override
    public void handleLogMessages(String message, int level) {
        if (level == 2) {
            System.out.println("Warning: " + message);
        } else {
            this.nextHandler.handleLogMessages(message, level);
        }
    }

    @Override
    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

public class ErrorLogHandler implements LogHandler {
    private LogHandler nextHandler;

    @Override
    public void handleLogMessages(String message, int level) {
        if (level == 3) {
            System.out.println("Error: " + message);
        } else {
            this.nextHandler.handleLogMessages(message, level);
        }
    }

    @Override
    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

public class Main {
    public static void main(String[] args) {
        LogHandler infoLogHandler = new InfoLogHandler();
        LogHandler warningLogHandler = new WarningLogHandler();
        LogHandler errorLogHandler = new ErrorLogHandler();

        infoLogHandler.setNextHandler(warningLogHandler);
        warningLogHandler.setNextHandler(errorLogHandler);

        infoLogHandler.handleLogMessages("This is an info message", 1);
        infoLogHandler.handleLogMessages("This is a warning message", 2);
        infoLogHandler.handleLogMessages("This is an error message", 3);
    }
}
