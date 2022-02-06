import java.util.Scanner;

public class Sort {
    public static Scanner input;

    public static void heapSort (int arr[])
    {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    public static void main(String args[])
    {
        input = new Scanner(System.in);  // Create a Scanner object for input
        System.out.print("Enter how many numbers to insert: (1 < N < 256): ");
        int length = input.nextInt();
        if(length > 1 && length < 256){
            int arr[] = new int[length];
            for(int i=0; i < length; i++){
                System.out.print("Input number " + (i+1) + ": ");
                int number = input.nextInt();
                arr[i] = number;
            }
            heapSort(arr);

            System.out.println("Sorted array is: ");
            printArray(arr);
        }else{
            System.out.print("length of numbers must be more than 1 and greater than 256 (1 < N < 256).");
        }
        
    }
}
