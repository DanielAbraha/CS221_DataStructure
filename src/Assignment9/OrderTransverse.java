package Assignment9;

public class OrderTransverse {
    /**
     * a. Create a binary tree for the given set of nodes. [ Manually ]
     * 55 45 47 43 54 58 76 71 50 60 68 80 91
     * b. Write the In-order traversal
     * c. Write the Pre-order traversal
     * d. Write the Post-order traversal
     * e. What is the successor of 76 and 47
     * f. Draw a tree after removal of 50 & 68 leaf nodes(Case – 1)
     * g. Draw a tree after removal of node has one left child and node has one right child (Case -2) – Remove 47 and 80
     * h. Draw a tree after removal of node has two child. (Case -3) – Test all the sub cases.(Case-3a, Case-3b, Case-3c) – Remove 45 and 76
     */

//       b. Write the In-order traversal
//     43, 45, 47,50, 54, 55, 58, 60, 68 , 71, 76,80,91.
//
//    c. Write the Pre-order traversal
//     55, 45, 43, 47, 54, 50, 58, 76, 71, 80, 60, 68, 91,
//
//    d. Write the Post-order traversal
//     43, 50, 54, 47, 45, 68, 60, 71, 91, 80, 76, 58,55.
//
//    e. What is the successor of 76 and 47
//    The successor of 76 is 80 and the successor of 47 is 50

//    2a. preorder implementation
//    public void PreOrder() {
//        preOrder(root);
//    }
//
//    private void PreOrder(Node n) {
//        if (n == null) {
//            return;
//        }
//        System.out.print(n.data + ",");
//        preOrder(n.left);
//        preOrder(n.right);
//
//    }
//
//
//    2b. postorder implementation
//    public void postOrder() {
//        postOrder(root);
//    }
//
//    private void postOrder(Node<E> node) {
//        if (node == null) {
//            return;
//            postOrder(node.left);
//            postOrder(node.right);
//            System.out.print(node.data + ",");
//        }
//    }
//    2c count leaf nodes
//
//    public int countLeafNodes() {
//        return countLeafNodes(root);
//    }
//    private int countLeafNodes(Noden) {
//        if(n==null) {
//            return0;
//        }elseif(n.left==null&&n.right==null) {
//            return1;
//        }
//        returncountLeafNodes(n.left) +countLeafNodes(n.right);}
}