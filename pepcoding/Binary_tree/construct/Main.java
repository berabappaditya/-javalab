import java.io.*;
import java.util.*;

public class Main {
    public static class Node {
        int data;
        Node left;
        Node right;

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

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }
    


    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }

                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }

                top.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static int size(Node root) {
        // write your code here
        if (root == null) {
            return 0;
        }
        int leftHeight = size(root.left);
        int rightHeight = size(root.right);
        return (leftHeight + rightHeight + 1);
    }

    public static int sum(Node root) {
        // write your code here
        if (root == null) {
            return 0;
        }
        int leftHeight = sum(root.left);
        int rightHeight = sum(root.right);
        return (leftHeight + rightHeight + root.data);
    }

    public static int max(Node root) {
        // write your code here
        if (root == null) {
            return 0;
        }
        int lt = max(root.left);
        int rt = max(root.right);
        if (root.data > lt && root.data > rt) {
            return root.data;
        } else if (rt > lt) {
            return rt;
        } else {
            return lt;
        }
    }

    public static int height(Node root) {
        // write your code here

        if (root == null) {
            return -1;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (values[i].equals("n") == false) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        Node root = construct(arr);

        int size = size(root);
        int sum = sum(root);
        int max = max(root);
        int ht = height(root);
        System.out.println(size);
        System.out.println(sum);
        System.out.println(max);
        System.out.println(ht);
    }

}