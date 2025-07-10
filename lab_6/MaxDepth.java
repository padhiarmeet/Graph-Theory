package lab_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTee {
        static int index = -1;
        static ArrayList<Integer> arr = new ArrayList<>();
        static int height = 0;
        static int maxHeight = 0;

        public static Node buildBInaryTree(int nodes[]) {
            index++;
            System.err.println(index);

            if (index > nodes.length - 1 || nodes[index] == -1)
                return null;

            Node newNode = new Node(nodes[index]);
            newNode.left = buildBInaryTree(nodes);
            newNode.right = buildBInaryTree(nodes);
            return newNode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static int maxDepth(Node root){
            if(root == null) return 0;
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);

            return Math.max(leftHeight,rightHeight) + 1;
        }

        public static void findRoots(Node root){
            if(root.left == null && root.right == null){
                arr.add(root.data);
                return;
            }
            if(root.left != null) findRoots(root.left);
            if (root.right != null) findRoots(root.right);
            return;
        }

        public static void printList(){
            for(int i : arr){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, 7, -1, -1 ,-1 };

        Node root = BinaryTee.buildBInaryTree(nodes);

        int height = BinaryTee.maxDepth(root);

        BinaryTee.findRoots(root);

        System.out.println("____________Root Nodes______________");

        BinaryTee.printList();


        System.out.println("\nMax height is - " + height);

    }
}

