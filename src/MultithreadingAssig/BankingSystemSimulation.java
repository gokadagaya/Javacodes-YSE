package MultithreadingAssig;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankingSystemSimulation {

	public static void main(String[] args) {
		ExecutorService exe = Executors.newFixedThreadPool(3);
		
		exe.execute(new BankingTask("Fraud Detection",Thread.MAX_PRIORITY));
		exe.execute(new BankingTask("Transaction Validation",Thread.MAX_PRIORITY));
		
		
		exe.execute(new BankingTask("Balance updates",Thread.NORM_PRIORITY));
		exe.execute(new BankingTask("Account Notifications",Thread.NORM_PRIORITY));
		
		exe.execute(new BankingTask("Report Generation",Thread.MIN_PRIORITY));
		exe.execute(new BankingTask("Logging",Thread.MIN_PRIORITY));
		
		exe.shutdown();
	}

}
