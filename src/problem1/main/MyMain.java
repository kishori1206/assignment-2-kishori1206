/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

public class MyMain {
     public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(5);
        obj.insert(1);
        obj.insert(10);
        obj.insert(4);
        obj.insert(6);
        System.out.println("ALL Left Nodes");
        obj.printLeftNode();
        System.out.println("Count of Nodes not having left node");
        obj.countNotLeft();
    }
}
