package reflection.intermediate.annotationsatruntime;

@Author(name = "Siddhu")
public class Book {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Book(String title) {
        this.title = title;
    }
}
