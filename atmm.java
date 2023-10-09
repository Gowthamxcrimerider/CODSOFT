package atm;

import java.util.Scanner;

public class atmm {
	public static <equalsto> void main(String []args) {
		int pin = 1234;
		int balance = 1000;
		int addamount=0;
		int withdrawal=0;
		int d=4;
		Scanner kk=new Scanner(System.in);
		System.out.println("welcome to codsoft ATM");
			System.out.println("Enter the pin number ");
			int pin1=kk.nextInt();
		if(pin!=pin1) {
			System.out.println("wrong pin");
			
		}
		else{
			 System.out.println("choose your account type SAVING OR CURRENT");
			    String name=kk.next();
			    System.out.println(name);
			    while(true) {
					 System.out.println("press 1 to check balance");
					 System.out.println("press 2 to add money");
					 System.out.println("press 3 to withdrawal");
					 System.out.println("press 4 to exit");
					 
					 int sp =kk.nextInt();
						switch(sp) {
						case 1:
							System.out.println("your balance "+balance);
							break;
						case 2:
							System.out.println("Enter ur amount");
							int amount=kk.nextInt();
							balance = amount + balance;
							System.out.println("Sucessfully added \n thankyou");
							break;
						case 3:
							System.out.println("ENTER YOUR AMOUNT");
							int amount1=kk.nextInt();
							if (amount1<=balance) {
								System.out.println("Amount has been withdrawed");
								balance=amount1 - balance;
							}
							else {
								System.out.println("Insufficient balance");
							
							}
							break;
						default :
							System.out.println("Display ur balance  to press 4 or press 5 to 9 any number to exit");
							d=kk.nextInt();
							if(d==4) {
								System.out.println(balance+"Thankyou for your visiting");
							}
						
							else {
								System.out.println("Thank you For Visting");
							break;
							}
							
							break;
						
						}
						
				}}
						
							
						
							
	
				
			}}

