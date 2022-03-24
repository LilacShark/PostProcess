package sia.example.chapter3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Rabbit rabbit = (Rabbit) context.getBean("bugs");
        System.out.println(rabbit.getDescription());
    }



}
