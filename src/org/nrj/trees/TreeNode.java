package org.nrj.trees;

/**
 * This class acts as a Node for Binary Tree.
 */
public class TreeNode {

    public int data;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

    @Override
    public String toString() {
        return "[ D->" + this.data + " L->" + this.left + " R->" + this.right + " ]";
    }


}
