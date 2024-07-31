package uncertainty.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class PocApplication implements CommandLineRunner 
{
	//@Scope("prototype")
	@Primary
	@Bean
	//@Profile("dev")
	public B f1()
	{
		
		return new B();
	}

	public static void main(String[] args) {
		
		SpringApplication.run(PocApplication.class, args);
		// I cant get the A object here.. becuase it could
		//be in process.
		
		
	}
	
	//in spring boot we told hey spring you have A object
	//with you give me here..
	@Autowired
	private A obj;

	
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("spring is telling i finsihed creteing"
				+ "objects and wiring");
		//ok I have object A given by spring now.. call
		//non static function.
		//obj.f1();
		//obj.fb();
		
	}

}
