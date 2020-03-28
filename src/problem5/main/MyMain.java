/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;

//executable class
public class MyMain {
  MyCircularQueue obj = new MyCircularQueue();
        obj.enqueue(1,9,0);
        obj.enqueue(2,8,1);
        obj.enqueue(3,7,4);
        obj.enqueue(4,6,1);
        obj.enqueue(5,6,2);
        obj.removeBackLog();
        obj.display();

    }
}
