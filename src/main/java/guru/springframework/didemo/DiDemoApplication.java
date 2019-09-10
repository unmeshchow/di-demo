package guru.springframework.didemo;

import guru.springframework.didemo.controllers.ConstructorInjectedController;
import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.controllers.PropertyInjectedController;
import guru.springframework.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");
        myController.hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello()); // since there is a single bean
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello()); // since there is a single bean
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello()); // since there is a single bean
    }

}
