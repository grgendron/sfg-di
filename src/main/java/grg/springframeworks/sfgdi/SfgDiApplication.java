package grg.springframeworks.sfgdi;

import grg.springframeworks.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println("from main: " + myController.getHello());
        /*
            1. MyController gets created because of @Controller
            2. We do not have a proper view.
            3. So we only monitor the console logging done by main()
            4. We cannot connect at all with a browser at this point.
            5. When the app runs it simply exits after performing the logging.
            6. Because there is no web dependency in pom yet, there is no web-server starting
         */
    }

}
