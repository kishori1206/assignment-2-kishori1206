/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;


//to implement circular queue
public class MyCircularQueue {
   Node front;
    Node rear;
    int count;

    public MyCircularQueue(){
        front = null;
        rear = null;
        count = 0;
    }

    public void enqueue(int roll,int backlog,int a_count){
        Student st = new Student(roll,backlog,a_count);
        Node ns = new Node();
        ns.setStudent(st);

        if(front==null){
            front = ns;
        }
        else{
            rear.setNext(ns);
        }

        rear = ns;
        rear.setNext(front);
        count++;
    }

    public void removeBackLog(){
        while(count-->0){
            Student ss = front.getStudent();
            if((ss.getBacklog()-ss.getA_count())>0){
                front = front.getNext();
                rear = rear.getNext();
            }
            else{
                rear.setNext(front.getNext());
                front = front.getNext();
            }
        }
    }

    public void display(){
        Node temp = front;
        System.out.println();
        while(temp.getNext()!=front){
            System.out.println(temp.getStudent());
            temp = temp.getNext();
        }
        System.out.println(temp.getStudent());
    }
}
