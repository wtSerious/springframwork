import com.wang.demo.config.Appconfig;
import com.wang.demo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		context.getBean("userService", UserService.class);
	}
}
