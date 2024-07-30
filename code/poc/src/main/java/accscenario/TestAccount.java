package accscenario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import accscenario.controller.AccountPresentation;

@SpringBootApplication
public class TestAccount implements CommandLineRunner{
	
	public static void main(String[] args) {
		
		SpringApplication.run(TestAccount.class, args);
		
		
	}
	

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		AccountPresentation accPresentation
		=new AccountPresentation();
		accPresentation.startTheApp();
		

	}
	
	@Autowired
	private AccountPresentation accPresentation;
	


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		accPresentation.startTheApp();
		
	}

}
