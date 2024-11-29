import java.util.Scanner;

public class SortSelection {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array length: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int minIndex = 0;
        int temp;
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if (arr[k] < arr[minIndex]) {
                    minIndex = arr[k];
                }
            }
            // swap the smallest number
            temp = arr[j];
            arr[j] = arr[minIndex];
            arr[minIndex] = temp;
            // System.out.println("Min index in" + j + " round: " + minIndex);
            for (int l = 0; l < n; l++) {
                System.out.print(arr[l] + " ");
            }
            System.out.println("");
        }

        System.out.print("Printing the sorted array: ");
        for (int l = 0; l < n; l++) {
            System.out.print(arr[l] + " ");
        }

    }
}
