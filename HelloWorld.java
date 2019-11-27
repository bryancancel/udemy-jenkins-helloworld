public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(HelloWorld.getMessage());
    }
    private static String getMessage(){
		String message = "-----***** Hello World & Welcome to Jenkins Training *****-----";
		message += "\nMade Some Changes";
        message += "\nMade Some More Changes";
        return message;
    }
}