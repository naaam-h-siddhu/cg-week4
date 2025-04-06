package annotation.practice.intermediate.maxlength;

import java.lang.reflect.Field;

public class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        validateUsernameLength(username);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    private void validateUsernameLength(String username){
        try{
            Class<?> userClass = this.getClass();
            Field usernameField = userClass.getField("username");
            if(usernameField.isAnnotationPresent(MaxLength.class)){
                MaxLength maxLength = usernameField.getAnnotation(MaxLength.class);
                if(username.length() > maxLength.value()){
                    throw new IllegalArgumentException("Username length exceeds the maximum");
                }
            }
        }catch (NoSuchFieldException e){
            e.printStackTrace();
        }
    }
}
