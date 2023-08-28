package com.cjc.bms.service;
 import  com.cjc.bms.service.*;
import  com.cjc.bms.model.*;
import java.util.Scanner;

public  class Sbi implements RbI {
	double balance;
	Scanner sc=new Scanner (System.in);

	Amount a=new Amount();
	public void createAccount() {
		System.out.println("enter your acc number");
		a.setAccNo(sc.nextLong());
		System.out.println("enter the your name");
		a.setName(sc.next()+sc.nextLine());
		System.out.println("enter your mobNo");
		a.setMobNo(sc.nextLong());
		System.out.println("aadharNo");
		a.setAadharNo(sc.nextLong());
		System.out.println("enter your gender");
		a.setGender(sc.next());
		System.out.println("enter your age");
		a.setAge(sc.nextByte());
		System.out.println("enter your acc number");
		a.setAccNo(sc.nextLong());
	}
	
	
	
	public void displayAllDetails() {
		
		System.out.println("name"+a.getName());
		System.out.println("accnumber"+a.getAccNo());
		System.out.println("mobNo"+a.getMobNo());
		System.out.println("aadharNo"+a.getAadharNo());
		System.out.println("Gender"+a.getGender());
		System.out.println("age"+a.getAge());
		System.out.println("accNo"+a.getAccNo());
		
	}
	public void depositeMoney() {
		System.out.println("enter deposit amount");
		double d =sc.nextDouble();
			balance=balance+d;		
		System.out.println("total amount"+balance);
		a.setBalnce(balance);
	}
	public void withdrawal() {
		System.out.println("enter withdrawal amount");
		double d1 =sc.nextDouble();
		balance=balance-d1;
		System.out.println("total amount"+balance);
		a.setBalnce(balance);
	
	}
	public void balanceCheck() {
		System.out.println(a.getBalnce());
	}
	
}
