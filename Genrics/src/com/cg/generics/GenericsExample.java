package com.cg.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsExample {

public static void main(String args[]){  
	ArrayList<String> list=new ArrayList<String>();  
	list.add("rahul");  
	list.add("jai");  
	
	String s=list.get(1);//type casting is not required  
	System.out.println("element is: "+s);  
	  
	Iterator<String> itr=list.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  
