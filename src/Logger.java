public class Logger {
    private Logger nextLogger;

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    public Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(int logLevel, String message){
//        nextLogger
        if(nextLogger!=null){
            nextLogger.log(logLevel,message);
        }
    }
}
