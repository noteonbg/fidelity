package accscenario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import accscenario.dao.AccountDao;
import accscenario.dao.AccountDaoImplementation;
import accscenario.model.Account;
import accscenario.model.AccountStatus;

@Component
public class AccountServiceImplementation implements AccountService {
	
	private AccountDao accountdao;
	
	
	@Autowired
	public void putdaoinservice(AccountDao dao)
	{
			System.out.println("\n dao wired in service");
			accountdao = dao;
		
	}
	
	
	
		public AccountServiceImplementation() {
			
			System.out.println("\n AccountService implementation created");
			
			//accountdao =new AccountDaoImplementation();
			
			
		
		// TODO Auto-generated constructor stub
	}



		@Override
	public AccountStatus getBalance(int accountno, int pin) {
		// TODO Auto-generated method stub
			System.out.println("in the service function , about to call dao ");
		AccountStatus i = accountdao.getAccountDetailsFromDB(accountno,pin);
		System.out.println("finished returning from dao , in service function");
		return i;
		
	}



		@Override
		public List<Account> getAllAccountsLessThan(int balance) {
			// filling up the logic not a big deal..
			return null;
		}

}
