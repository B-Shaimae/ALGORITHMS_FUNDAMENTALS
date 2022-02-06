import java.util.Scanner;

public class Test {
    public static Scanner input;
    public static void main(String[] args) {
        CircularList cl = new CircularList();
        input = new Scanner(System.in);
        System.out.print("Enter how many numbers to insert (1 < N < 256): ");
        int lenght = input.nextInt();

        if(lenght > 1){
            for(int i = 0; i < lenght; i++){
                System.out.print("Input number " + (i+1) + ": ");
                int number = input.nextInt();
                cl.add(number);
            }
            int size  = cl.size();
            System.out.println("Number of elements: "+ size);
            System.out.println("Average: " + cl.average());
            System.out.println("Maximum element: " + cl.max());
            System.out.println("Minimum element: " + cl.min());
            System.out.println("Fourth element: " + cl.get(3));
            System.out.println("Element before minimum: " + cl.get(cl.getMinIndex(cl.min()) - 1));
        }else{
            System.out.print("length of numbers must be more than 1 (N > 1).");
        }
    }
}
