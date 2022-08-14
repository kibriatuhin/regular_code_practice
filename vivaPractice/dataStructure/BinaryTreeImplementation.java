package vivaPractice.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImplementation {

    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int index = -1;
        public  static Node buildTree(int[] nodes){

            if (nodes[++index] == -1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preOrder(Node root){
            if (root == null)
                return;
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root){
            if (root == null)
                return;
            preOrder(root.left);
            System.out.println(root.data);
            preOrder(root.right);
        }

        public static void postOrder(Node root){
            if (root == null)
                return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }

        public static void levelOrder(Node root){
            if (root == null)
                return;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while (!queue.isEmpty()){
                Node currentNode = queue.remove();
                if (currentNode == null){
                    System.out.println();
                    if (queue.isEmpty()){
                        break;
                    }else {
                        queue.add(null);
                    }
                }else {
                    System.out.print(currentNode.data + " ");
                    if (currentNode.left != null)
                        queue.add(currentNode.left);
                    if (currentNode.right != null)
                        queue.add(currentNode.right);
                }
            }

        }


    }

    static int countOfNode(Node root){
        if (root == null)
            return 0;
        int leftNode = countOfNode(root.left);
        int rightNode = countOfNode(root.right);
        return leftNode + rightNode +1;
    }

    static int sumOfNode(Node root){
        if (root == null)
            return 0;

        int leftNode = sumOfNode(root.left);

        int rightNode = sumOfNode(root.right);


        return leftNode + rightNode + root.data;
    }


    static int height(Node root){
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int heightt = Math.max(leftHeight,rightHeight)+1;
        return heightt;
    }




    public static void main(String[] args) {
           int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
           BinaryTree tree = new BinaryTree();
           Node root = tree.buildTree(nodes);
           //tree.levelOrder(root);
           System.out.println(height(root));
    }
}
