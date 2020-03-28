/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
   public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(50);
        obj.insert(10);
        obj.insert(68);
        obj.insert(90);
        obj.insert(40);
        obj.insert(30);
        obj.preVSpost();
    }
}
