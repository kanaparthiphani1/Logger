public class DebugLogger extends Logger{

    public DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(int logLevel, String message){
//        nextLogger

        if(logLevel == DEBUG){
            System.out.println("DebugLogger : "+message);
        }else{
            super.log(logLevel,message);
        }
    }
}
