public class RemoveElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 5, 1};
        int key = 1;

        // Create a temporary array to store elements that are not equal to key
        int[] temp = new int[array.length];
        int j = 0;  // index for temp array

        // Copy elements except the one to remove
        for (int i = 0; i < array.length; i++) {
            if (array[i] != key) {
                temp[j] = array[i];
                j++;
            }
        }

        // Create a new array with the filtered elements
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }

        // Display final array
        System.out.print("Final result: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
