package accscenario.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import accscenario.model.Account;
import accscenario.model.AccountStatus;

@Repository
public class AccountDaoImplementation implements AccountDao {

	public AccountDaoImplementation()
	{
		
		System.out.println("\n Account dao object created");
	}
	
	
	@Override
	public AccountStatus getAccountDetailsFromDB(int accountno, int pin) {
		// TODO Auto-generated method stub

		System.out.println("Account dao implementation ");
		AccountStatus accountStatus = new AccountStatus(0, "not working in dao", 
				new Account(0, "A", 0, 0, 0));
		System.out.println("returning from DAO");
		return accountStatus;// kids will always cry when models are used.. becuase of addiction to int

	}

}
