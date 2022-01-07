package com.mph.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.mph.model.Hall;

public class MHSContoller implements MHSInterface {
	
	Hall h = new Hall();
	Scanner sc= new Scanner(System.in);
	List<Hall> hall = new ArrayList<Hall>();

	public void addhall() {
		
		System.out.println("Enter hall id");
		int hid = sc.nextInt();
		h.setHid(hid);
		
		System.out.println("Enter hall name");
		String hname = sc.next();
		h.setHname(hname);
		
		System.out.println("Enter hall price");
		int hprice =sc.nextInt();
		h.setHprice(hprice);
		
		System.out.println("Enter hall location");
		String hloc=sc.next();
		h.setHloc(hloc);
		
		System.out.println("Enter hall capacity");
		int hcap=sc.nextInt();
		h.setHcap(hcap);
		
		System.out.println(" Included Facility");
		String hincl=sc.next();
		h.setHincl(hincl);
		
		hall.add(h);
		System.out.println("HAll Details Added Successfully");
		
		
		
	}

	public void viewhall() {
		System.out.println(h.getHid() + "  "  + h.getHname() +"    " + h.getHprice()+"    " + h.getHloc()+"     " + h.getHcap()+"       " + h.getHincl());
		
	}

	public void updatehall() {
		
	}

	public void deletehall() {
		
		
	}
	

}
