/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor
import org.w3c.dom.Node;
import problem1.node.TreeNode;

public class MyQueue {
  class Node{
        int data;
        Node next;

        public void setData(int data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }
    Node front;
    Node rear;

    public MyQueue(){
        front = null;
        rear = null;
    }

    public void enqueue(int data){
        Node ns = new Node();
        ns.setData(data);
        if(front==null){
            front = ns;
            rear = ns;
        }
        else{
            rear.setNext(ns);
            rear = ns;
        }
    }

    public void preSuccessor(TreeNode root){
        if(root == null)    return;
        else{
            enqueue(root.getdata());
            preSuccessor(root.getLeft());
            preSuccessor(root.getRight());
        }
    }

    public void getPreSucc(){
        Node temp = front.getNext();
        while(temp!=null){
            System.out.print(temp.getData()+"\t");
            temp = temp.getNext();
        }
    }
}
