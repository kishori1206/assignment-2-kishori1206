/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
   public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("kishori",1);
        obj.insert("ayushi",4);
        obj.insert("yash",3);
        obj.insert("harsh",2);
        obj.insert("jack",5);
        obj.display();
    }
}
