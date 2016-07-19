package com.sumit.linkedlist;

import java.io.FileNotFoundException;

public class SplitAlternateNode {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Node head = null;
		CreateList cl = new CreateList();
		for (String s : FIleUtil.getValue("01Split.txt")) {
			head = cl.createList(head, Integer.parseInt(s));
		}
		cl.printList(head);
		new SplitAlternateNode().split(head, cl);
	}

	public void split(Node head, CreateList cl) {
		Node list = head;
		Node result1 = null;
		Node result2 = null;
		Node re1 = null;
		Node re2 = null;
		while (list != null) {

			if (result1 == null) {
				result1 = list;
				// result1.setNext(null);
				list = list.getNext();
				re1 = result1;
			} else {
				result1.setNext(list);
				result1 = result1.getNext();
				list = list.getNext();
			}
			if (list != null) {
				if (result2 == null) {
					result2 = list;
					list = list.getNext();
					// result2.setNext(null);
					re2 = result2;

				} else {
					result2.setNext(list);
					result2 = result2.getNext();
					list = list.getNext();
				}
			}

		}
		System.out.println();
		// System.out.println("Re1 : "+re1.getData());
		while (re2 != null) {
			System.out.print(re2.getData() + ",");
			re2 = re2.getNext();
		}
		System.out.println();
		// System.out.println("Re1 : "+re1.getData());
		while (re1 != null) {
			System.out.print(re1.getData() + ",");
			re1 = re1.getNext();
		}

	}

}
