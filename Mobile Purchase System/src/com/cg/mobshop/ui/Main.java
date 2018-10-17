package com.cg.mobshop.ui;
import java.util.Scanner;

import com.cg.mobshop.dto.PurchaseDetails;
import com.cg.mobshop.service.PurchaseService;
import com.cg.mobshop.service.PurchaseServiceImpl;


public class Main {
	
	
	
	public static void main(String[] args)
	{	
		
		
		PurchaseService ps=new PurchaseServiceImpl();
		
		PurchaseDetails pr = new PurchaseDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Cutomer Name : ");
		String name = sc.next();
		System.out.println("Enter phone number : ");
		String phone = sc.next();
		System.out.println("Enter mail id : ");
		String mail = sc.next();
		System.out.println("Enter mobile id : ");
		int mid = sc.nextInt();
		
		
		pr.setCustName(name);
		pr.setMailId(mail);
		pr.setPhoneNo(phone);
		pr.setMobileId(mid);
		int pi=ps.addPurchaseDetails(pr);
		System.out.println("purchase setails added succesfully"+pi);
		
		/*int ch;
		do{
			System.out.println(" Enter your choice : ");
			ch = sc.nextInt();
			switch(ch){
				case 1 : 
		
					System.out.println("enter customer name :");
					String name=sc.next();
					System.out.println("enter  phone :");
					String cname=sc.next();
					System.out.println("enter mail id :");
					int age=sc.nextInt();
					System.out.println("enter mobile id :");
					String mob=sc.next();
					
					
					break;
			}//end of switch
		}while(ch != 5);
		*/
		
		
	}
}





