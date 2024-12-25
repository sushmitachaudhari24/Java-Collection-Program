package Test.Io;
import java.util.*;
 class BankAccount
{

float amt,bal=0;
	void deposit(float amt)
	{
	this.amt=amt;
		if(amt>=0)
		{
			bal=bal+amt;
			System.out.println("Amount Deposited "+bal);
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	void withdraw(float amt)
	{
		
	}
	
}
 class SavingAcc extends BankAccount
 {float a;

	
	 void withdraw(float amt)
		{
		a=amt;
			if(a>0 && a<=bal)
			{
				System.out.println("Balance is "+bal+"\nSaving Ac..Withdrawal amount "+a+"\n After Withdrawal balance is "+(bal-a));
			}
			else {
				System.out.println("Sorry !!! Invalid amount");
			}
		}
 }
 class CurrentAcc extends BankAccount
 {
	 float a;
    float ta=5;
		
	 void withdraw(float amt)
		{
			a=amt;
			if(a>0 && a<=bal)
			{
				System.out.println("Balance is "+bal+"\nCurrount ac..Withdrawal amount "+a+"\nWithdrawal balance is "+((bal-a)-5));
			}
			else {
				System.out.println("Sorry !!! Invalid amount");
			}
		}
 }
 class BankApp
 {    BankAccount b;
	 void setApp(BankAccount b)
	 {
		 this.b=b;
	 }

	 void perform (float amt,float wAmount){
		 b.deposit(amt);
		 b.withdraw(wAmount);
	 }
 }
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter \n 1.Saving Account \n2.Current Account");
         int ch=sc.nextInt();
         BankApp ba=new BankApp();
         switch(ch)
         {
         case 1:SavingAcc sa=new SavingAcc();
         		ba.setApp(sa);
         		System.out.println("Enter amt,withdraw amount");
         		float a=sc.nextFloat();
         		float wa=sc.nextFloat();
         		ba.perform(a,wa);
         		break;
         case 2:CurrentAcc ca=new CurrentAcc();
                ba.setApp(ca);
                System.out.println("Enter amt,withdraw amount");
         		a=sc.nextFloat();
         		wa=sc.nextFloat();
         		ba.perform(a,wa);
         		break;
         default:System.out.println("Sorry wrong choice!!!");
         }
	}

}
