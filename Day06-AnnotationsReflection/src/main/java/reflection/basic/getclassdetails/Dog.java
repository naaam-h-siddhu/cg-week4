package reflection.basic.getclassdetails;

public class Dog {
    private String name;
    private String breed;

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}
