package dependencyRunner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Browser;
import com.xworkz.Chrome;
import com.xworkz.FireBox;
import com.xworkz.Petrolbunk;
import com.xworkz.configuration.ConfigureAllComponent;

public class AllRunner {
	public static void main(String[] args) {
		ApplicationContext container =  new AnnotationConfigApplicationContext(ConfigureAllComponent.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		Petrolbunk pb = container.getBean(Petrolbunk.class);
		pb.purchase();
		
//		Browser b = container.getBean(Browser.class);
//		b.browse();
		
		Chrome c = container.getBean(Chrome.class);
		c.browse();
		
		FireBox f = container.getBean(FireBox.class);
		f.browse();
		
		
		
	}
}
