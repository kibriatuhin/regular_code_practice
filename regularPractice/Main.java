package regularPractice;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Integer n = 100;
        Integer n2 = 100;
        Integer n3 = 128;
        Integer n4 = 128;
        System.out.println(n==n2);
        System.out.println(n3==n4);
    }
}

class BinaryTrees{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int index=-1;
        public static Node buildTree(int[] nodes){
            index++;
            if (nodes[index] == -1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preOrder(Node root){
            if (root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root){
            if (root == null)
                return;
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root){
            if (root == null)
                return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void levelOrder(Node root){
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()){
            Node current = queue.remove();
            if(current == null){
                System.out.println();
                if (queue.isEmpty()){
                    break;
                }else {
                    queue.add(null);
                }
            }else {
                System.out.print(current.data + " ");
                if (current.left != null){
                    queue.add(current.left);
                }
                if (current.right != null){
                    queue.add(current.right);
                }
            }
        }

    }


    public static int countNode(Node root){
        if (root == null)
            return 0;
        int leftCount = countNode(root.left);
        int rightCount = countNode(root.right);

        return leftCount+rightCount+1;
    }
    public static int sumOfNodes(Node root){
        if (root == null)
            return 0;
        int leftCount = sumOfNodes(root.left);
        int rightCount = sumOfNodes(root.right);

        return leftCount+rightCount+root.data;
    }

    public static int heightOfNode(Node root){
        if (root == null)
            return 0;
        int leftHeight = heightOfNode(root.left);
        int rightHeight = heightOfNode(root.left);

        int totalHeight = Math.max(leftHeight,rightHeight);
        return totalHeight +1;
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree binaryTree = new BinaryTree();
        Node root =  binaryTree.buildTree(nodes);

        System.out.println(heightOfNode(root));
    }

}