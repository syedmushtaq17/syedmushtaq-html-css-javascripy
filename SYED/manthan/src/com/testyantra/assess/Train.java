package com.testyantra.assess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class Train {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Map<Integer,String> m=new HashMap<Integer, String>();
		
		m.put(1 ,"Ananthapur Express");
		m.put(2, "Tiger Express");
		m.put(3, "Rajasthan Expresss");

		
		Function<Integer, String> in=i->{
			String name=null;
			
		for(Integer ii : m.keySet()) {
			
			if(ii==i) {
				System.out.println(m.get(i));
			 name=m.get(i);
			}
		}
			
			
			
			return name;
			
		};
		
		
		

		Function<String, String> ss=i->{
		
			
		for(String ii : m.values()) {
			
			if(ii.equals(i)) {
				System.out.println( i);
				
				
				return i;
			}
		}
			
			
			
			return null;
			
		};
		
		
		System.out.println("Enter '1 ' for name  ");

		System.out.println("Enter '2 ' for number  ");
		
		
		int op=scan.nextInt();
		scan.nextLine();
		if(op==1) {
			System.out.println("Enter the name of train");
			String n=scan.nextLine();
			String nn=ss.apply(n);
			if(nn!=null) {
				System.out.println("Found train "+nn );
			}
			else
				System.out.println("Train not found");
		}
		else {
			System.out.println("Enter the number of train");
			int no=scan.nextInt();
			String nn=in.apply(no);
			if(nn!=null) {
				System.out.println("Found train "+nn );
			}
			else
				System.out.println("Train not found");
			
		}

		
		
	}
	
}