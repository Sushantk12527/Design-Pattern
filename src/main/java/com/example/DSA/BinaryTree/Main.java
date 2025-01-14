package com.example.DSA.BinaryTree;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Node root=new Node(10);
        root.left= new Node(15);
        root.right= new Node(20);


        // printInorder(root);
        // System.out.println("Size : "+ size(root));
        // System.out.println("Height : "+ height(root));

        // System.out.println(search(root,10));

        // levelOrderTraversal(root);

        Boundary(root);

    }

    public static void Boundary(Node root){
        Queue<Node> q1= new LinkedList<>();
        q1.add(root);
        q1.add(null);
        Node prev=root;
        System.out.println(prev.data+" ");
        while(q1.size()>1){

            Node f=q1.poll();
            if(f==null){
                q1.add(null);
                prev=null;
                continue;
            }

            if(prev==null){
                System.out.println(f.data+" ");
            }

            prev=f;

            if(f.left!=null){
                q1.add(f.left);
            }

            if(f.right!=null){
                q1.add(f.right);
            }


        }

        Queue<Node> q2= new LinkedList<>();
        q2.add(root);
        q2.add(null);
        // Node prev=root;
        // System.out.println(prev.data+" ");
        while(q2.size()>1){

            Node f=q2.poll();
            if(f==null){
                q2.add(null);
                prev=null;
                continue;
            }

            if(prev==null){
                System.out.println(f.data+" ");
            }

            prev=f;

            if(f.right!=null){
                q2.add(f.right);
            }

            if(f.left!=null){
                q2.add(f.left);
            }
        }



    }

    public static void leftView(Node root){
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        Node prev=root;
        System.out.println(prev.data+" ");
        while(q.size()>1){

            Node f=q.poll();
            if(f==null){
                q.add(null);
                prev=null;
                continue;
            }

            if(prev==null){
                System.out.println(f.data+" ");
            }

            prev=f;

            if(f.right!=null){
                q.add(f.right);
            }

            if(f.left!=null){
                q.add(f.left);
            }




        }


    }

    public static void levelOrderTraversal(Node root){
        Queue<Node> q= new LinkedList<>();

        q.add(root);
        q.add(null);

        while(q.size()>1){
            Node f=q.poll();
            if(f==null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(f.data+" ");
            if(f.left!=null){
                q.add(f.left);
            }
            if(f.right!=null){
                q.add(f.right);
            }
        }
    }

    public static boolean search(Node root, int val){
        if(root==null){
            return false;
        }

        return (root.data==val ||search(root.left,val) || search(root.right,val));
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null & root.right==null){
            return 0;
        }

        return height(root.left)+height(root.right)+1;
    }

    public static int size(Node root){
        if(root==null){
            return 0;
        }

        return size(root.left)+size(root.right)+1;
    }

    public static void printInorder(Node root){
        if(root==null){
            return;
        }
        printInorder(root.left);
        System.out.println(root.data);
        printInorder(root.right);


    }

    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int x){
            data=x;
            this.left=null;
            this.right=null;
        }
    }
}
