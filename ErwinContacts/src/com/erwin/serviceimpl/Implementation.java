package com.erwin.serviceimpl;
import java.*;
import java.util.ArrayList;

import com.erwin.module.ContactsPojo;

import java.util.*;
public class Implementation {
	
	ContactsPojo cp = new ContactsPojo();
	ArrayList<ContactsPojo> al = new ArrayList<ContactsPojo>();
	Scanner s = new Scanner(System.in);
	
	public void create(){
		System.out.println("To create contact Enter name of person :");
		cp.setName(s.nextLine());
		System.out.println("Enter email :");
		cp.setEmail(s.nextLine());
		System.out.println("Enter Mobile Number :");
		cp.setMobile(s.nextLine());
		System.out.println("Contact Created Successfully!");
		al.add(cp);
		
	}
	public void edit(){
		
	}
	public void search(){
		
	}
	public void delete(){
		
	}
	public void display(){
		System.out.println("Here is the list of Contacts");
		for(int i=0 ;i<al.size();i++){
			System.out.println(al.get(i).getName());
		}
		
		
	}
	

}
