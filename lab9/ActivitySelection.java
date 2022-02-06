import java.util.*;
public class ActivitySelection
{
    public static Scanner input;
    public static void printMaxActivities(int s[], int f[], int n)
    {
        int i, j;
        
        System.out.print("Following activities are selected : ");
        
        i = 0;
        System.out.print(i+" ");
        
        for (j = 1; j < n; j++)
        {
            if (s[j] >= f[i])
            {
                System.out.print(j+" ");
                i = j;
            }
        }
    }
      
    // driver program to test above function
    public static void main(String[] args)
    {
        input = new Scanner(System.in);  // Create a Scanner object for input
        System.out.println("Input number of activities N: (1 < N < 256): ");
        int N = input.nextInt();
        int s[] = new int[N];
        int f[] = new int[N];
        System.out.println("Input of pairs (S(i), F(i)): ");
        for (int i = 0; i < N; i++) {
            System.out.println("Input pair " + (i+1) + ": ");
            System.out.print("    x: ");
            int x = input.nextInt();
            System.out.print("    y: ");
            int y = input.nextInt();
            s[i] = x;
            f[i] = y;
        }

        printMaxActivities(s, f, s.length);
    }
     
}