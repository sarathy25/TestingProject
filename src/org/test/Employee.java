package org.test;

import java.*;
import java.util.List;
import java.util.Vector;
import java.util.ArrayList;

public class Employee {
public static void main(String[] args) {
List li = new ArrayList();
	li.add(10);
	li.add(35);
	li.add(78);
	li.add(85);
	li.add(45);
	li.add(10);
	li.add(76);
	
	System.out.println(li);
	int in = li.indexOf(78);
	System.out.println(in);
	
	int la = li.lastIndexOf(76);
	System.out.println(la);
	int size = li.size();
	System.out.println(size);
	boolean em = li.isEmpty();
	System.out.println(em);
	boolean co = li.contains(200);
System.out.println(co);
li.add(5);
li.add(65);
li.add(3, 52);
System.out.println(li);
li.set(1, 33);
System.out.println(li);
li.remove(5);
System.out.println(li);

List<Integer> l2 = new Vector();
l2.add(45);
l2.add(867);





l2.addAll(li);
System.out.println(l2);
l2.retainAll(li);
System.out.println(l2);
l2.removeAll(li);
System.out.println("l2 is: "+l2);

System.out.println("partha");

System.out.println("partha");
System.out.println("partha");
System.out.println("partha");






















}
}