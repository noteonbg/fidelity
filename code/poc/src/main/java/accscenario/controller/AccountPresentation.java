package accscenario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import accscenario.model.Account;
import accscenario.service.AccountService;

@Component
public class AccountPresentation {
	
	private AccountService accService;
	
	
	@Autowired
	void putAccountServiceInpresentation(AccountService ser)
	{
			System.out.println("\n servcie wired in presentation");
			accService=ser;
		
	}
	

	public AccountPresentation() {
//		accService =new AccountServiceImplementation();
		// TODO Auto-generated constructor stub
		System.out.println("\n account presnetation created");
		
	}





	public void startTheApp() {
		// TODO Auto-generated method stub
		
		/*
		System.out.println("account presentation at work");
		
		int accountno=12;
		int pin =1234;
		
		//below line is the hardest thing in project becuase we cannot copy paste from google.
		
		System.out.println(" in presentation gettng inputs for calling servcie");
		AccountStatus accountStatus = accService.getBalance(accountno,pin);
		System.out.println("in presntation after calling service, thinking what to do");
		
		*/
		
		int balance =23;//assume balance is given by user.
		List<Account> accounts = 
				accService.getAllAccountsLessThan(balance);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
