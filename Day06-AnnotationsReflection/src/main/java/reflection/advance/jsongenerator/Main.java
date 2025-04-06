package reflection.advance.jsongenerator;

import reflection.advance.jsongenerator.Person;

public class Main {
    public static void main(String[] args) throws IllegalAccessException{
        Person person = new Person("Siddhu Singh",21, new Address("Bhopal",462021));
        System.out.println(JsonConverter.toJson(person));
    }
}
