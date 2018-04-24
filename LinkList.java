package com.w.datastruct;

public class LinkList {
	//链表的基本操作
	Node head = null;//初始化head节点
	
	public void addNode(Node node) {
		//在列表的尾节点添加节点
		Node temp = head;
		if (head == null) {
			head = node;
			return;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}
	
	public void outputList() {
		//输出整个链表
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}

}

class Node {
	//Node节点类，包含两个成员变量，一个是data，一个是next
	int data;
	Node next;//next表示下一个节点，所以也是Node类
	public Node(int data) {
		this.data = data;//constructor初始化即赋值
	}
}
