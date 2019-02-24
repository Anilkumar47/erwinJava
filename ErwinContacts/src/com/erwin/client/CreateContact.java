package com.erwin.client;
import java.util.*;

import com.erwin.serviceimpl.Implementation;


public class CreateContact {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Erwin Contacts");
		Scanner s = new Scanner(System.in);
		Implementation imp = new Implementation();
		int option;
		boolean next = true;
		while(next){
		System.out.println("1.create\n2.Edit\n3.Search\n4.Delete\n5.Display\n6.Exit");
		System.out.println("Choose a option in the above list");
		option = s.nextInt();
		switch(option){
		case 1 :imp.create();
				break;
		case 2 :imp.edit();
				break;
		case 3 :imp.search();
				break;
		case 4 :imp.delete();
				break;
		case 5 :imp.display();
				break;
		case 6 :System.exit(0); 
		break;
		}
		}
				
		
		}

	}


