package org.nrj.trees;

public class BinaryTreeRunner{


    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.insertIntoBinaryTree(5);
        binaryTree.insertIntoBinaryTree(3);
        binaryTree.insertIntoBinaryTree(2);
        binaryTree.insertIntoBinaryTree(8);
        binaryTree.insertIntoBinaryTree(9);
        binaryTree.insertIntoBinaryTree(4);
        binaryTree.insertIntoBinaryTree(6);
        binaryTree.insertIntoBinaryTree(5);



        //System.out.println(binaryTree);

        /**
         * Created tree will look like this :
         *                  5
         *               /    \
         *             /       \
         *           3           8
         *         / \         /  \
         *       /    \      /     \
         *     2       4    6       9
         *                 /
         *               /
         *              5
         * */

        String inorderTraversal = binaryTree.inorderTraversalUsingRecursion(binaryTree.rootNode);
        String preorderTraversal = binaryTree.preorderTraversalUsingRecursion(binaryTree.rootNode);
        String postorderTraversal = binaryTree.postorderTraversalUsingRecursion(binaryTree.rootNode);

        System.out.println("INORDER : " + inorderTraversal);
        System.out.println("PREORDER : " + preorderTraversal);
        System.out.println("POSTORDER : " + postorderTraversal);
    }


}