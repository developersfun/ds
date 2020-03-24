package org.nrj.trees;

/**
 * This class will be used to perform Binary Tree Operations.
 */
public class BinaryTree {
    /**
     * Operations to perform :
     *  1. INSERTION INTO BINARY TREE.
     *  2. Inorder traversal (LDR) using Recursion.
     *  3. Preorder traversal (DLR) using Recursion.
     *  4. Postorder traversal (LRD) using Recursion.
     */

    TreeNode rootNode;


    public void insertIntoBinaryTree(int value){
        if (null==rootNode){
            rootNode = new TreeNode(value);
        }
        else{
            //Either insert into left or right depending upon the value.
            //If the value is less than root, it will be inserted to its left subtree
            // Else we will insert it to its right subtree.

            insertNodeToSubTree(rootNode, value);
        }
    }

    private void insertNodeToSubTree(TreeNode rootNode, int value) {
        if(value<rootNode.data){
            //insert to left
            if(null == rootNode.left){
                rootNode.left = new TreeNode(value);
            }
            else{
                insertNodeToSubTree(rootNode.left, value);
            }
        }
        else{
            //insert to right
            if(null == rootNode.right){
                rootNode.right = new TreeNode(value);
            }
            else{
                insertNodeToSubTree(rootNode.right, value);
            }
        }
    }

    public String inorderTraversalUsingRecursion(TreeNode rootNode){
        String traversal = "";
        if(null==rootNode){
            return "";
        }

        //LDR
        traversal += inorderTraversalUsingRecursion(rootNode.left);
        traversal += "->" + rootNode.data;
        traversal += inorderTraversalUsingRecursion(rootNode.right);

        return traversal;
    }

    public String preorderTraversalUsingRecursion(TreeNode rootNode){
        String traversal = "";
        if(null==rootNode){
            return "";
        }

        //DLR
        traversal += "->" + rootNode.data;
        traversal += preorderTraversalUsingRecursion(rootNode.left);
        traversal += preorderTraversalUsingRecursion(rootNode.right);

        return traversal;
    }

    public String postorderTraversalUsingRecursion(TreeNode rootNode){
        String traversal = "";
        if(null==rootNode){
            return "";
        }

        //LRD
        traversal += postorderTraversalUsingRecursion(rootNode.left);
        traversal += postorderTraversalUsingRecursion(rootNode.right);
        traversal += "->" + rootNode.data;

        return traversal;
    }

    @Override
    public String toString() {
        return this.rootNode.toString();
    }
}
