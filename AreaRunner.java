package area.all.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.areaconfig.AreaConfig;
import com.xworkz.things.Battery;
import com.xworkz.things.Camera;
import com.xworkz.things.CameraMan;
import com.xworkz.things.Director;
import com.xworkz.things.Experience;
import com.xworkz.things.Movie;
import com.xworkzz.Area;
import com.xworkzz.Company;
import com.xworkzz.Location;
import com.xworkzz.Producer;

public class AreaRunner {
	public static void main(String[] args) {
		
	ApplicationContext container = new AnnotationConfigApplicationContext(AreaConfig.class);
	System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
	System.out.println(container.getBeanDefinitionCount());
	
	
	System.out.println("==companay==");
	Location ref=container.getBean(Location.class);
	ref.show();
	
	System.out.println("==companay==");
	Company ref1=container.getBean(Company.class);
	ref1.show1();
	
	System.out.println("==producer==");
	Producer ref2=container.getBean(Producer.class);
	ref2.begin();
	
	System.out.println("==battery==");
	Battery ref3=container.getBean(Battery.class);
	ref3.see();
	
	System.out.println("==camera ==");
	Camera ref4=container.getBean(Camera.class);
	ref4.see();
	
	System.out.println("==camera man ==");
	CameraMan ref5=container.getBean(CameraMan.class);
	ref5.camMan();
	
	System.out.println("==experience==");
	Experience ref6=container.getBean(Experience.class);
	ref6.s();
	
	System.out.println("==director==");
	Director ref7=container.getBean(Director.class);
	ref7.dir();
	
	System.out.println("==director==");
	Movie ref8=container.getBean(Movie.class);
	ref8.movie();
	
	
	
	}
}
