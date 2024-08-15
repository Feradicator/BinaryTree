public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Tree tree=new Tree(3);
        tree.node.left=new Node(2);
        tree.node.right=new Node(5);
        tree.node.left.left=new Node(7);
        tree.inOrderTraversal(tree.node);
        
		
	}
}
 class Node{
    int element;
    Node left;
    Node right;
    public Node(int element)
    {
        this.element=element;
        left=right=null;
        
    }
}
 class Tree{
    Node node;
    public Tree(int n)
    {
        node=new Node(n);
    }
    public void inOrderTraversal(Node n)
    {
        if(n==null)
        return;
        inOrderTraversal(n.left);
        System.out.println(n.element);
        inOrderTraversal(n.right);
    }
}