public class InfoLogger extends Logger{

    public InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(int logLevel, String message){
//        nextLogger

        if(logLevel == INFO){
            System.out.println("InfoLogger : "+message);
        }else{
            super.log(logLevel,message);
        }
    }
}
