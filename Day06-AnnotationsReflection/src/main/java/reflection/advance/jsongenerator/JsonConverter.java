package reflection.advance.jsongenerator;


import java.lang.reflect.Field;

public class JsonConverter {
    public static String toJson(Object obj) throws  IllegalAccessException{
        if(obj == null) return null;
        if(obj instanceof Number || obj instanceof Boolean) return obj.toString();
        if(obj instanceof String) return "\""+obj+"\"";

        StringBuilder json = new StringBuilder("{\n");
        Field[] fields = obj.getClass().getDeclaredFields();
        for(int i = 0;i<fields.length;i++){
            Field field = fields[i];
            field.setAccessible(true);
            String name = field.getName();
            Object value = field.get(obj);
            json.append("\"");
            json.append(name);
            json.append("\":");
            json.append(toJson(value));
            if(i < fields.length - 1 )
                json.append(", \n");

        }
        json.append("\n}");
        return json.toString();

    }
}
