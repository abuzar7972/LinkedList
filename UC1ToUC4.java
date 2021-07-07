package com.bl.programs;

public class UC1ToUC4 {
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
   
    
    public static UC1ToUC4 insert(UC1ToUC4 list, int data)
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
   
   
    public static void printList(UC1ToUC4 list)
    {
        Node currNode = list.head;
    
        System.out.print("LinkedList: ");
    
        while (currNode != null) {
            System.out.print(currNode.data + " ");
    
            currNode = currNode.next;
        }
    }
  
    public static void main(String[] args)
    {
    	UC1ToUC4 list = new UC1ToUC4();
        list = insert(list, 56);
       // System.out.println("My First Node::" );
       // printList(list);
        list = insert(list, 30);
       //System.out.println("My Second Node::" +list);
       //printList(list);
        list = insert(list, 70);
       //System.out.println("My Third Node::" +list);
        printList(list);
    }
}


