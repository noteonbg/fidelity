package accscenario.service;

import java.util.List;

import accscenario.model.Account;
import accscenario.model.AccountStatus;

public interface AccountService {

	AccountStatus getBalance(int accountno, int pin);

	List<Account> getAllAccountsLessThan(int balance);

}
