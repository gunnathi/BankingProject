import java.util.Scanner;

interface currentAccount{
	
	void deposit();
	
	 default void withdraw() {
		 Scanner scan=new Scanner(System.in);
		 int balance=10000;
		 System.out.println("Enter the withdraw amount");
		 int withdraw=scan.nextInt();
		balance=balance-withdraw;
		
	}
	
	void balance();
}
	


class SavingAccount implements currentAccount{
	int balance=10000;
	Scanner scan=new Scanner(System.in);
    @Override
	public void deposit( ) {
		System.out.println("Enter amount to be deposited");
		int deposit=scan.nextInt();
		
	    balance=balance+deposit;
		System.out.println("balnce is"+balance);
		
	}
    @Override
	public void withdraw() {
		int withdraw;
		System.out.println("enter the withdraw");
		withdraw=scan.nextInt(); 
			if (withdraw>6000) {
			System.out.println("withdraw failed");
		}else if (balance<5000)
			System.out.println("Insufficient baalnce");
		else
		{
			balance=balance-withdraw;
		}
			
			System.out.println("balance is"+balance);
		
	}
    @Override
	public void balance() {
		System.out.println("Your balance is ");
		System.out.println("balance"+balance); 
		
	}

}

	
	



public class BankingProject {
	 
	static Scanner scan= new Scanner(System.in);

	public static void main(String[] args) {
		
		SavingAccount save=new SavingAccount();
		boolean again=true;
		while(again) {
		System.out.println("Enter the 1.saving account or 2.current Account");
		int ch=scan.nextInt();
		
		switch(ch) {
					case 1:System.out.println("savings account");
							System.out.println("1.deposit,2.withdraw,3.balance");
		                    int n=scan.nextInt();
		                     switch(n) {
		                                  case 1:save.deposit();
		                                         break;
		                                         
		                                  
		                                    
		      
		                                   case 2:save.withdraw();
		                                    break;
		                                    
		                                   case 3:save.balance();
		                                     break;
		                                }
		             break;
						case 2:System.out.println("current account");
								System.out.println("1.deposit,2.withdraw,3.balance");
			                    int h=scan.nextInt();
			                     switch(h) {
			                                  case 1:save.deposit();
			                                    break;
			      
			                                   case 2:save.withdraw();
			                                    break;
			                                    
			                                   case 3:save.balance();
			                                     break;
			                                }
			           
		             
		                     
		       
		
		
		
		
		}
		
		System.out.println("Do you want to continue again Y or N?");
		String temp=scan.nextLine();
		if(temp.equalsIgnoreCase("Y"))
			again=true;
		else if(temp.equalsIgnoreCase("N"))
				again=false;
		
		}
		System.out.println("Thanks for using the application");
		System.exit(0);
		
	
	}
}


	

		 
		
		
		
		

	


