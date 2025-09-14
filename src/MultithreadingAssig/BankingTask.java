package MultithreadingAssig;

public class BankingTask implements Runnable{
	private String task;
	private int priority;
	
	public BankingTask(String task,int priority)
	{
		this.task=task;
		this.priority=priority;
	}
	
	public void run()
	{
		Thread.currentThread().setPriority(priority);
		
		System.out.println("Task Started :" +task+"Priority:"+priority+"Running on "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Task Inturrepted");
		}
		System.out.println("completed: "+task+" priority: "+priority);
	}

}
