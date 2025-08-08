public class identicalTree {
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
        int idx=-1;
        public static Node buildNode(int[] nodes1){
            idx++;
            if(nodes1[idx]==-1){
                return null;
            }
            Node NewNode= new Node(nodes1[idx]);
            NewNode.left= buildNode(nodes1);
            NewNode.right= buildNode(nodes1);
            return NewNode;
        }
         
    }
    public static void PreorderTraversal(Node root2){
        if(root2 == null){
            System.out.print(" data -> -1");
            return;
        }
        System.out.print(" data ->"+root2.data);
        PreorderTraversal(root2.left);
        PreorderTraversal(root2.right);
    }
    public static void main(String[] args) {
        int nodes1[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int nodes2[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree1 = new Binarytree();
        Node root1 = tree1.buildNode(nodes1);

        Binarytree tree2 = new Binarytree();
        Node root2 = tree2.buildNode(nodes2);
        PreorderTraversal(root2);
        System.out.println("");
        System.out.println(root2.data);
    }
}
