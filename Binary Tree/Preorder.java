public class Preorder{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
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
            Node NewNode= new Node(nodes[idx]);
            NewNode.left= buildNode(nodes);
            NewNode.right= buildNode(nodes);
            return NewNode;
        }
    }
    public static void PreorderTraversal(Node root){
        if(root == null){
            System.out.print(" data -> -1");
            return;
        }
        System.out.print(" data ->"+root.data);
        PreorderTraversal(root.left);
        PreorderTraversal(root.right);
    }
    public static void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();
        Node root = tree.buildNode(nodes);
        PreorderTraversal(root);
        System.out.println("");
        System.out.println(root.data);
    }
}