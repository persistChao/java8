package com.answer.reflect;

/**
 * @descreption
 * @Author answer
 * @Date 2019/1/25 15 45
 */
public class PasswordUtils {
    @Decription(id = "1" , description = "Passwords must contain at least one numeric")
    public boolean voliadatePassword(String password){
        return (password.matches("\\w*\\d\\w*"));
    }

    @Decription(id ="48")
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }
}
