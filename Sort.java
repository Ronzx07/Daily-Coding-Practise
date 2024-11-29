// WAP to sort the elements in asending order 

// practising bubble sort
import java.util.Scanner;

public class Sort {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            System.out.println("Enter n: ");
            n = sc.nextInt();

            int arr[] = new int[n];
            System.out.println("Input the numbers: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int temp;
            for (int j = 0; j < n - 1; j++) {
                for (int s = 0; s < n - j - 1; s++) {
                    if (arr[s] > arr[s + 1]) {
                        temp = arr[s];
                        arr[s] = arr[s + 1];
                        arr[s + 1] = temp;
                    }
                }
            }
            System.out.print("\n Sorted numbers: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + "   ");
            }
        }

        System.out.print("\n Byeee");
    }
}

/*
 * //Bubble Sort
 * import java.util.Scanner;
 * 
 * class Sort {
 * public static void main(String args[]) {
 * try (Scanner x = new Scanner(System.in)) {
 * // INPUT THE NO OF ELEMENTS
 * int n;
 * System.out.println("Enter your no. of elements: ");
 * n = x.nextInt();
 * 
 * // INPUT THE LIST THAT NEED TO BE SORTED
 * int list[] = new int[n];
 * System.out.println("Enter the numbers to sort: ");
 * for (int i = 0; i < n; i++) {
 * list[i] = x.nextInt();
 * }
 * 
 * // BUBBLE SORT
 * int temp;
 * for (int j = 0; j < n - 1; j++) {
 * System.out.println(j + " round");
 * for (int k = 0; k < n - j - 1; k++) {
 * // doubt in the statement k<n-j
 * // n = 5
 * // j 0 k0 k1 k2 k3 k4
 * // j 1 k0 k1 k2 k3
 * // j 2 k0 k1 k2
 * // j 3 k0 k1
 * 
 * if (list[k] > list[k + 1]) {
 * // swap logic
 * temp = list[k + 1];
 * list[k + 1] = list[k];
 * list[k] = temp;
 * System.out.println("swapping: " + list[k] + " with " + list[k + 1]);
 * }
 * 
 * }
 * }
 * 
 * // Print the result
 * System.out.print("Sorted list of elements : ");
 * for (int l = 0; l < n; l++) {
 * System.out.print(list[l] + "    ");
 * }
 * }
 * 
 * System.out.println("Byeeee");
 * 
 * }
 * }
 */
/*
 * Sample to understand
 * Enter your no. of elements:
 * 11
 * Enter the numbers to sort:
 * 10 9 8 7 6 5 4 3 2 1 0
 * 0 round
 * swapping: 9 with 10
 * swapping: 8 with 10
 * swapping: 7 with 10
 * swapping: 6 with 10
 * swapping: 5 with 10
 * swapping: 4 with 10
 * swapping: 3 with 10
 * swapping: 2 with 10
 * swapping: 1 with 10
 * swapping: 0 with 10
 * 1 round
 * swapping: 8 with 9
 * swapping: 7 with 9
 * swapping: 6 with 9
 * swapping: 5 with 9
 * swapping: 4 with 9
 * swapping: 3 with 9
 * swapping: 2 with 9
 * swapping: 1 with 9
 * swapping: 0 with 9
 * 2 round
 * swapping: 7 with 8
 * swapping: 6 with 8
 * swapping: 5 with 8
 * swapping: 4 with 8
 * swapping: 3 with 8
 * swapping: 2 with 8
 * swapping: 1 with 8
 * swapping: 0 with 8
 * 3 round
 * swapping: 6 with 7
 * swapping: 5 with 7
 * swapping: 4 with 7
 * swapping: 3 with 7
 * swapping: 2 with 7
 * swapping: 1 with 7
 * swapping: 0 with 7
 * 4 round
 * swapping: 5 with 6
 * swapping: 4 with 6
 * swapping: 3 with 6
 * swapping: 2 with 6
 * swapping: 1 with 6
 * swapping: 0 with 6
 * 5 round
 * swapping: 4 with 5
 * swapping: 3 with 5
 * swapping: 2 with 5
 * swapping: 1 with 5
 * swapping: 0 with 5
 * 6 round
 * swapping: 3 with 4
 * swapping: 2 with 4
 * swapping: 1 with 4
 * swapping: 0 with 4
 * 7 round
 * swapping: 2 with 3
 * swapping: 1 with 3
 * swapping: 0 with 3
 * 8 round
 * swapping: 1 with 2
 * swapping: 0 with 2
 * 9 round
 * swapping: 0 with 1
 * Sorted list of elements : 0 1 2 3 4 5 6 7 8 9 10 Byeeee
 */