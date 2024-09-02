import java.util.Scanner;
import java.util.Random;
class Atm
{
     static double balance=200000;
 public static int Otp()
    {
        Random r=new Random();
         int random=r.nextInt(1000,10000);
        return random ;
    }
 static void withdraw(double w)
 {
       Scanner sc=new Scanner(System.in);
    if(w>0)
              {
                if(w % 100==0 || w % 500==0)
                {
                    int res=Otp();
                System.out.println("Otp is: "+res);
                System.out.println("Enter Otp :");
                int z=sc.nextInt();
                if(res==z)
                {
                    System.out.println("Withdrawn succesfully");
        
                double withdrawn=Atm.balance-w;
                  Atm.balance=Atm.balance-w;
            
            }
            else System.out.println("Invalid Otp");
        }
            else System.out.println("Enter amount above 100");
        }
        else System.out.println("Invalid amount");
 	
 }
 	static void deposit(double w)
 {
    Scanner sc=new Scanner(System.in);
    if(w>0)
                {
                    if(w % 100==0 || w % 500==0)
                {
                    int res=Otp();
                System.out.println("Otp is: "+res);
                System.out.println("Enter Otp :");
                int y=sc.nextInt();
                if(res==y)
                {
                    System.out.println("Deposited  succesfully");
        double deposit=Atm.balance+w;
        Atm.balance=Atm.balance+w;
                }
            else 
                {
                    System.out.println("Invalid Otp");
                    System.out.println("Please try again !");
                }
            }
            else 
            System.out.println("Enter amount above 100");
        }
        else System.out.println("Invalid amount");
    }

     static void Checkbalance()
{
	System.out.println("Balance: "+Atm.balance);
   // System.out.println("                     ");
    //System.out.println("------------------------------------------");

  }    
}



 

