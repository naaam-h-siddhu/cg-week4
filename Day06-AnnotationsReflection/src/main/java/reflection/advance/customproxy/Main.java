package reflection.advance.customproxy;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greet();
        Greeting proxy = (Greeting) LoggingProxy.createProxy(greeting);
        String result = proxy.sayHello("siddhu");
        System.out.println(result);
    }
}
