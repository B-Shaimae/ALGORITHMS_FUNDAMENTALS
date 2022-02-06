public class Node {

    int data;
    Node left;
    Node right;
    char colour;
    Node parent;
 
    Node(int data)
    {
        super();
        this.data = data;
        this.left = null; // left subtree
        this.right = null; // right subtree
        this.colour = 'R'; //'R' --red or 'B' --black
        this.parent = null;
    }
}
