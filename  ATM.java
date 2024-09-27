import java.util.Scanner;
public class Main {
public static double balance=0.0;
	 public static void Deposit(Scanner scanner)
	 {
	     System.out.println("Now  your amount is :"+balance); 
	     System.out.print("enter amount to Deposit :");
	     double  amount=scanner.nextDouble();
	     balance+=amount;
	     System.out.println("amount deposited successfully")
	     System.out.println("Now your balance is :"+balance+"\n \n");
	     
	     
	     }
	     public static void withdraw(Scanner scanner)
	     {
	         
	      double   Wamount=0.0;
	      System.out.print("How much amount you want to withdraw :");
	      Wamount=scanner.nextDouble();
	      if(Wamount>balance)
	      System.out.println("amount not sufficiant\n \n ");
	      else
	      {
	          balance-=Wamount;
	          System.out.println("Amount withdraw successfully!");
	          System.out.println("After withdraw your balance is : "+ balance+"\n \n ");
	          
	      }
          }
          public static void checkbalance()
          {
              System.out.println("Your Bank balance is :"+ balance);
              }
	 // main function 
	public static void main(String[] args) {
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("create a  password for more security:");
	   int password;
	   password=scanner.nextInt();
	   
	   
	  System.out.println(" 1.Deposit \n 2.Withdraw \n 3.Checkbalance \n 4.Exit \n \n");
	  for(;;){
	  System.out.print("enter your option :");
	  int op=scanner.nextInt();
	   switch(op)
	   {
	       
	       case 1:
	       Deposit(scanner);
	       break;
	       case 2:
	       withdraw(scanner);
	       break;
	       case 3:
	       checkbalance();
	       break;
	       case 4:
	       break;
	       default :
	       System.out.println("enter correct option (or) Exit  ");
	   }
	   
	}
			  
	}
}