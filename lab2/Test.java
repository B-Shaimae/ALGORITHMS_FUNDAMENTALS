import java.util.Scanner;

public class Test {
    public static Scanner input;
    public static Scanner input2;
    public static void main(String[] args) {
        Hash ht = new Hash();
        ////////
        // ht.add("k1", "v1");
        // ht.add("k2", "v2");
        // System.out.println("size: " + ht.size());
        // System.out.println("K1 exist? : " + ht.contains("k1"));
        // System.out.println("K3 exist? : " + ht.contains("k3"));
        // System.out.println("K1 value: " + ht.get("k1"));
        ////////
        input = new Scanner(System.in); // Create a Scanner object
        input2 = new Scanner(System.in);
        System.out.print("Enter how many pairs to insert (N): ");
        int N = input.nextInt();
        for(int i = 1; i <= N; i++){
            System.out.println("Inserting pair number " + i + " ... ");
            System.out.print("Enter key: ");
            String key = input2.nextLine();
             //input value is a string and the program will calculate  remainder of characters sum. 
            System.out.print("Enter value: "); 
            String value = input2.nextLine();
            ht.add(key, value);
        }
        System.out.println("size: " + ht.size());
        System.out.print(ht);
    }
}
