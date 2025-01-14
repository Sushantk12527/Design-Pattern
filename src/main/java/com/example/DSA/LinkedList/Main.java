package com.example.DSA.LinkedList;

public class Main {
    public static void main(String[] args) {

        Node h1=createLL(10);

        // Node head=insertMiddle(0,0,LL);

        // Node rev=reverseLL(head);
        Node middle=findMiddleLL(h1);


        System.out.println(middle.data);


        // PrintLL(head);

    }

    public static Node findMiddleLL(Node head){

        Node slow=head,fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public static Node reverseLL(Node head){
        Node temp=head;
        Node h1=head,h2=null;

        while(h1!=null){
            h1=h1.next;
            temp.next=h2;
            h2=temp;
            temp=h1;
        }

        return h2;
    }

    public static Node insertMiddle(int num, int position, Node head){
        Node temp=head;
        Node newNode= new Node(num);

        if(position==0){
            newNode.next=head;
            head=newNode;
            return head;
        }


        for(int i=1;i<position;i++){
            temp=temp.next;
        }

        Node tempNext=temp.next;
        temp.next=newNode;
        newNode.next=tempNext;

        return head;
    }

    public static Node createLL(int n){
        Node head= new Node(1);
        Node temp=head;

        for(int i=2;i<=n;i++){
            Node newNode= new Node(i);
            temp.next=newNode;
            temp=temp.next;
        }

        return head;
    }

    public static void PrintLL(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

    public static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            this.next=null;
        }
    }
}


