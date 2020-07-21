package com.kurumanchi.practise.datastructures.linkedlist.ex01;

public class TestMain01 {

	public static void main(String[] args) {
		ListNode list = null;
		ListNode nextNode = null;
		try {
			list = new ListNode();
			list.setData(12);
			
			list.setNextNode(new ListNode(	24, 
											new ListNode(	36,
															new ListNode(	48,
																			null))));
			nextNode = list;
			do {				
				System.out.println(nextNode.getData());
				nextNode = nextNode.getNextNode();
			}while(nextNode != null);
			
			System.out.println("Total Length "+list.nodeLength());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
