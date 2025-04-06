package annotation.practice.beginner.todo;

public class Project {
    @Todo(task = "Implement user authentication", assignedTo = "Siddhu", priority = "HIGH")
    public void implementAuthentication(){
        System.out.println("Implementing user auth...");
    }

    @Todo(task = "read the database", assignedTo = "Nitish")
    public void readDatabase(){
        System.out.println("Reading the database...");
    }

    @Todo(task = "Write backend code", assignedTo = "Sumit", priority = "LOW")
    public void writeBackend(){
        System.out.println("Writing BackEnd code ...");
    }
}
