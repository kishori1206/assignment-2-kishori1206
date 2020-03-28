/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

public class TreeNode {
  private int data;
    private TreeNode left;
    private TreeNode right;

    public void setdata(int data){
        this.data = data;
    }

    public int getdata(){
        return data;
    }

    public void setRight(TreeNode right){
        this.right = right;
    }

    public void setLeft(TreeNode left){
        this.left = left;
    }

    public TreeNode getLeft(){
        return left;
    }

    public TreeNode getRight(){
        return right;
    }
}
