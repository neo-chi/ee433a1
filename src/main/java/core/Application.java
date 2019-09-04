package core;

public class Application {

    public static void main(String... args) 
    {
        Controller controller = new Controller();
        controller.handleRequest(args[0], args[1], args[2]); // args[2] will need to be handled dynamically
    }
}
