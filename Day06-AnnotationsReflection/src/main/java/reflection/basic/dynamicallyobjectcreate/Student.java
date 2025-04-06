package reflection.basic.dynamicallyobjectcreate;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void getDetails(){
        System.out.println("Name : "+name+" | age : "+age);
    }
}
