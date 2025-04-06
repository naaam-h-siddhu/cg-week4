package reflection.intermediate.staticfields;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception{
        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);
        field.set(null, "gasga@#fafda");
        System.out.println(field.get(null));
    }
}
