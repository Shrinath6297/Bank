package com.cjc.bms.client;
import java.util.Scanner;

import com.cjc.bms.service.*;

public class Test {
	

public static  void main(String[] args) {
	RbI r=new Sbi();
	
		while(true)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your choice");
System.out.println("1.create your account\n 2.shoe details\n 3.deposite amount \n 4.withdrawal amount\n 5.check balnce");
int ch=sc.nextInt();
if (ch==1) {
	
	r.createAccount();
}
else if (ch==2) {
	r.displayAllDetails();
}
else if (ch==3) {
	
	r.depositeMoney();
} else if (ch==4) {
	
	r. withdrawal();
} else if (ch==5) {
	
	r.balanceCheck();
}
else if (ch==6) 
{
	
	System.exit(0);
}
else 
{
	System.out.println("wrong input");}
}
}
}