package check;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
      "applicationcontext.xml");
    
    
    HelloService s =context.getBean(HelloService.class);
  s.freaktest();
   //s.greatFunction();
    
    

    
    

    
    //System.out.println(service1.getClass().getName());
	//service1.greatestFunction();

//service1 is not pointing to an object of HelloService1 rather its subclass.
	//who created it answer is spring why proxy at work.

	  //service1.test2();


		/*
		 * HelloService siu =new HelloService(); siu.test();
		 */
		 
		/*
		 * HelloService service = (HelloService) context.getBean("helloService");
		 * 
		 * //100% we got HelloService object only T/F service.test();
		 */
		  
		  
		  
		 
		 
    
		/*
		 * System.out.println(service.getClass().getName());
		 * 
		 * 
		 * HelloService1 service1 = (HelloService1) context.getBean("helloService1");
		 * 
		 */   
		
		/*
		 * HelloService3 service3 = (HelloService3) context.getBean("helloService3");
		 * System.out.println(service3.getClass().getName()); service3.display();
		 */
   
 
  
  
  
  
  
  
  
    
  // service1.test2();
    
    
  }
}