/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
  
   int roll;
    int a_count;
    int backlog;

    public Student(int roll, int backlog,int a_count) {
        this.roll = roll;
        this.a_count = a_count;
        this.backlog = backlog;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", backlog=" + backlog +
                ", a_count=" + a_count +
                '}';
    }

    public int getRoll() {
        return roll;
    }

    public int getA_count() {
        return a_count;
    }

    public int getBacklog() {
        return backlog;
    }

}
