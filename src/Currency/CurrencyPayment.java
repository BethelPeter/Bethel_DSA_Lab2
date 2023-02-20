package Currency;
import java.util.*;

public class CurrencyPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input from the user for the number of currency denominations and the values of each denomination
        System.out.print("Enter the size of currency denominations: ");
        int numDenominations = sc.nextInt();
        int[] denominations = new int[numDenominations];
        System.out.print("Enter the currency denominations value: ");
        for (int i = 0; i < numDenominations; i++) {
            denominations[i] = sc.nextInt();
        }

        // Step 2: Take input from the user for the payment amount
        System.out.print("Enter the amount you want to pay: ");
        int amount = sc.nextInt();

        // Step 3: Sort the currency denominations in descending order
        Arrays.sort(denominations);
        int[] sortedDenominations = new int[numDenominations];
        for (int i = 0; i < numDenominations; i++) {
            sortedDenominations[i] = denominations[numDenominations - i - 1];
        }

        // Step 4: Loop through the currency denominations and subtract the largest denomination that is less than or equal to the remaining payment amount
        int[] paymentNotes = new int[numDenominations];
        for (int i = 0; i < numDenominations; i++) {
            if (sortedDenominations[i] <= amount) {
                paymentNotes[i] = amount / sortedDenominations[i];
                amount %= sortedDenominations[i];
            }
        }

        // Step 5: Output the denominations that were used to make the payment in descending order
        System.out.println("Your payment approach in order to give minimum number of notes will be:");
        for (int i = numDenominations - 1; i >= 0; i--) {
            if (paymentNotes[i] > 0) {
                System.out.println(sortedDenominations[i] + ":" + paymentNotes[i]);
            }
        }
    }
}
