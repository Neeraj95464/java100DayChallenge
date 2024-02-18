public class FindArraySortedOrNot {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 3, 7};
        boolean isSorted = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
