package reflection.intermediate.annotationsatruntime;


import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        try{
            Class<?> cls = Book.class;
            Annotation[] annotations = cls.getAnnotations();
            for(Annotation annotation : annotations){
                if(annotation instanceof Author){
                    Author author = (Author) annotation;
                    System.out.println("Author : "+author.name());
                }
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
