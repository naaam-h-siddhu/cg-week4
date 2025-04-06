package annotation.practice.intermediate.maxlength;

public class Main {
    public static void main(String[] args) {
        try{
            User siddhu = new User("Siddhu");
            System.out.println("User 1 username: "+siddhu.getUsername());

            User siddhulong = new User("Sidddsdfsahusinghji");
            System.out.println("User 2 username "+siddhulong.getUsername());
        }catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

