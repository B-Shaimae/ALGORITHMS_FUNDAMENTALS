import java.util.*;
 
class Point
{
    int x, y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}
 
public class ConvexHull {
    public static Scanner input;
    public static int orientation(Point p, Point q, Point r)
    {
        int val = (q.y - p.y) * (r.x - q.x) -
                  (q.x - p.x) * (r.y - q.y);
      
        if (val == 0) return 0;
        return (val > 0)? 1: 2;
    }
     
    public static void convexHull(Point points[], int n)
    {
        if (n < 3) return;
    
        Vector<Point> hull = new Vector<Point>();
        int l = 0;
        for (int i = 1; i < n; i++)
            if (points[i].x < points[l].x)
                l = i;
        int p = l, q;
        do
        {
            hull.add(points[p]);

            q = (p + 1) % n;
             
            for (int i = 0; i < n; i++)
            {
               if (orientation(points[p], points[i], points[q])== 2)q = i;
            }
            p = q;
      
        } while (p != l); 
      
        for (Point temp : hull)
            System.out.println("(" + temp.x + ", " +
                                temp.y + ")");
    }

    public static void main(String[] args)
    {
        input = new Scanner(System.in);  // Create a Scanner object for input
        System.out.print("Input number points N: (1 < N < 256): ");
        int N = input.nextInt();

        Point points[] = new Point[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Input point " + (i+1) + ": ");
            System.out.print("  x: ");
            int x = input.nextInt();
            System.out.print("  y: ");
            int y = input.nextInt();
            points[i]=new Point(x, y);
        }
        System.out.println("Points of the convex hull:");
        convexHull(points, points.length);
        
    }
}
