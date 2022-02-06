import java.util.Scanner;

public class Test {
    public static Scanner input;
    public static void main(String[] args)
    {
        RedBlackTree tree = new RedBlackTree();
        input = new Scanner(System.in);  // Create a Scanner object for input
        System.out.print("Enter how many numbers to insert in tree (1 < N < 256): ");
        int lenght = input.nextInt();
        ////int[] arr = {1,4,6,3,5,7,8,2,9};
        for(int i = 0; i < lenght; i++)
        {
            System.out.print("Input number " + (i+1) + ": ");
            int number = input.nextInt();
            tree.insert(number);
            System.out.println();
            // tree.inorderTraversal();
            tree.Max(tree.root);
            System.out.println("    MAX: " + tree.max.data + " Color: " + tree.max.colour);
        }
        
        tree.printTree();
    }
}
