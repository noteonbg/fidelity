package corejavadoubt;

import java.util.function.Predicate;

public class PentagonNobody implements Predicate<Transaction> {

	private double threshold;

	public PentagonNobody(double threshold) {
		// TODO Auto-generated constructor stub
		this.threshold =threshold;
	}

	@Override
	public boolean test(Transaction t) {
		// TODO Auto-generated method stub
		return t.getAmount() < threshold;
	}

}
