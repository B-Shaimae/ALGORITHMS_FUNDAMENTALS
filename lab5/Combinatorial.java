import java.util.*;
import java.io.*;

public class Combinatorial {
    public static Scanner input;
    //  ----- Random number generators -----
    static void linearCongruentialMethod(int N, int m, int a, int c,int[] randomNums, int noOfRandomNums)
    {
        randomNums[0] = N;
        for(int i = 1; i < noOfRandomNums; i++)
        {
            randomNums[i] = ((randomNums[i - 1] * a) + c) % m;
        }
    }
    //  ----- Graphical representations in file-----
    public static void storeInFile(int[] arr) {
        File file = new File("random.txt");
        try {
            if(!file.exists()){
                file.createNewFile();
            }else{
                file.delete();
                file.createNewFile();
            }
            String content = "X | ";
            for(int i = 0; i < arr.length; i++){
                content += i + " | ";
            }
            content += "\nY | "; 
            for(int i = 0; i < arr.length; i++){
                content += arr[i] + " | ";
            }
            FileWriter myWriter = new FileWriter("random.txt");
            myWriter.write(content);
            myWriter.close();
        } catch (Exception e) {
            System.out.println("Exeption: " + e);
        }
    }

    public static void main(String[] args) {
        input = new Scanner(System.in);  // Create a Scanner object for input
        System.out.print("Input numner N (seed value): (1 < N < 256): ");
        int N = input.nextInt(); // Seed value
        System.out.print("Input numner m (Modulus parameter): ");
        int m = input.nextInt();// Modulus parameter
        System.out.print("Input numner a (Multiplier term): ");
        int a = input.nextInt();// Multiplier term
        System.out.print("Input numner c (Increment term): ");
        int c = input.nextInt();// Increment term

        int noOfRandomNums = N;// Number of Random numbers
        // To store random numbers
        int[] randomNums = new int[noOfRandomNums];
        linearCongruentialMethod(N, m, a, c,randomNums,noOfRandomNums);
        // Print
        for(int i = 0; i < noOfRandomNums; i++)
        {
            System.out.print(randomNums[i] + " ");
        }
        storeInFile(randomNums);
    }
}
