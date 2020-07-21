package com.kurumanchi.practise.datastructures.linkedlist.ex01;

public class TestMain02 {

	public static void main(String[] args) {
		ListNode nodeList = new ListNode(23);
		
		nodeList.addNode(new ListNode(33));
		nodeList.addNode(new ListNode(43));
		nodeList.addNode(new ListNode(53));
		nodeList.addNode(new ListNode(63));
		
		System.out.println("Total Length "+nodeList.nodeLength());
		
		ListNode nextNode = null;
		nextNode = nodeList;
		do {				
			System.out.println(nextNode.getData());
			nextNode = nextNode.getNextNode();
		}while(nextNode != null);
	}

}
