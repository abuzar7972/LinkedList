package com.bl.programs;

public class UC6 {
	 Node head;
	    static class Node {
	 
	        int data;
	        Node next;
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	    public static UC6 insert(UC6 list,
	                                    int data)
	    {
	        Node new_node = new Node(data);
	        new_node.next = null;

	        if (list.head == null) {
	            list.head = new_node;
	        }
	        else {
	            Node last = list.head;
	            while (last.next != null) {
	                last = last.next;
	            }
	            last.next = new_node;
	        }
	        return list;
	    }
	 
	    public static void printList(UC6 list)
	    {
	        Node currNode = list.head;
	 
	        System.out.print("LinkedList: ");
	        while (currNode != null) {
	          
	             System.out.print(currNode.data + " ");
	           currNode = currNode.next;
	        }
	 
	        System.out.println();
	    }
	 
	    public static UC6 deleteByKey(UC6 list,
	                                         int key)
	    {
	        
	        Node currNode = list.head, prev = null;
	 
	        if (currNode != null && currNode.data == key) {
	            list.head = currNode.next; // Changed head
	 
	            System.out.println(key + " found and deleted");

	            return list;
	        }
	 
	        while (currNode != null && currNode.data != key) {
	          
	            prev = currNode;
	            currNode = currNode.next;
	        }
	 
	        if (currNode != null) {
	          
	            prev.next = currNode.next;
	 
	            System.out.println(key + "::delet");
	        }
	
	        return list;
	    }
	 
	    public static void main(String[] args)
	    {
	        /* Start with the empty list. */
	    	UC6 list = new UC6();
	 
	        list = insert(list, 56);
	        list = insert(list, 30);
	        list = insert(list, 70);
	       
	        printList(list);
	 
	        deleteByKey(list, 70);
	
	        printList(list);
	 
	       
	 }
}
