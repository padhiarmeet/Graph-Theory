package lab_5;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorTree {

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
        static Queue<Node> q1 = new LinkedList<>();

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

        public static boolean checkForMirror(Node root) {

            if (root == null)
                return false;
            q1.add(root.left);
            q1.add(root.right);

            while (!q1.isEmpty()) {
                Node leftQ = q1.poll();
                Node rightQ = q1.poll();

                if (leftQ == null && rightQ == null)
                    continue;
                else if (leftQ == null || rightQ == null)
                    return false;
                else if (leftQ.data != rightQ.data)
                    return false;
                else {
                    q1.add(leftQ.left);
                    q1.add(rightQ.right);
                    q1.add(leftQ.right);
                    q1.add(rightQ.left);
                }
            }
            return true;
        }

        public static void checkForMirrorRec(Node left1,Node right1){
            if(left1 == null || right1 == null) return;
            if(left1.data != right1.data) return;

            checkForMirrorRec(left1.left,right1.right);
            checkForMirrorRec(left1.right, right1.left);
            
            System.err.println("success");
        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 3, -1, -1, 4, -1, -1, 2, 4, -1, -1, 3, -1, -1 };

        Node root = BinaryTee.buildBInaryTree(nodes);

        System.out.println(BinaryTee.checkForMirror(root));

        BinaryTee.checkForMirrorRec(root.left, root.right);

    }
}
