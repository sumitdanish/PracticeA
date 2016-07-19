package com.sumit.linkedlist;

public class CreateList {

	
	public Node createList(Node ll,int data){
		Node n = new Node();
		n.setData(data);
		if(ll == null){
			ll = n;
			return ll;
		}
		ll.setNext(createList(ll.getNext(), data));
		return ll;
	}
	
	public void printList(Node ll){
		if(ll == null){
			return;
		}
		System.out.print(ll.getData()+"->");
		printList(ll.getNext());
	}
	
	
}
