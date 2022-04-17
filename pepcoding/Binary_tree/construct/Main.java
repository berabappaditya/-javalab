import java.util.*;

public class Main {
    public static class pair {
        Node data;
        int state;

        pair(Node data, int state) {
            this.data = data;
            this.state = state;
        }
    }

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

      public static void display(Node root){
        if(root==null){
            return;
        }
        if(root.left.data!=null){
            System.out.print();
        }
        System.out.println("<="+root.data+"=>");
        display(root.left);
        display(root.right);

    }
    


    public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, n, 70, null, null, 87, null, null };
        Node root = new Node(arr[0]);
        Stack<pair> st = new Stack<>();
        pair rootPair = new pair(root, 1);
        st.push(rootPair);
        int idx = 1;
        while (st.size() != 0) {
            pair peekPair = st.peek();

            // joining to the left hand side of the node
            if (peekPair.state == 1) {
                peekPair.state++;
                if (arr[idx] != null) {

                    Node leftChild = new Node(arr[idx]);
                    peekPair.data.left = leftChild;
                    st.push(new pair(leftChild, 1));
                }
                idx++;
                // joining to the right child of the node
            } else if (peekPair.state == 2) {
                peekPair.state++;
                if (arr[idx] != null) {

                    Node rightChild = new Node(arr[idx]);
                    peekPair.data.right = rightChild;
                    st.push(new pair(rightChild, 1));
                }
                idx++;

            } else {
                st.pop();
            }

        }
    }
}