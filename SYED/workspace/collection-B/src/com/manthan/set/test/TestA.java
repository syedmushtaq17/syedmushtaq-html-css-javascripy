package com.manthan.set.test;

import java.util.TreeSet;

public class TestA {

	public static void main(String[] args) {

		Sbui S=new Sbui();
		Sbyp Ss =new Sbyp();
		TreeSet<Student> ts=new TreeSet<Student>(S);
// we must pass the obj (S or Ss )of class impl ^^^ comparator
		Student s=new Student(1,"rita", 74.5);
		Student s2=new Student(2,"mita", 70.5);
		Student s3=new Student(3,"bata", 76.5);
		Student s4=new Student(34,"tata", 78.5);
		ts.add(s);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		for(Student e:ts) {
			System.out.println("id is "+e.id);
			System.out.println("bname is "+e.name);
			System.out.println("percentage is "+e.percentage);
		}
	}

}