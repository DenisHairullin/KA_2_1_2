import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld secondBean = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat cat = applicationContext.getBean("cat", Cat.class);
        Cat secondCat = applicationContext.getBean("cat", Cat.class);

        System.out.println(bean.getMessage());
        System.out.println(cat.getMessage());

        System.out.println("(bean == secondBean) = " + (bean == secondBean));
        System.out.println("(cat == secondCat) = " + (cat == secondCat));
    }
}