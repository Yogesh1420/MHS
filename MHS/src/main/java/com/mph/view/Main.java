package com.mph.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.mph.controller.MHSContoller;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Hi Yogz");
		Scanner sc = new Scanner(System.in);
		
		MHSContoller mhs = new MHSContoller();
		
		String un;
		String pwd;
		String c=null;
		
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader  br = new BufferedReader(isr);
			System.out.println("Enter Username");
			un = br.readLine();
			System.out.println("Enter password");
			pwd  = br.readLine();
			
			if(un.equals("admin")&& pwd.equals("admin")) {
				 do {
		             System.out.println("Enter your Choice :");
		             System.out.println("1. Add Hall");
		             System.out.println("2. View Hall");
		             System.out.println("3.Exit");
		             
		           
	                  	int choice = sc.nextInt();
			
		                   switch(choice)
		                   	{
		                   		case 1:
		                   			{
		                   					mhs.addhall();
		                   						break;
		                   			}
		                   			
		                   		case 2:
		                   		{
		                   			mhs.viewhall();
		                   			break;
		                   		}
		                   		default:
	                   			{
	                   				System.out.println("Choose the right choice !!!");
	                   			}
				
			}System.out.println("Do you want to continue? Y or y");
			c=sc.next();
				 }while(c.equals("y") || c.equals("Y"));
			}
			else {
				System.out.println("invalid attempt");
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
		}



