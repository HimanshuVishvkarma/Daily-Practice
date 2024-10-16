public class BubbleSort {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // Printing array after each pass
        }
                    for (int p = 0; p < arr.length; p++) {
                System.out.print(arr[p] + " ");
            }
            System.out.println();

    }

    public static void main(String args[]) {
        int arr[] = {3, 5, 4, 1, 2};
        sort(arr); 
    }
}
