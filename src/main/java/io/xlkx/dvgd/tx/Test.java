package io.xlkx.dvgd.tx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UserService userService = context.getBean(UserService.class);        
        userService.save();
        context.close();
    }
    
}
