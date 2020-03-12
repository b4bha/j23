interface CreditCardInterface
{	
	public void viewCreditAmount();
	public void useCard(int amt);
	public void payCredit(int amt);
	public void increaseLimit(int amt);
} 
class SilverCardCustomer implements CreditCardInterface
{
	String name;
	String cardnumber;
	int creditamount;
	int creditlimit;
	static int ctr=0;
	SilverCardCustomer()
	{
		name="Mritunjan";
		cardnumber="1234567812345678";
		creditamount=0;
		creditlimit=50000;
	}
	
	public void viewCreditAmount()
	{
		System.out.println("Credit amount is "+creditamount);
	}
	public void useCard(int amt)
	{
		if((creditamount+amt)<=creditlimit)
		{
		
			creditamount=creditamount+amt;
			System.out.println("Amount credited... ");
		}
			else
			System.out.println("Transaction failure... ");	
	}
	public void payCredit(int amt)
	{
			creditamount=creditamount-amt;
			System.out.println("Amount Payed... ");
	}
	public void increaseLimit(int amt)
	{
			creditlimit=creditlimit+amt;
			System.out.println("Credit Limit increased..... ");
	}
}

class GoldCardCustomer extends SilverCardCustomer
{
	String name;
	String cardnumber;
	int creditamount;
	int creditlimit;
	static int ctr=0;
	GoldCardCustomer()
	{
		name="Niranjan";
		cardnumber="7777788888";
		creditamount=0;
		creditlimit=100000;
	}
	
	public void viewCreditAmount()
	{
		System.out.println("Credit amount is "+creditamount);
	}
	public void useCard(int amt)
	{
		if((creditamount+amt)<=creditlimit)
		{
			creditamount=creditamount+amt;
			System.out.println("Amount credited... ");
		}
		else
			System.out.println("Transaction failure... ");	
	}
			
	public void payCredit(int amt)
	{
			creditamount=creditamount-amt;
			System.out.println("Amount Payed... ");
	}
	public void increaseLimit(int amt)
	{
		if(ctr<3)
		{
			if(amt<=5000)
			{
				creditlimit=creditlimit+amt;
				System.out.println("Credit Limit increased..... ");
				ctr++;
			}
			else
				System.out.println("Cannot increase by more than Rs.5000");
		}
		else
			System.out.println("Cannot increase  by more than 3 times ");
	}
}

public class Slip23_1 
{
	public static void main(String[] args)
	{
 		SilverCardCustomer s=new SilverCardCustomer();
 		GoldCardCustomer g=new GoldCardCustomer();
    
    	System.out.println("Silver Card Transactions ");
	    s.viewCreditAmount();
	    s.useCard(1000);
	    s.viewCreditAmount();
	    s.payCredit(500);
        s.viewCreditAmount();
        s.increaseLimit(4000);
        
    	System.out.println("Gold Card Transactions ");
	    g.viewCreditAmount();
	    g.useCard(1000);
	    g.viewCreditAmount();
	    g.payCredit(500);
        g.viewCreditAmount();
        g.increaseLimit(4000);
        g.increaseLimit(6000);
        g.increaseLimit(4000);
        g.increaseLimit(4000);
        g.increaseLimit(4000);
	}
}