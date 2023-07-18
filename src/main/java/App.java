import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld hwbean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean == hwbean2);
        Cat bean2 = (Cat) applicationContext.getBean("catBean", "kitty1","orange");
        System.out.println(bean2);
        Cat bean3 = (Cat) applicationContext.getBean("catBean", "kitty2","black and white");
        System.out.println(bean3);
        System.out.println(bean2==bean3);


    }
}