public class ErrorLogger extends Logger{

    public ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(int logLevel, String message){
//        nextLogger

        if(logLevel == ERROR){
            System.out.println("ErrorLogger : "+message);
        }else{
            super.log(logLevel,message);
        }
    }
}
