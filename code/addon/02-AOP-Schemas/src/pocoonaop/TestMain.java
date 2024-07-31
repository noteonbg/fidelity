package pocoonaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main1(String[] args) {
		
		System.out.println(1);
		MayBeTarget t =new MayBeTarget();
		
		
	}
	
	public static void main(String[] args) {
		
		
		  ApplicationContext c = new ClassPathXmlApplicationContext(
			      "carrot.xml");  //hey spring process the xml or annotations
		
		MayBeTarget m =c.getBean(MayBeTarget.class); 
		m.ntFunction();
		m.mntFunction();
		
		
		
	}

}
