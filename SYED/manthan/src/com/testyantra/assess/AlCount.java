package com.testyantra.assess;

import java.util.ArrayList;
import java.util.List;

public class AlCount {

	public static void main(String[] args) {

		List<Chips> l=new ArrayList<Chips>();
		Chips a=new Kurkure();
		Chips b=new Lays();
		Chips c=new Bingo ();
		l.add(c);
		l.add(b);
		l.add(a);
		l.add(b);
		l.add(c);
		l.add(b);
		l.add(a);
		l.add(b);
		l.add(b);
		l.add(b);
		l.add(b);
		l.add(c);
		l.add(c);
		
		
		long kc= l.stream().filter(i-> i instanceof Kurkure).count();
		long lc= l.stream().filter(i-> i instanceof Lays).count();
		long bc= l.stream().filter(i-> i instanceof Bingo).count();
		
		System.out.println("Count of Kurkure is "+kc);
		System.out.println("Count of Lays is "+lc);
		System.out.println("Count of Bingo is "+bc);
		
		
		
	}

}