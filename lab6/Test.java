import java.util.*;

public class Test {
    public static Scanner input;
    public static void main(String[] args)
    {
        input = new Scanner(System.in);  // Create a Scanner object for input
        System.out.print("Input number of vertices and edges N: (1 < N < 256): ");
        int N = input.nextInt();

        System.out.print("Input number of pairs to input (M): (M < 256): ");
        int M = input.nextInt();

        Graph graph = new Graph();

        ArrayList<ArrayList<Integer> > adj 
                    = new ArrayList<ArrayList<Integer> >(N);
          
        for (int i = 0; i < N; i++)
            adj.add(new ArrayList<Integer>());

        System.out.println("Input pairs (x, y)...");
        ////
        int matrix[][] = new int[N][N];
        for (int[] row: matrix)
            Arrays.fill(row, 0);
        ///
        for (int i = 0; i < M; i++) {
            System.out.println("Pair " + (i+1) + ": ");
            System.out.print("  x: ");
            int x = input.nextInt();
            System.out.print("  y: ");
            int y = input.nextInt();
            graph.addEdge(adj, x, y);
            matrix[x][y] = 1;
        }
        System.out.println();
        System.out.println("Matrix: ");
        graph.printMatrix(matrix, N);
        graph.printGraph(adj);
        MST t = new MST(N);
        System.out.println();
        t.primMST(matrix);
    }
}
