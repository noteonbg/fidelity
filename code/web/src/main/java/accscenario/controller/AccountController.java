package accscenario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import accscenario.model.Account;
import accscenario.model.AccountStatus;
import accscenario.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accService;
	
	
	//whatever is related to http. peacefully find out now itselfg
	//
	@GetMapping("/getbalance")
	ResponseEntity<AccountStatus> getBalance(@RequestParam int accountno, 
			@RequestParam int  pin)
	{
		
		  System.out.println("input got is " + accountno +" " + pin); AccountStatus ac
		  AccountStatus x =accService.getBalance(accountno, pin);
		  ResponseEntity<AccountStatus> r=null;
		  if(x.getStatusCode()==1)
		  r =
				  new ResponseEntity<AccountStatus>(x, HttpStatus.OK);
		  else
			   r =
			  new ResponseEntity<AccountStatus>(HttpStatus.NOT_FOUND);
		  		  
		 //AccountStatus accountStatus = accService.getBalance(accountno,pin);
		
		return r ;
				
		
			
				
		
		
	}
	

}
