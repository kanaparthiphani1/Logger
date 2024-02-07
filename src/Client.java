public class Client {
    public static void main(String[] args) {
        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
        logger.log(1,"This is Info Message");
        logger.log(2,"This is Debug Message");
        logger.log(3,"This is Error Message");
    }
}
