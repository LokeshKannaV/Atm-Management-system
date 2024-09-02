import java.util.Scanner;
import java.util.Random;
class AtmDrive
{
	public static int Otp()
	{
		Random r=new Random();
		 int random=r.nextInt(1000,10000);
		return random ;
	}
	public static void main(String[] args)
	 {

	 	Scanner sc=new Scanner(System.in);
	 	System.out.println(" Welcome to ATM ");
	 	int pin1=5686;
	 	System.out.println("Enter Pin:");
        int pin=sc.nextInt();
	 	if(pin1==pin)
	{
        boolean p=true;
	 	while(p)
	 	{
	 	System.out.println("");
	 	System.out.println("1-----> Withdraw");
	 	System.out.println("2-----> Deposit");
	 	System.out.println("3-----> Checkbalance");
	 	System.out.println("4-----> Exit");
	 	System.out.println("Enter choice:");
	 	int ch=sc.nextInt();
	 	switch(ch)
	 	{
	 	case 1:
	 		{
	 			System.out.println("Enter amnt to withdraw:");
 	          double w=sc.nextDouble();
 	          Atm.withdraw(w);
	 			break;
	 		}
	 	case 2:
	 		{
	 			System.out.println("Enter amnt to deposit:");
 	            double w=sc.nextDouble();
 	            Atm.deposit(w);		
 	            break;
	 		}
	 	case 3:
	 		{
	 			Atm.Checkbalance();
	 			break;
	 		}
	 	case 4:
	 		{
	 			p=false;
	 			System.out.println("Thank you ! visit Again");
	 			break;
	 		}
	 	default:
	 		System.out.println("Inavlid Choice");
	 		p=false;
	 		break;
	 	}
	 }
	
}
	else
		 System.out.println("Incorrect pin");
	}
		}
