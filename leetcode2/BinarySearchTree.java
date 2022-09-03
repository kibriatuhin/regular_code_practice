package leetcode2;

public class BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root , int value){
        if (root == null){
            root = new Node(value);
            return root;
        }

        if (root.data > value){
            root.left = insert(root.left,value);
        }else {
            root.right = insert(root.right , value);
        }
        return root;
    }
    //inorder
    public static void inorder(Node root){
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //search
    public static boolean search(Node root, int value){
        if (root == null)
            return false;
        if (root.data > value)
            return search(root.left , value);
       else if (root.data == value)
            return true;
       else
            return search(root.right , value);

    }

    public static Node delete(Node root , int value){
        if (root == null)
            return null;
        if (root.data > value)
            root.left =  delete(root.left, value);
        else if (root.data < value)
            root.right = delete(root.right , value);
        else { //root.data == value
            //case 1
            if (root.left == null && root.right == null){
                return null;
            }

            //case 2
            if (root.left == null){
                return root.right;
            }
           else if (root.right == null){
                return root.left;
            }

           //case 3
            Node is = inorderSuccessor(root.right);
             root.data = is.data;
            root.right = delete(root.right , is.data);


        }
        return root;

    }
    public static Node inorderSuccessor(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void range(Node root , int x, int y){
        if (root== null)
            return ;
        if (root.data >=x && root.data<=y){
            range(root.left , x,y);
            System.out.println(root.data + " ");
            range(root.right , x,y);
        }else if (root.data >=y){
            range(root.left , x,y);
        }else {
            range(root.right , x,y);
        }
    }


    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        Node root = null;
        for (int i=0  ; i< values.length ; i++){
            root = insert(root , values[i]);
        }
       inorder(root);
        System.out.println();
        //delete(root,4);
        inorder(root);
        System.out.println();
        range(root,1,3);


    }
}
