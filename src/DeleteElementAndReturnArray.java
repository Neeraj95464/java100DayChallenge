import java.util.Arrays;

public class DeleteElementAndReturnArray
{
        public static void main(String[] args) {
            int[] originalArray = {1, 2, 3, 4, 5, 6};
            int elementToDelete = 3;

            System.out.println("Original Array: " + Arrays.toString(originalArray));

            int[] newArray = deleteElement(originalArray, elementToDelete);

            System.out.println("Array after deleting element " + elementToDelete + ": " + Arrays.toString(newArray));
        }

        static int[] deleteElement(int[] arr, int element) {
            // Count occurrences of the element in the original array
            int count = 0;
            for (int value : arr) {
                if (value == element) {
                    count++;
                }
            }

            // Create a new array with size reduced by the number of occurrences of the element
            int[] newArray = new int[arr.length - count];

            // Copy elements from the original array to the new array, excluding the specified element
            int newIndex = 0;
            for (int value : arr) {
                if (value != element) {
                    newArray[newIndex++] = value;
                }
            }

            return newArray;
        }
}
