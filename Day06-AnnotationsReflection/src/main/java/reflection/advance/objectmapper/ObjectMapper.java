package reflection.advance.objectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception{
        T instance = clazz.getDeclaredConstructor().newInstance();

        for(Map.Entry<String,Object> entry : properties.entrySet()){
            String key = entry.getKey();
            Object value = entry.getValue();
            try{
                Field field = clazz.getDeclaredField(key);
                field.setAccessible(true);
                field.set(instance,value);

            }catch (NoSuchFieldException e){
                System.out.println(e.getMessage());
            }catch (IllegalAccessException e){
                System.out.println("are bhai");
            }
        }
        return instance;

    }
}
