package reflection.advance.customproxy;

public class Greet implements  Greeting{
    @Override
    public String sayHello(String name){
        return "Hello, "+name+"!";
    }
}
