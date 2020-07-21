package com.kurumanchi.practise.datastructures.linkedlist.ex01;
/*
 * This is a demonstration of singly linked-list.
 */
public class ListNode {
	private int data;	
	private ListNode nextNode;
	
	public ListNode() {}
	
	public ListNode(int data) {
		this.data = data;
	}
	
	public ListNode(ListNode node) {
		this.nextNode = node;
	}
	
	public ListNode(int data,ListNode node) {
		this.data = data;
		this.nextNode = node;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;		
	}

	public ListNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(ListNode nextNode) {
		this.nextNode = nextNode;
	}
	
	/*
	 * Adding a new node in an existing list
	 */
	public void addNode(ListNode node) {
		ListNode currentNode = this;
		boolean isNextNodePresent = false;
		do {
			isNextNodePresent = false;
			if(currentNode.getNextNode() != null) {				
				currentNode = currentNode.getNextNode();
				isNextNodePresent = true;				
			}			
		}while(isNextNodePresent == true);
		
		currentNode.setNextNode(node);
	}
	
	/*
	 * Find the total length of the NodeList
	 */
	public int nodeLength() {
		int totalLength = 0;
		ListNode currentNode = this;
		do {
			if(currentNode != null) {
				totalLength++;
			}
			currentNode = currentNode.getNextNode();
		}while(currentNode != null);
		
		return totalLength;
	}
}
