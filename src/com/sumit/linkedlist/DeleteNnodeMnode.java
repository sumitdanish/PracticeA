package com.sumit.linkedlist;

import java.io.FileNotFoundException;

public class DeleteNnodeMnode {

	static Node head;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		CreateList cl = new CreateList();
		Node n = new Node();
		DeleteNnodeMnode d = new DeleteNnodeMnode();
		for(String h : FIleUtil.getValue("list2.txt")){
			head = cl.createList(head,Integer.parseInt(h));
		}
		cl.printList(head);
		System.out.println();
		d.deleNodeAfterMAndN(head, 5, 2);
		cl.printList(head);
	}

	public void deleNodeAfterMAndN(Node head,int m,int n){
		Node list = head;
		Node node = null;
		while(list != null){
			int x = 0;
			int y = 0;
			while(list != null && x < m-1){
				list = list.getNext();
				x++;
			}
			if(list == null){
				return;
			}
			
			if(list != null){
				node = list.getNext();
				//System.out.println(node.getData());
			}
			
			while(node != null && y <n){
				node = node.getNext();
				y++;
			}
			if(list != null){
				list.setNext(node);
			}
			list = node;
		}
	}
}
