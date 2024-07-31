package corejavadoubt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FinancialExample {
	
	public static void main(String[] args) {
		
		List<Transaction> transactions = Arrays.asList(
                new Transaction("Deposit", 500.0),
                new Transaction("Withdrawal", 150.0),
                new Transaction("Deposit", 200.0),
                new Transaction("Withdrawal", 50.0)
        );

        double threshold = 100.0;
        
        Predicate<Transaction> freak =new PentagonNobody(threshold);
        		
        
        List<Transaction> largeTransactions = 
        		 transactions.stream()
                .filter(freak)
                .collect(Collectors.toList());
        		
	}

    public static void main1(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("Deposit", 500.0),
                new Transaction("Withdrawal", 150.0),
                new Transaction("Deposit", 200.0),
                new Transaction("Withdrawal", 50.0)
        );

        double threshold = 100.0;
        
        List<Transaction> largeTransactions = 
        		 transactions.stream()
                .filter(t -> t.getAmount() > threshold)
                .collect(Collectors.toList());
        
        
        double totalDeposits = transactions.stream()
                .filter(t -> "Deposit".equals(t.getType()))
                .mapToDouble(Transaction::getAmount)
                .sum();
        

        largeTransactions.forEach(System.out::println);
    }
}
