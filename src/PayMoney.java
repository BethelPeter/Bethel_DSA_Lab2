import java.util.Scanner;

public class PayMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Take input from user for size and values of array
        System.out.print("Enter the size of transaction array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the values of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Step 2: Take input from user for number and values of targets
        System.out.print("Enter the total number of targets that need to be achieved: ");
        int numTargets = sc.nextInt();
        for (int i = 0; i < numTargets; i++) {
            System.out.print("Enter the value of target: ");
            int target = sc.nextInt();
            
            // Step 3: Loop through each target and calculate sum of transactions until sum >= target
            int sum = 0;
            int numTransactions = 0;
            while (sum < target && numTransactions < n) {
                sum += arr[numTransactions];
                numTransactions++;
            }
            
            // Step 4: Output number of transactions it took to achieve target
            if (sum >= target) {
                System.out.println("Target achieved after " + numTransactions + " transactions");
            } else {
                System.out.println("Target not achieved");
            }
        }
    }
}
