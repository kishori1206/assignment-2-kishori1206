/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

public class Node {
  String name;
    int roll;
    Node next;

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public Node getNext() {
        return next;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
