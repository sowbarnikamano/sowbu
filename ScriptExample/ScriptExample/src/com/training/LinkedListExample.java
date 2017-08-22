package com.training;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String  argds[]){
LinkedList<String> linkedList=new LinkedList<>();
linkedList.add("hello");
linkedList.add("how");
linkedList.add("are");
linkedList.add("you?");
linkedList.add("how");
linkedList.add("is");
linkedList.add("your");
linkedList.add("life?");

linkedList.addFirst("sowbarnika");
linkedList.addLast("thank you");
System.out.println(linkedList.lastIndexOf("how"));
linkedList.pop();
System.out.println(linkedList.contains("how"));
for(String a:linkedList){
	System.out.print(a+" ");
}
linkedList.clear();
System.out.println(linkedList);
}
}