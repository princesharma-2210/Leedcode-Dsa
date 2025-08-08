
import java.util.LinkedList;
import java.util.Queue;

// sum of left and right level == root
public class sumOfLevel {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data= data;
            this.left= null;
            this.right= null;
        }
    }
    public static class Binarytree{
        static int idx=-1;
        public static Node buildNode(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left= buildNode(nodes);
            newNode.right= buildNode(nodes);
            return newNode;
        }
    }
    public static boolean Sum(Node root){
        if(root==null){
            return true;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curNode= q.remove();

            if(root.left!=null){
                q.add(root.left);
                Node Left= root.left;
            }
            if(root.right!=null){
                q.add(root.right);
                Node Left= root.right;
            }
            if((Left+Right)!=curNode){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int nodes[]= {3,1,2,-1,-1,-1,2,1,-1,-1,1,-1,-1};
        Binarytree tree= new Binarytree();
        Node root= tree.buildNode(nodes);

    }
}
