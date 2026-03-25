package Thirty_Days_Of_Code;

import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

@SuppressWarnings("unused")
class LinkedList {

    public static  Node insert(Node head, int data) {
        Node node = new Node(data);
        
        if(head == null){
            head = node;
            return head;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        temp = node;
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            Node head = null;
            int N = sc.nextInt();
            
            while(N-- > 0) {
                int ele = sc.nextInt();
                head = insert(head,ele);
            }
            display(head);
        }
    }
}
