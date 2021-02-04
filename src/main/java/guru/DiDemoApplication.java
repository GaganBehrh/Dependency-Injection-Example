package guru;
import guru.controllers.ConstructorInjectedController;
import guru.controllers.MyController;
import guru.controllers.GetterInjectedController;
import guru.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.springframework","guru.controllers"})  // so now spring looks only into these packages
public class DiDemoApplication {
	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(DiDemoApplication.class, args);

		MyController controller=(MyController) ctx.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());;


	}

}
