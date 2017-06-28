package session9_assignment2;
import  java.util.*;
//to create a copy without duplicate 
public class Example {
	public static void main(String args[]){

	ArrayList<Integer> a1= new ArrayList<Integer>();//ArrayList having duplicates
	a1.add(1);
	a1.add(2);
	a1.add(2);
	a1.add(3);
	a1.add(4);
	System.out.println("Arraylist with duplicate elements");
	
	for (Integer s1 : a1){
		System.out.println(s1+" ");
	}
	
	HashSet<Integer> l1 = new HashSet<Integer>();//Creating Hastset so that there will no duplicate elements of arraylist
	l1.addAll(a1);//adding all the elements to the HashSet
	System.out.println("Arraylist without duplicate elements");
	
	for (Integer s2 : l1){
		System.out.println(s2);
	}
}
}